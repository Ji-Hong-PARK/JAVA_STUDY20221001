package CH32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class C03DBUpdate {

	public static void main(String[] args) {
		//연결관련 정보 저장용 변수
		String id = "SYSTEM";	//DB연결 id
		String pw = "1234";	//DB연결 pw
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //연결URL(DBMS마다 상이함)

		//연결하기 try-with-resources(JAVA 7버전 이상)
		try 
		(
				Connection conn = DriverManager.getConnection(url,id,pw);
				PreparedStatement pstmt = conn.prepareStatement("update a_tbl set name = ? where no = ?");
		)
		{
			pstmt.setString(1, "정아무개"); //1번째 물음표, a_tbls의 name 값
			pstmt.setInt(2, 1);			// 2번째 물음표, a_tbl의 no 값
			
			int result = pstmt.executeUpdate();
			if(result!=0) {
				System.out.println("UPDATE 성공");
			}else {
				System.out.println("UPDATE 실패");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
