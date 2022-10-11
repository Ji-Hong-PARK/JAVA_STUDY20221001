package Ch07;

public class C02WhileWhile {

	public static void main(String[] args) {
	
		//--------------------------------
//		2
//		3
//		4
//		5
//		.
//		.
//		dan	= 2
//		dna ++
//		dna <=9
		
		
//		int dan = 2;
//		int i;
//		while(dan<=9) 
//		{
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		// 전체 구구단 (2단 - 9단) 출력하기
	
		
//		int dan = 2;
//		int i;
//		while(dan<=9) 
//		{
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		// 전체 구구단 (2단 - 9단) 출력하기(다만 역순으로)
		
		
//		dan = 2		i = 9
//		dan ++		i --
//		dan <=9		i >= 1
		
//		int dan = 2;
//		int i;
//		while(dan<=9) 
//		{
//			i=9;		//초기값
//			while(i>=1)	//연산식
//			{
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;	//탈출값
//			}
//			System.out.println();
//			dan++;
//		}
		
		// 전체 구구단 (2단 - 9단) 출력하기(전체 역순출력)
		
		int dan = 9;
		int i;
		while(dan>=2) 
		{
			i=9;		//초기값
			while(i>=1)	//연산식
			{
				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
				i--;	//탈출값
			}
			System.out.println();
			dan--;
		}
		
		// N 부터 9단까지 전체 출력
		// 풀어보자
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
