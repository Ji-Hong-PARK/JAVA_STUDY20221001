package CH38.Service;

import CH38.Domain.MemberDAO;
import CH38.Domain.MemberDTO;

public class AuthService {

	MemberDAO dao = MemberDAO.getInstance();
	
	//인증서비스에 필요한 함수를써줘야한다.
	
	//싱글톤 패턴 코드 추가
	private static AuthService instance;
	public static AuthService getInstancs() {
		if(instance == null)
			instance = new AuthService();
		return instance;
	}
	
	private AuthService() {} //프라이빗 넣기! 인스턴스를 하면.
	
	
	//멤버 등록하기
	public boolean RegisterMember(MemberDTO dto) {
		int result = dao.Insert(dto);
			if(result>0) 
				return true;
			return false;	
		}
	// (ID / PW 인증 이후 Role 전달)
	public Integer LoginCheck(String id, String pwd) {
		
		MemberDTO dto = null;
		dto = dao.Select(id);
		if(dto == null) {
			return null;
		}
		// 셀렉트해서 ID일치 PW 일치여부 확인
		if(id.equals(dto.getMemid()) && pwd.equals(dto.getPwd()))
		{
			return dto.getRole();
		}
		//Role 반환( 1 or 2 or Null 값으로 반환된다)  // 권한값이다.
		return null;
	}
	
	

	
}
