package CH20;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C06Map {
	
	//저장멤버 MAP
	private static Map<String, Integer> map = new HashMap();
	
	private static void Insert(String k, Integer v)
	{	//벨류값도 중복이 없을려면 
		//if(!map.containsKey(k)) && if(!map.containsValue(v)) // 라고 쓰면된다. and연산자
		if(!map.containsKey(k))		// key가 map에 없다면
		{	
			map.put(k, v);			// key, value 저장
		}
		else
		{
			System.out.println("동일한 key가 존재합니다.");
		}
		
	}
	public static void ShowInfo()	// ShowInfo(Map <String,Integer> map) 생략가능.
	{
		Set<String> set = map.keySet();		//map 안의 모든 key를 Set 형태로 반환.
		for(String key : set)
		{
			int value = map.get(key);
			System.out.println("KEY : " + key + ", VALUE : " + value);
		}
	}
	// key 값을 삭제하는법
	public static void Remove(String key)
	{
		Integer result = map.remove(key);
		if(result == null)
		{
			System.out.println("삭제 실패...");
		}
		else
		{
			System.out.println("삭제 성공!!");
		}
		
	}
	
	// value 값 삭제하는 방법
	// 벨류값을 삭제할려면 key값을 알아야한다. 
	
	// 동하 버전.
//	public static void Remove(Integer value) throws Exception
//	{	//동일한 벨류값을 가지는 모든 요소를 삭제.
//		Set <String> set = map.keySet();
//		for (String key : set) 
//		{
//			if(value.equals(map.get(key))) 
//			{
//				boolean result = map.remove(key, value);
//				set = map.keySet();
//				if(result) 
//				{
//					System.out.println("삭제성공!!!");
//				}
//				else 
//				{
//					System.out.println("삭제실패...");
//				}
//			}
//		}
//	}
	public static void Remove(Integer value)
	{
		
		Collection<Integer> tmp =  map.values();
		
//		tmp = map.remove(value);
//		
//		if(tmp == null)
//		{
//			System.out.println("삭제 실패...");
//		}
//		else
//		{
//			System.out.println("삭제 성공!!");
//		}
		
	}
	
	
	public static void main(String[] args) {
			
		Insert("aaa", 1111);
		Insert("bbb", 2222);
		Insert("ccc", 3333);
		Insert("ddd", 4444);
		Insert("ddd", 1234);	// id 중복인 경우(나중 요청된 K : V 저장)
		Insert("fff", 1234);	// pw 중복인 경우(문제없이 저장)
		
		//개수
		System.out.println("저장 수 : " +  map.size());
		
		//조회
		ShowInfo();
		
		//삭제
		Remove("aaa");		//삭제 성공
		//Remove("abc");		//삭제 실패
		ShowInfo();
		System.out.println("저장 수 : " +  map.size());
		
		//개수
		System.out.println("저장 수 : " + map.size());
		System.out.println("----------------------");
		
		
		//만들어보기  문제
		
		//동하 버전.
//		try {
//			Remove(1234);
//		} catch (Exception e) {
////			e.printStackTrace();
//		}
			
		//1234를 가진 벨류값을 모든걸 삭제해보기.
		
		Remove(1234);
		ShowInfo();
		System.out.println("저장 수 : " +  map.size());
	}

}
