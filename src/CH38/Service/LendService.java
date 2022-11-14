package CH38.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import Ch38.Domain.BookDAO;
import Ch38.Domain.BookDTO;
import Ch38.Domain.LendDAO;
import Ch38.Domain.LendDTO;

public class LendService {

	BookDAO bdao = BookDAO.getInstance();
	LendDAO ldao = LendDAO.getInstance();
	
	// 싱글톤 패턴 코드 추가
	private static LendService instance;

	public static LendService getInstance() {
		if (instance == null)
			instance = new LendService();
		return instance;
	}

	private LendService() {}
	
	
	public boolean Lendbook(boolean Login,int perm,String id,int bookcode) {
		//1 로그인 상태 +  대여권한 있는지
		if(Login==true && perm>=1) 	//0 비회원 1 회원 2 사서(관리자)
		{
			//2 도서 대여 가능확인(BookDAO 의 select함수로 확인)
			BookDTO bdto=bdao.Select(bookcode);
			
			if(bdto.isLend()) //도서대여 가능!
			{
				//3 도서 상태 정보 수정(대여불가능상태로 - BookDAO의 Update함수로 처리)
				bdto.setLend(false);
				
				//4 tbl_lend에 도서 정보 저장(LendDAO 의 insert함수로 처리)
				//int lid, int bookcode, String memId, String startDate, String endDate
				//대여날짜 , 반납날짜(7일이후)
				
				//DataFormat지정 객체
				SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
				//날짜정보객체
				Calendar cal = Calendar.getInstance();
				//현재 날짜정보를 문자열로 저장 start
				String start = fmt.format(cal.getTime()).toString();		
				//7일 이후 날짜로 등록 
				cal.add(Calendar.DATE, 7);
				String end = fmt.format(cal.getTime()).toString();	
				
				//Table 수정 처리
				//bdao.Update(bdto);	//성공!!
				//int result= ldao.Insert(new LendDTO(0,bdto.getBookCode(),id,start,end)); //실패!!
				int result=ldao.Insert(bdto,new LendDTO(0,bdto.getBookCode(),id,start,end));
				
				//5 결과 Controller로 반환
				if (result>0) {
					return true;
				}
			}
			
			
		}	
		
		return false;
	}
	

	
	
	public boolean Lendbook(LendDTO dto) {
		//1 로그인 상태 +  대여권한 있는지
		if(dto.isLogin()==true && dto.getPerm()>=1) 	//0 비회원 1 회원 2 사서(관리자)
		{
			//2 도서 대여 가능확인(BookDAO 의 select함수로 확인)
			BookDTO bdto=bdao.Select(dto.getBookcode());
			
			if(bdto.isLend()) //도서대여 가능!
			{
				//3 도서 상태 정보 수정(대여불가능상태로 - BookDAO의 Update함수로 처리)
				bdto.setLend(false);
				
				//4 tbl_lend에 도서 정보 저장(LendDAO 의 insert함수로 처리)
				//int lid, int bookcode, String memId, String startDate, String endDate
				//대여날짜 , 반납날짜(7일이후)
				
				//DataFormat지정 객체
				SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
				//날짜정보객체
				Calendar cal = Calendar.getInstance();
				//현재 날짜정보를 문자열로 저장 start
				String start = fmt.format(cal.getTime()).toString();		
				//7일 이후 날짜로 등록 
				cal.add(Calendar.DATE, 7);
				String end = fmt.format(cal.getTime()).toString();	
				
				//Table 수정 처리
				//bdao.Update(bdto);	//성공!!
				//int result= ldao.Insert(new LendDTO(0,bdto.getBookCode(),id,start,end)); //실패!!
				
				dto.setStartDate(start);
				dto.setEndDate(end);
				int result=ldao.Insert(bdto,dto);
				
				//5 결과 Controller로 반환
				if (result>0) {
					return true;
				}
			}
			
			
		}	
		
		return false;
	}
	
	
	
}
