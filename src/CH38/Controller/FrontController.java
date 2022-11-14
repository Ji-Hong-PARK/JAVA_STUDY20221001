package CH38.Controller;

import java.util.HashMap;
import java.util.Map;

import CH38.Domain.DTO;

public class FrontController {

	//요청정보-하위컨트롤러 Mapping 저장필요
	private Map<String,SubController> map = new HashMap();
	
	//생성자 실행시 init함수 호출
	public FrontController(){
		init();
	}
	
	//요청 서비스별 처리 Controller를 저장 보관 하기위한 함수
	private void init() {
		map.put("/member", new MemberController());
		map.put("/book",new BookController());
		map.put("/auth", new AuthController());
		map.put("/lend", new LendController());
	}
	
	//사용자로부터 요청서비스명,서비스번호(SN)를 받아 요청처리 Controller를 실행
	public Object ExSubController(String menu,int SN,DTO dto) {
		
		//서비스 선별
		SubController sub =  map.get(menu);	
		//SN 전달 execute
		Object obj =  sub.excute(SN,dto);//1,2,3,4,etc..
		
		return obj;
	}

	
	
}
