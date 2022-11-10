package CH38.Service;

import CH38.Domain.MemberDAO;
import CH38.Domain.MemberDTO;

public class MemberService {

	MemberDAO dao = MemberDAO.getInstance();
	
	//인증서비스에 필요한 함수를써줘야한다.
	
	//싱글톤 패턴 코드 추가
	private static MemberService instance;
	public static MemberService getInstancs() {
		if(instance == null)
			instance = new MemberService();
		return instance;
	}
	
	private MemberService() {} //프라이빗 넣기! 인스턴스를 하면.
	
	
	//멤버 등록하기
	public boolean RegisterMember(MemberDTO dto) {
		int result = dao.Insert(dto);
			if(result>0) 
				return true;
			return false;	
		}

	
}
