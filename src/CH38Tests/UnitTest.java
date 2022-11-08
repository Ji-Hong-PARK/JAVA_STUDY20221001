package CH38Tests;

import CH38Domain.BookDTO;
import CH38Service.BookService;

public class UnitTest {

	public static void main(String[] args) {
		
		
		// DAO Tests
//		BookDAO dao = new BookDAO.getInstance();
//		boolean flag = dao.Insert(new BookDTO(1000,"자바의정석"));
//		if(flag) {
//			System.out.println("INSERT 성공!");
//		}
		
		
		//Service Tests
		BookService service = new BookService();
		//boolean flag = service.RegisterBook(new BookDTO(2020, "윤성우C언어"), 0); //권한은 3이상일때만 허용하겠다! 실패..
		boolean flag = service.RegisterBook(new BookDTO(2020, "윤성우C언어"), 3); //권한은 3이상일때만 허용하겠다! 성공!
		if(flag) {
			System.out.println("Register Book 성공!");
		}
		else {
			System.out.println("Register Book 실패!");
		}
		
	}

}
