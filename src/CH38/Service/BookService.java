package CH38.Service;

import java.util.ArrayList;

import CH38.Domain.BookDAO;
import CH38.Domain.BookDTO;
import CH38.Domain.MemberDTO;

public class BookService {

	BookDAO dao = BookDAO.getInstance();
	
	//인증서비스에 필요한 함수를써줘야한다.
	
	//싱글톤 패턴 코드 추가
	private BookService instance;
	public BookService getInstancs() {
		if(instance == null)
			instance = new BookService();
		return instance;
	}
	
	public BookService() {} //프라이빗 넣기! 인스턴스를 하면.
	
	
	//도서 조회하기
	//도서 등록하기
	//(권한 확인 후 도서 등록하기)
	public boolean RegisterBook(BookDTO dto, int permission) {
		
		boolean isRegisterOK = true;
		//권한 체크 (등록가능한지 여부 확인)
		if(permission >= 3) {
			
			int result = dao.Insert(dto);
			if(result>0) {
				return true;
			}
		}
		
		return false;
	}

	public ArrayList<MemberDTO> ShowAllBook() {
		ArrayList<MemberDTO> list = dao.SelectAll();
		
		return list;
	}
	
	//도서 수정하기
	//도서 삭제하기
	//기타...
	
	
	
}
