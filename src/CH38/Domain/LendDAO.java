package CH38.Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

		public class LendDAO {
		// 연결관련 정보 저장용 변수
		String id = "root"; // DB연결 id
		String pw = "1234"; // DB연결 pw
		String url = "jdbc:mysql://localhost:3306/libdb"; // 연결URL(DBMS마다 상이함)

		// DB연결객체 관련 참조변수
		Connection conn = null; // DB연결객체용 참조변수
		PreparedStatement pstmt = null; // SQL쿼리 전송객체용 참조변수
		ResultSet rs = null; // 쿼리결과(Select결과)수신용 참조변수

		//싱글톤 패턴 코드 추가
		private static LendDAO instance;
		public static LendDAO getInstance() {
			if(instance==null);
				instance = new LendDAO();
			return instance;
		}
		
		private LendDAO() {
			// CONN객체 연결
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(url, id, pw);
				System.out.println("Connected...");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 대여처리(트랜잭션 처리 X)
		public int Insert(LendDTO dto) {
			//pstmt
			int result=0;
			try {
				//throw new SQLException(); //SQL 예외 발생!!!		
				pstmt = conn.prepareStatement("insert into tbl_Lend values(null,?,?,?,?)");
				pstmt.setInt(1, dto.getBookcode());
				pstmt.setString(2, dto.getMemid());
				pstmt.setString(3, dto.getStarDate());
				pstmt.setString(4, dto.getEndDate());
				result = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
		}
		
		//트랜잭션 처리 O
		public int Insert(BookDTO bdto, LendDTO ldto) {
			//pstmt
			int result=0;
			try {
				conn.setAutoCommit(false);
				//tbl_book 의 도서정보 수정
				pstmt = conn.prepareStatement("update tbl_book set bookname=?,isLend=? where bookcode=?");
				pstmt.setString(1, bdto.getBookname());
				if(bdto.isLend())	//true - 대여가능
					pstmt.setInt(2, 1);	//1값을 넣음
				else				//false - 대여불가
					pstmt.setInt(2, 0);	//0값을 넣음
				pstmt.setInt(3, bdto.getBookCode());
				result = pstmt.executeUpdate();
				
				
				
				// tbl_lend 의 대여정보 추가
				pstmt = conn.prepareStatement("insert into tbl_Lend values(null,?,?,?,?)");
				pstmt.setInt(1, ldto.getBookcode());
				pstmt.setString(2, ldto.getMemid());
				pstmt.setString(3, ldto.getStarDate());
				pstmt.setString(4, ldto.getEndDate());
				result = pstmt.executeUpdate();

				conn.commit();
				//throw new SQLException(); //SQL 예외 발생 상황극 위에 대여정보를 주석하고!!!
				
			} catch (SQLException e) {
				e.printStackTrace();
				try {
					conn.rollback();
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
			return result;
		}
		// 반납처리
		
		
}
