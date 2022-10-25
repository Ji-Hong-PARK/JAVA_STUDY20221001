package CH20;

import java.util.List;
import java.util.Vector;

public class C02List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new Vector();		//벡터 리스트  사용할려면 컨트롤 + 쉬프트 + 영문 O
		//List<String> list = new LinkedList();	//링크드 리스트 사용할려면 컨트롤 + 쉬프트 + 영문 O
		
		//추가	//중복을 허용한다.
		list.add("JAVA");			//0
		list.add("JDBC");			//1
		list.add("OracleDB");		//2
		list.add("JSP");			//3
		list.add("Servlet");		//4
		list.add("SpringFrameWork");//5
		list.add("JAVA");			//6 //중복을 허용
		
		//확인(저장 수)
		System.out.println("총 개체수 : " + list.size());
		
		//확인(요소)
		System.out.println("확인 idx 2 : " + list.get(2));
		System.out.println("--------------------------");
		
		//전체 조회
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("--------------------------");
		//다른방법  String tmp 에다 list를 하나씩 넣는다.
		for(String tmp : list)
		{
			System.out.println(tmp);
		}
		
		//삭제
		list.remove(2);	//오라클DB를 삭제하겠다 인덱스번호로 이용하여 
		System.out.println("--------------------------");
		for(String tmp : list)
		{
			System.out.println(tmp);
		}
		
		list.clear();			//전체 삭제를 하겠다 . 클리어
		System.out.println("--------------------------");
		for(String tmp : list)
		{
			System.out.println(tmp);
		}
		
		
		
	}
	

}
