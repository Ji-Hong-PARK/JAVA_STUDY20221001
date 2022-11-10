package CH38.Controller;

import CH38.Domain.DTO;
import CH38.Domain.MemberDTO;
import CH38.Service.AuthService;

public class AuthController implements SubController {
	private AuthService service = AuthService.getInstancs(); //어스서비스 연결하기.
	
	@Override
	public Object excute(int SN, DTO dto) { //파라미터를 받음 dto로 받음.

		//1 로그인  2 로그아웃 	3 권한검증...
		
		//1)파라미터 받기
		//2) 입력값 점증(Validation)
		//3) 서비스 요청
		//4) View 전달
		
		switch (SN) {
		case 1:
			MemberDTO down = (MemberDTO)dto; //다운캐스팅으로 받는다
			String id = down.getMemid();
			String pwd = down.getPwd();
			if(id != null && pwd != null) {
				return service.LoginCheck(id, pwd); // null or role(아이디나 패스워드가 일치하지 않을때)값을 반환.
			}
			break;
		case 2:
			
			break;
		case 3:
			
			break;

		default:
			
			break;
		}
		return null;
	}

}
