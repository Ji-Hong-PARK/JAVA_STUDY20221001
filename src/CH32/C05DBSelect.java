package CH32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C05DBSelect {


	public static void main(String[] args) {
		//연결관련 정보 저장용 변수
		String id = "root";	//DB연결 id
		String pw = "1234";	//DB연결 pw
		String url = "jdbc:mysql://localhost:3306/testdb"; //연결URL(DBMS마다 상이함)

		//DB연결객체 관련 참조변수
		Connection conn = null;						//DB연결객체용 참조변수
		PreparedStatement pstmt = null;				//SQL쿼리 전송객체용 참조변수
		ResultSet rs = null;						//쿼리결과(Select결과)수신용 참조변수
		
		//연결하기
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			//DB 드라이버 로드
			System.out.println("Driver Loading Success!!");
			conn = DriverManager.getConnection(url,id,pw); 		//DB Connection 객체 받기
			System.out.println("DB Connected...");

			
			// 데이터 가져와서 불러오기!
			pstmt = conn.prepareStatement("select 분류,상호,도로명주소 from tbl_meme");
			//pstmt = conn.prepareStatement("select * from tbl_meme"); 모든 값을 가져온다. while문에다 추가로 적으면 출력된다.
			rs = pstmt.executeQuery();
			if(rs != null)
			{
				while(rs.next())
				{
					System.out.println(rs.getString("분류") + " ");
									//(rs.getString(1) + " "); 이렇게 써도된다.
					System.out.println(rs.getString("상호") + " ");
					System.out.println(rs.getString("도로명주소") + " \n");	
				}
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
			try{rs.close();}catch(Exception e) {e.printStackTrace();}	// rs. 를 닫아준다.
			try{pstmt.close();}catch(Exception e) {e.printStackTrace();}
			try{conn.close();}catch(Exception e) {e.printStackTrace();}
		}
		
	}

}
