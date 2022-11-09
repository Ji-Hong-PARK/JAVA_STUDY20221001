package CH38.Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class MemberDAO {

	// 연결관련 정보 저장용 변수
	String id = "root"; // DB연결 id
	String pw = "1234"; // DB연결 pw
	String url = "jdbc:mysql://localhost:3306/libdb"; // 연결URL(DBMS마다 상이함)

	// DB연결객체 관련 참조변수
	Connection conn = null; // DB연결객체용 참조변수
	PreparedStatement pstmt = null; // SQL쿼리 전송객체용 참조변수
	ResultSet rs = null; // 쿼리결과(Select결과)수신용 참조변수

	//싱글톤 패턴 코드 추가
	private static MemberDAO instance;
	public static MemberDAO getInstance() {
		if(instance==null);
			instance = new MemberDAO();
		return instance;
	}
	
	private MemberDAO() {
		// CONN객체 연결
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("Connected...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//전체 조회하기
	//선택 조회하기

	//등록하기
	public int Insert(MemberDTO dto) {
		//pstmt
		int result=0;
		try {
			pstmt = conn.prepareStatement("insert into tbl_member values(?,?)");
			pstmt.setString(1, dto.getMemid());
			pstmt.setString(2, dto.getPwd());
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	//수정하기
	//삭제하기
	
	
	
	
}