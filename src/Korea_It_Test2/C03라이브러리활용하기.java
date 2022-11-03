package Korea_It_Test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C03라이브러리활용하기 {

	public static void main(String[] args) {
		//연결관련 정보
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/tempdb";
		String user = "root";
		String pwd = "1234";
		
		//연결객체 참조변수
		String sql = "SELECT * from student_tbl";	//sql임시저장
		Connection conn = null;						//DB연결용
		PreparedStatement pstmt = null;				// sql문 명령 전달용
		ResultSet rs = null;						// sql 결과문 저장용

		try
		{
			//드라이브 적재
			Class.forName(driver);
			System.out.println("Driver Loading Success");
			//Connection 객체 생성 conn에 연결
			conn = DriverManager.getConnection(url,user,pwd);
			System.out.println("DB Connected..");
			
			//pstmt에 적절한 객체 연결
			pstmt = conn.prepareStatement(sql);
			//rs에 적절한 객체 연결
			rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				System.out.print(rs.getString("id") + " ");
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getString("age") + " ");
				System.out.print(rs.getString("addr") + " ");
				System.out.println();
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}

