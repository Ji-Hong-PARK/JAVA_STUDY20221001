package CH38.Controller;

import CH38.Domain.DTO;

public interface SubController {
	
	//int num : 세부 서비스요청 정보
	// ex)도서서비스(1 : 도서조회, 2 : 도서등록, 3: 도서 수정...)
	// ex)멤버서비스(1 : 멤버가입, 2: 멤버조회, 3: 도서수정..)
	Object excute(int SN, DTO dto);
	
}