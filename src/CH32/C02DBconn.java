package CH32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class C02DBconn {
	
	//tbl_customer에 id가 2인행의 name = 'SeoGiDong',addr = 'ulsan', phone = 'none'으로 수정하세요
	//tnl_customer에 id가 3인행을 삭제 합니다.
	
	

	public static void main(String[] args) {
		
		//연결관련 정보 저장용 변수
		String id = "SYSTEM";		// DB 연결 id
		String pw = "1234";		// DB 연결 pw
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//연결 URL(DBMS마다 상이함)
		
		//DB연결객체 관련 참조 변수
		Connection conn = null;				//DB연결객체용 참조변수
		PreparedStatement pstmt  = null;	//SQL쿼리 전송객체용 참조변수
		ResultSet rs = null;				//쿼리결과(Select결과) 수신용 참조변수
			
		//연결하기
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	//DB드라이버 로드
			System.out.println("Driver Loading Success!!");
			conn = DriverManager.getConnection(url,id,pw);	//DB Connection 객체 받기
			System.out.println("DB Connected...");
			pstmt = conn.prepareStatement("insert into a_tbl values(a_tbl_seq.NEXTVAL, ?, ?)");
			pstmt.setString(1, "홍길동");		//이름
			pstmt.setString(2, "대구대구"); 	//주소
			int result =  pstmt.executeUpdate();
			if(result != 0) 
			{
			System.out.println("INSERT 성공");
			}else{
				System.out.println("INSERT 실패");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally 
		{
			try {pstmt.close();}catch (Exception e) {e.printStackTrace();}
			try {conn.close();}catch (Exception e) {e.printStackTrace();}
		}
		
		
		
	}
//	//Update 쓰는 법
//	pstmt = conn.prepareStatement("update tbl_customer set addr = ? where id = ?");
//	pstmt.setString(1, "마산");
//	pstmt.setInt(2,3);
//	
//	//Delete
//	pstmt = conn.prepareStatement("delete tbl_customer where id = ?");
//	pstmt.setInt(1, 5);
//	

	

}
