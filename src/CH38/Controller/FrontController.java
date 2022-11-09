package CH38.Controller;

import java.util.HashMap;
import java.util.Map;

import CH38.Domain.DTO;

public class FrontController {

	// 요청 정보 - 하위컨트롤러 Mapping 저장필요
	private Map<String, SubController> map = new HashMap(); // key , value 값 받기.
	
	//생성자실행시 init함수 호출
	public FrontController() {
		init();// init() 함수가 없어서 밑에다 만들어준다.
	}
	//요청 서비스별 처리 Controller 를 저장 보관 하기위한 함수.
	private void init() {
		map.put("/Member", new MemberController());
		map.put("/book", new BookController());
	}
	
	//사용자로부터(엑터) 요청서비스명, SN(서비스번호)를 찾아서 요청처리 Controller를 실행.
	public Object ExSubController(String menu, int SN, DTO dto) { //ExSubController = excuteSubController
	
		//서비스 선별
		SubController sub =  map.get(menu);
		//SN 전달 execute
		Object obj = sub.excute(SN, dto); //1,2,3,4,ㄷㅅㅊ...
		
		
		return obj;
	}
	
}
