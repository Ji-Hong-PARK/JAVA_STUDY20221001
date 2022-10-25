package CH20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C03Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> Set = new HashSet();		
		
		
		//추가	//중복을 허용한다.
		Set.add("JAVA");			//0
		Set.add("JDBC");			//1
		Set.add("OracleDB");		//2
		Set.add("JSP");				//3
		Set.add("Servlet");			//4
		Set.add("SpringFrameWork");	//5
		Set.add("JAVA");			//6 //중복을 허용 X... 총개수는 6개
		
		//확인(저장 수)
		System.out.println("총 개체수 : " + Set.size());
		
		//조회(간편)
		for(String tmp : Set)
		{
			System.out.println(tmp);
		}
		System.out.println("--------------------------");
		
		//조회 (복잡)
		Iterator<String> iter = Set.iterator();
		while(iter.hasNext())
		{
			String tmp = iter.next();
			System.out.println(tmp);
		}
		
		Set.remove("JAVA");
		//확인
		System.out.println("총 개수 " + Set.size());
	}
	

}
