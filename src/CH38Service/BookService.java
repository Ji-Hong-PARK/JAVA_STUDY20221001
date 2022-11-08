package CH38Service;

import CH38Domain.BookDAO;
import CH38Domain.BookDTO;

public class BookService {

	BookDAO dao = BookDAO.getInstance();
	
	//인증서비스에 필요한 함수를써줘야한다.
	
	
	//도서 조회하기
	//도서 등록하기
	//(권한 확인 후 도서 등록하기)
	public boolean RegisterBook(BookDTO dto, int permission) {
		
		//boolean isRegisterOK = true;
		//권한 체크 (등록가능한지 여부 확인)
		
		if(permission >= 3) {
			return dao.Insert(dto);
		}
		
		return false;
	}
	
	//도서 수정하기
	//도서 삭제하기
	//기타...
	
	
	
}
