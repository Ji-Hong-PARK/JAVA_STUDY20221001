package CH38.Controller;

import CH38.Domain.DTO;

public class MemberController implements SubController{
	
	//mvc패턴을 좀더 이해하기위해 이렇게 만든다.
	
		//파라미터 받기
		//1) 회원등록, 2) 회원수정, 3) 회원삭제
		
		//2 입력값 검증(Validation Check)
		//
		
		//3 서비스 실행
		
		//4 view로 이동(내용전달 포함)
	
	@Override
	public Object excute(int SN, DTO dto) {
		switch (SN) {
		case 1: //도서 등록
			System.out.println("회원등록 서비스 요청");
			break;
		case 2 : //도서 조회
			System.out.println("회원조회 서비스 요청");
			break;
		case 3 : //도서 수정
			System.out.println("회원수정 서비스 요청");
			break;
		case 4 : // 도서 삭제
			System.out.println("회원삭제 서비스 요청");
			break;
		default:
			System.out.println("잘못된 서비스 요청입니다.");
			break;
		}	
		return null;
		
		
		
	}

	
	
}
