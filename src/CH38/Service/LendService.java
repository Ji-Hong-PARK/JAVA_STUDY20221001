package CH38.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import CH38.Domain.BookDAO;
import CH38.Domain.BookDTO;
import CH38.Domain.LendDAO;
import CH38.Domain.LendDTO;

public class LendService {
	
	BookDAO bdao = BookDAO.getInstance();
	LendDAO ldao = LendDAO.getInstance();
	
	
	//싱글톤 패턴 코드 추가
	private static LendService instance;
	
	public static LendService getInstancs() {
		if(instance == null)
			instance = new LendService();
		return instance;
	}
	private LendService() {
		
	}
	//랜드북을 불러와서 접속한 아이디를 확인할것이고 어떤책을 대여할것인지 값을 받을것이다.
	public boolean Lendbook(boolean Login, int perm, String id, int bookcode) // 누가? 어떤책을? 대여할껀지 알아야한다. 
	{	//1 id가 로인상태 인지 + 대여권한이 있는지
		if(Login == true && perm >= 1) //0(권한없음)비회원, 1회원, 2사서(관리자)  
		{
			//2 도서 대여 가능확인(BookDAO 의 select함수로 확인)
			BookDTO bdto =  bdao.Select(bookcode);
			
			if(bdto.isLend())//도서대여 가능!
			{
			//3 도서 상태 정보 수정(대여불가능 상태로 - BookDAO의  Update 함수로 처리)
				bdto.setLend(false);
				
			//4 tbl_lend에 도서 정보 저장(LendDAO 의  insert함수로 처리.)
				//int lid, int bookcodem String memId, String startDate, String endDate
				//대여날짜, 반납날짜(7일이후)
				//날짜정보 확인
				//DataFormat 지정객체
				SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
				//날짜정보 객체
				Calendar cal = Calendar.getInstance();
				
				//현재 날짜정보를 문자열로 저장 start
				String start = fmt.format(cal.getTime()).toString(); //시작날짜를 불러오고.
				//System.out.println("start : " + start);
				
				//7일 이후 날짜로 등록
				cal.add(Calendar.DATE,7);
				String end = fmt.format(cal.getTime()).toString();
				//System.out.println("end : " + end);
				
				//DB 테이블 수정 처리.
				//bdao.Update(bdto);	//북테이블을 수정하고 //Lend서비스에서 예외처리로  트랜잭션 확인하면 이건 성공
				//int result = ldao.Insert(new LendDTO(0, bdto.getBookCode(),id, start, end)); // 트랜잭션확인중 이건 실패.
				int result = ldao.Insert(bdto, new LendDTO(0, bdto.getBookCode(), id, start, end));
				
				
				//5 결과 Controller로 반환.
				if(result > 0) {
					return true;
				}
				
			}
		}
		
		
		return false;
	}
	

}

// 다이어그램을 통해서  공부를 하자.
