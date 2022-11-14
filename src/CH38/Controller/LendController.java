package CH38.Controller;

import CH38.Domain.DTO;
import CH38.Domain.LendDTO;
import CH38.Service.LendService;

public class LendController implements SubController {
	
	LendService service = LendService.getInstancs(); 
	
	//1번 대여 2번 반납
	@Override
	public Object excute(int SN, DTO dto) {
			
		Object r = null;
		
		switch (SN) {
		case 1: //대여
			LendDTO down = (LendDTO)dto;
			boolean result = service.Lendbook(down);
			if(result) {
				r = "대여성공 !";//이걸 오브젝트로 보내야한다,
			}else {
				r = "대여실패 !";
			}
			break;
			
		case 2:
			
			break;
			
		case 3:
			
			break;
			
		default:
			
			break;
		}
		
		return r; //뷰로 전달됨.
		
	}

}
