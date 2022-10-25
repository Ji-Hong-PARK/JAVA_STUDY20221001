package CH20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class C04Set {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		Set<Integer> lotto = new HashSet();
		
		
		//로또 만들기
		//Set을 이용하여 6자리 난수를 저장(1~45까지)
		//저장 이후 정렬 (오름차순)
		
		while(lotto.size() < 7)
		{
			lotto.add(rand.nextInt(45) + 1);
		}
		
		System.out.println("------------SET------------");
		
		for(int n : lotto)
		{
			System.out.print(n + " ");
		}
		
		System.out.println("\n------------LIST(정렬 전)------------");
		
		//정렬
		List<Integer> list = new ArrayList(lotto);
		for(int n : list)
		{
			System.out.print(n + " ");
		}
		
		
		System.out.println("\n------------LIST(정렬 후)------------");
		//Collections.sort(list);	//오름차순 정렬
		Collections.sort(list, Collections.reverseOrder());	//내림차순 정렬
		
		for(int n : list)
		{
			System.out.print(n + " ");
		}
		
		
//		//난수만들기 코드
//		while(true)
//		{
//			System.out.println(rand.nextInt(45));
//			Thread.sleep(500);
//		}
		

	}

}
