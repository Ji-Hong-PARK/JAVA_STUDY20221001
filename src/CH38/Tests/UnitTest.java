package CH38.Tests;

import CH38.Controller.AuthController;
import CH38.Controller.FrontController;
import CH38.Domain.MemberDAO;
import CH38.Domain.MemberDTO;
import CH38.Service.AuthService;
import CH38.Service.MemberService;

public class UnitTest {

	public static void main(String[] args) {
		
		
		// DAO Tests
//		BookDAO dao = new BookDAO.getInstance();
//		boolean flag = dao.Insert(new BookDTO(1000,"자바의정석"));
//		if(flag) {
//			System.out.println("INSERT 성공!");
//		}
		
		
		//Service Tests
//		
//		BookService service = new BookService();
//		//boolean flag = service.RegisterBook(new BookDTO(2020, "윤성우C언어"), 0); //권한은 3이상일때만 허용하겠다! 실패..
//		boolean flag = service.RegisterBook(new BookDTO(2020, "윤성우C언어"), 3); //권한은 3이상일때만 허용하겠다! 성공!
//		if(flag) {
//			System.out.println("Register Book 성공!");
//		}
//		else {
//			System.out.println("Register Book 실패!");
//		}
		
		
		//MemberDAO Tests
//		MemberDAO dao = MemberDAO.getInstance();
//		int result = dao.Insert(new MemberDTO("mem1", "1111"));
//		if(result > 0) {
//			System.out.println("INSERT 성공!");
//		}
//		else {
//			System.out.println("INSERT 실패!");
//		}
		
		
		
//		//FrontController
//		FrontController controller = new FrontController();
//		//controller.ExSubController("/member", 2);
//		//도서 등록(메뉴,SN(1),책(DTO))
//		Object obj = controller.ExSubController("/book", 1, new BookDTO(5050, "왜이리어렵나?")); // 1,2,3,4,etc 등 받는다.
//		if(obj != null) {
//			System.out.println("[View] " + obj.toString());
//		}else {
//			System.out.println("[View] " + obj.toString());
//		}
//		//위에 컨트롤러를 뷰로 옮기자.
		
//		//중간 확인
//		MemberDAO dao = MemberDAO.getInstance();
//		MemberDTO dto = dao.Select("mem1");
//		System.out.println("DTO : " + dto);
		
		//한번더 확인 관리자와 회원이되어있는지
//		AuthService service = AuthService.getInstancs();
//		Integer result = service.LoginCheck("mgr1", "211");
//		if(result != null) {
//			System.out.println("[View] 로그인 성공! ROLE : "+ result);
//		}else {
//			System.out.println("[View] 로그인 실패!..");
//		}
		
		FrontController controller = new FrontController();
		
		//서비스 요청, 요청번호, DTO
		//Integer result = (Integer)controller.ExSubController("/auth", 1, new MemberDTO("mea", "1111"));
		//Integer result = (Integer)controller.ExSubController("/auth", 1, new MemberDTO("mgr1", "1111"));
		Integer result = (Integer)controller.ExSubController("/auth", 1, new MemberDTO("mem1", "1111"));
		if(result == null) {
			System.out.println("[View] 로그인 실패...");
		}else {
			System.out.println("[View] 로그인 성공! ROLE : " + result);
		}
		
	}

}
