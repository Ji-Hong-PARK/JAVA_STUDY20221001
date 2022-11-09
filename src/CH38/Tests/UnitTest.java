package CH38.Tests;

import CH38.Controller.FrontController;
import CH38.Domain.BookDTO;

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
		
		
		
		//FrontController
		FrontController controller = new FrontController();
		//controller.ExSubController("/member", 2);
		//도서 등록(메뉴,SN(1),책(DTO))
		Object obj = controller.ExSubController("/book", 1, new BookDTO(4040, "MVC2ㅜㅜ")); // 1,2,3,4,etc 등 받는다.
		if(obj != null) {
			System.out.println("[View] " + obj.toString());
		}else {
			System.out.println("[View] " + obj.toString());
		}
		//위에 컨트롤러를 뷰로 옮기자.
		
		
		
		
		
	}

}
