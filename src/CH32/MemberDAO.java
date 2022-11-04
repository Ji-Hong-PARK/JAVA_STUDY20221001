package CH32;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	//연결 정보 저장
	
	//연결관련 정보 저장용 변수
	String id = "SYSTEM";		// 오라클DB 연결 id
	String pw = "1234";		// DB 연결 pw
	String url = "jdbc:oracle:thin:@localhost:1521:xe";//연결 URL(오라클용)
	
	//DB연결객체 관련 참조 변수
	Connection conn = null;				//DB연결객체용 참조변수
	PreparedStatement pstmt  = null;	//SQL쿼리 전송객체용 참조변수
	ResultSet rs = null;				//쿼리결과(Select결과) 수신용 참조변수
///////////////////////////////////맴버변수///////////////////////////////////////

	MemberDAO(){
		// CONN 객체 연결
		try {		
		conn = DriverManager.getConnection(url,id,pw);
		System.out.println("Connected....");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//멤버 가입하기
	//boolean Insert(이메일, 주소, 연락처) {DB 저장하기;}
	boolean Insert(String email, String addr, String phone)
	{
		int result = 0;
		try {
		pstmt = conn.prepareStatement("insert into tbl_member values(member_seq.NEXTVAL,?,?,?)");
		pstmt.setString(1, email);
		pstmt.setString(2, addr);
		pstmt.setString(3, phone);
		result = pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
		}
		
		if(result > 0)
		{
			return true;
		}
		return false;
	}
	
	
	boolean Insert(MemberDTO dto)
	{
		int result = 0;
		try {
		pstmt = conn.prepareStatement("insert into tbl_member values(member_seq.NEXTVAL,?,?,?)");
		pstmt.setString(1, dto.getEmail());
		pstmt.setString(2, dto.getAddr());
		pstmt.setString(3, dto.getPhone());
		result = pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
		}
		
		if(result > 0)
		{
			return true;
		}
		return false;
	}
	
	//멤버 수정하기
	//boolean Update(이메일, 주소, 연락처) {DB 수정하기;}
	
	//멤버 삭제하기
	//boolean Delete(이메일) {DB 삭제하기;}
	//멤버 조회하기
	//boolean Search(이메일) {DB 조회하기;}
	
	// 전체 조회하기
	
	//멤버 수 확인하기
	//자원 연결 해제하기
	
	
}
