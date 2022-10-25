package CH20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C04Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 	- 맵에는  키(k)와 값(V)으로 구성
			- 키는 중복저장될 수 없지만 값은 중복저장 가능하다.
			- 기존의 저장한 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값이 저장이된다. 
		
		
		*/
		
		Map<String, Integer> map = new HashMap();
		map.put("aaa", 1111);
		map.put("bbb", 2222);
		map.put("ccc", 3333);
		map.put("ddd", 4444);
		map.put("ddd", 1234);	// id 중복인 경우(나중 요청된 K : V 저장)
		map.put("fff", 1234);	// pw 중복인 경우(문제없이 저장)
		
		//개수
		System.out.println("저장 수 : " +  map.size());
		
		//조회
		Set<String> set = map.keySet();		//map 안의 모든 key를 Set 형태로 반환.
		for(String key : set)
		{
			int value = map.get(key);
			System.out.println("KEY : " + key + ", VALUE : " + value);
		}
		
	}

}
