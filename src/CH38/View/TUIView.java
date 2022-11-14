package CH38.View;

import java.util.List;
import java.util.Scanner;

import CH38.Controller.FrontController;
import CH38.Domain.BookDTO;
import CH38.Domain.MemberDTO;


public class TUIView {
	// 멤버
	private boolean Loginstate = false;
	private String userid = null;
	private Integer perm = 0; // 0 비회원 , 1 회원 2 관리자(사서)

	private FrontController controller = new FrontController();

	Scanner sc = new Scanner(System.in);
	int n = 0;

	TUIView() {
		mainview();
	}
	void mainview() {
		while (true) {
			System.out.println("-----------------M A I N---------------");
			System.out.println("1 도서전체 조회");
			System.out.println("2 도서대여 요청");
			System.out.println("3 도서등록");
			System.out.println("4 종료");
			System.out.println("-----------------M A I N---------------");
			System.out.print("번호 : ");
			n = sc.nextInt();
			switch (n) {
			case 1:
				List<BookDTO> list =(List<BookDTO>) controller.ExSubController("/book", 5, null);
				for(BookDTO dto : list) {
					System.out.println("[VIEW] " + dto);
				}
				break;
			case 2:
				//로그인 상태인지 확인
				if(!Loginstate) {
					loginview();
				}
				//권한이 맞는지
				
				break;
			case 3:
				break;
			case 4:
				System.out.println("[VIEW] 종료합니다.");
				System.exit(-1);
				break;
			default:

			} // switch 끝
		} // while끝
	} // mainview 끝

	void loginview() {
		System.out.println("----------------- L O G I N ---------------");
		System.out.print("ID/PW 입력 : ");
		String id=sc.next();
		String pwd=sc.next();
		Integer result= (Integer)controller.ExSubController("/auth", 1, new MemberDTO(id,pwd));
		if(result!=null) {
			//권한 1,2 를 획득
			Loginstate=true;
			perm=result;
			userid = id;
		}	
	}

	void lendview() {

	}

	public static void main(String[] args) {
			new TUIView();
	}
}



