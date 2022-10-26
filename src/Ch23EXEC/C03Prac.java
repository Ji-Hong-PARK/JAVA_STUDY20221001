package Ch23EXEC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C03Prac {

	//자유롭게 csv 파일을 받아서 mysqldb 안의 테이블로 변환후 
	//jdbc와 select 구문을 이용해서 java로 확인해보세요
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연결관련 정보 저장용 변수
				String id = "root";	//DB연결 id
				String pw = "1234";	//DB연결 pw
				String url = "jdbc:mysql://localhost:3306/motorcycledb"; //연결URL(DBMS마다 상이함)

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
				
					
	
				// 데이터 불러오기
					pstmt = conn.prepareStatement("select * from 제주특별자치도_전기이륜차보급대상차종현황_20220729");
					rs = pstmt.executeQuery();
					if(rs != null)
					{
						while(rs.next())
						{
							System.out.println("구분     		: " + rs.getString(1) + " ");
							System.out.println("제조 수입사명 	: " + rs.getString(2) + " ");
							System.out.println("차종 		: " + rs.getString(3) + " ");
							System.out.println("가중연비 		: " + rs.getDouble(4) + " ");
							System.out.println("배터리용량	  	: " + rs.getDouble(5) + " ");
							System.out.println("가중 등판 		: " + rs.getDouble(6) + " ");
							System.out.println("보조금액지원액 	: " + rs.getInt(7) + " ");
							System.out.println("데이터 기준일자 	: " + rs.getString(8) + " \n");
						}
					}
				// 수정을 하는데 실패할경우  롤백 을 한다.
					conn.setAutoCommit(false);	
					
					
//					//Update 쓰는 법
//					pstmt = conn.prepareStatement("update 제주특별자치도_전기이륜차보급대상차종현황_20220729"
//							+ " set name=? ,addr=?,phone=? where id = ?");
//					pstmt.setString(1, "SeoGilDong");
//					pstmt.setString(2, "ulsan");
//					pstmt.setString(3, "none");
//					pstmt.setInt(4,2);
//					
//					int result = pstmt.executeUpdate();
//					if(result!=0) {
//						System.out.println("INSERT 성공");
//					}else {
//						System.out.println("INSERT 실패");
//					}
//					
//					//Delete
//					pstmt = conn.prepareStatement("delete from 제주특별자치도_전기이륜차보급대상차종현황_20220729"
//							+ " where id = 3");
//					result = pstmt.executeUpdate();
//					if(result != 0) {
//						System.out.println("DELETE 성공");
//					}else {
//						System.out.println("DELETE 실패");
//					}
					
					conn.setAutoCommit(true);// commit 을 실행
					
					
					
					
		
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
				try
				{	// 롤백 받기위한  try문!  파이널리 전에 넣어야 한다.
					conn.rollback();
					System.out.println("rollback 됩니다.");
				}
				catch(Exception e1) 
				{
					e1.printStackTrace();
					}	
				
				finally 
				{
					try 
					{
						rs.close();
					}
					catch (Exception e) 
					{
						e.printStackTrace();
					}
					try 
					{
						pstmt.close();
					}
					catch (Exception e) 
					{
						e.printStackTrace();
					}
					try
					{
						conn.close();
					}
					catch (Exception e) 
					{
						e.printStackTrace();
					}
				}
	}

}
