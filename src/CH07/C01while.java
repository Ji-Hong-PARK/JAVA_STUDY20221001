package CH07;

import java.util.Scanner;

public class C01while {

	public static void main(String[] args) {
		
		//탈출 요건
	
//		int i = 0; //1 .탈출 변수
//		while (i < 10)  //2. 탈출 조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++; //3 .탈출 연산식	
//		}
		
		
		// 1부터 10까지 합
//		int i = 1; 					//1 .탈출 변수
//		int sum = 0; 				// 누적 합 저장 변수
//		while (i <= 10) 			//2. 탈출 조건식
//		{
//		System.out.println("i : " + i);
//		sum = sum +i;		//sum += i;
//		i++;				//3 .탈출 연산식
//		
//		}
////		System.out.println("종료 후 i " + i);
//		System.out.println("1 부터 10까지 합 : " + sum);
		
			
		
		
			//문제
			
			//1부터 입력한 정수(N)까지 합 구하기
			
//			Scanner sc = new Scanner(System.in);
//			int i =1, sum = 0, N = sc.nextInt();
//			
//			while (i <= N) 			
//			{
//				System.out.println(i + "+" + sum);//				sum = sum +i;		
//				i++;				
//			}
//			System.out.printf("1 부터 %d 까지 합 %d\n ", N, sum);
			
		
		
		//===========================선생님 풀이============================
//			
//			Scanner sc = new Scanner(System.in);
//			int n = sc.nextInt();
//			
//			int i = 1;
//			int sum = 0;
//			while(i<=n)
//			{
//				sum += i; //sum = sum+i;
//				i++;
//			}
//			System.out.printf("1부터 %d 까지의 합 : %d\n", n,sum);
		//=======================================================
			
			
			//문제
			//N,M을 입력 받아서 N부터 M까지의 합 구하기 (N < M)
			
			
//			Scanner sc1 = new Scanner(System.in);
//			int sum1 = 0, i1 = sc1.nextInt(),  N1 = sc1.nextInt();
//			
//			
//			while (i1 <= N1) 			
//			{
//			System.out.println(i1 +" + "+ sum1);
//			sum1 += i1;		
//			i1++;				
//			}
//			System.out.printf("%d 부터 %d 까지 합 %d\n ",i1, N1, sum1);
			
			
			//===========================선생님 풀이============================
			
//			Scanner sc = new Scanner(System.in);
//			int n = sc.nextInt();
//			int m = sc.nextInt();
//			
//			//
//			if(n > m) // 혹시나  n값이 m보다 크다면 tmp를 활용해서 순서를 바꿔준다.
//			{
//				int tmp = n;
//				n = m;
//				m = tmp;
//			}
//			//
//			
//			int i= n; //초기값
//			int sum = 0;
//			while(n<=m)
//			{
//				sum+=i;
//				i++;
//			}
//			System.out.printf("%d 부터 %d 까지의 합 : %d\n",n,m,sum);
			
			
			//=======================================================
	
			
			//문제
			//구구단 2단 출력(역순출력)
			
//			int i =1;
//			while (i < 10) 
//			{
//				int n = i*2;
//				System.out.println("---구구단 2단---");
//				System.out.printf("2 X %d = %d",i,n);
//				i++;
//				System.out.println();
//			}
		
			//구구단 역순 출력해보자.
			//역순 출력
		
//			int i = 9;
//			while (i >= 1) 
//			{
//				int n = i*2;
//				System.out.println("---구구단 2단---");
//				System.out.printf("2 X %d = %d\n",i,n);
//				i--;
//			}
	
		
		//===========================선생님 풀이============================
//			int i =1;
//			while(i<10)
//			{
//				
//				System.out.printf("%d X %d = %d\n", 2,i,2*i);
//				i++;
//			}
		
		//  역순으로  풀이
		
//			int i =9;
//			while(i>=1)
//			{
//				
//				System.out.printf("%d X %d = %d\n", 2,i,2*i);
//				i--;
//			}
			
		//=======================================================
		
			
			//문제
			//구구단 N단 출력(입력받기)
			
//			내가 풀어보자!!!!!!!!!!!
		
		
		
		
		//===========================선생님 풀이============================
//			Scanner sc = new Scanner(System.in);
//			int n = sc.nextInt();
//			
//			int i =1;
//			while(i<10)
//			{
//				
//				System.out.printf("%d X %d = %d\n", n,i,n*i);
//				i++;
//			}
		
		//=======================================================
			
			//문제
			//구구단 N단 출력(입력받기, 역순출력)    (별첨 .... 2<=N<=9)
			
//				내가 풀어보자
		
		
			
		//===========================선생님 풀이============================
//			Scanner sc = new Scanner(System.in);
//			int n = sc.nextInt();
//			
//			int i =9;
//			while(i>=1)
//			{
//				
//				System.out.printf("%d X %d = %d\n", n,i,n*i);
//				i--;
//			}
		
		//=======================================================
			
			
			
			
			//문제
			//프로그램 사용자로부터 양의 정수를 하나 입력 받은 다음, 그 수만큼 3의배수를 출력하는
			//프로그램 작성
			//ex. 5를 입력받았다면 3,6,9,12,15 를 출력
			
//			Scanner sc = new Scanner(System.in);
//			int n = sc.nextInt();
//			int j = 1;
//			int k = 3;
//			while(n >= j) 
//			{
//				
//				System.out.printf("%d\n", j*k);
//				j++;
//			}
		
		//============================선생님  코드=======================================
//			Scanner sc = new Scanner(System.in);
//			int n = sc.nextInt();
//			int i = 1;
//			
//			while(i<=n)
//			{
//				if(i<n)
//				{
//				System.out.print(i*3 + ",");
//				}
//				else
//				{
//					
//				}
//				i++;
//			}
			
		
			
			
			
//			Scanner sc = new Scanner(System.in);
//	        System.out.println("정수 하나를 입력하세요.");
//            int n = sc.nextInt();
//            int s = 3;
//            int result = 0;
//            while (result < n) 
//            {
//		        System.out.println(s);
//		        s++;
//		        s++;
//		        s++;
//		        result++;
//	        }
			
		//===========================================================================
			//문제
			//1부터 100까지 수중에 짝수의 합과 홀수의 합을 각각 구해서 출력하세요
			
//			int i = 1;
//			int j = 1;
//			
//			while(i <= 100) 
//			{
//				
//				if(i%2 == 0)
//				{
//					
//					i++;
//					
//				}
//				
//				if(j%3==0)
//				{
//					
//					j++;
//					
//				}
//				
//				
//				
//			}
		//======================선생님 풀이=======================
//			Scanner sc = new Scanner(System.in);
//			int i =1;
//			int evensum = 0;
//			int oddsum = 0;
//			while (i<=100)
//			{	
//				if(i%2==0) 
//				{
//					//System.out.println("짝수 i = " + 1 );
//					evensum += i; // evensum  = evensum  + i;
//				}
//				else
//				{
//					//System.out.println("홀수 i = " + 1 );
//					oddsum += i; // oddsum = oddsum + i; 
//				}
//				i++;	
//			}
//			System.out.println("짝수 합 : " +evensum);
//			System.out.println("홀수 합 : " +oddsum);
		
		//===============================================
			//문제
			//1부터 N까지 수중에 짝수의 합과 홀수의 합을 각각 구해서 출력하세요
		
		
			
		
		
		
		
		
		
		
		
			//=====================선생님 풀이=======================
//			Scanner sc = new Scanner(System.in);
//			int n = sc.nextInt();
//			int i =1;
//			int evensum = 0;
//			int oddsum = 0;
//			while (i<=n)
//			{	
//				if(i%2==0) 
//				{
//					//System.out.println("짝수 i = " + 1 );
//					evensum += i; // evensum  = evensum  + i;
//				}
//				else
//				{
//					//System.out.println("홀수 i = " + 1 );
//					oddsum += i; // oddsum = oddsum + i; 
//				}
//				i++;	
//			}
//			System.out.println("짝수 합 : " +evensum);
//			System.out.println("홀수 합 : " +oddsum);
			
		//====================================================
			//문제
			//1부터 100까지 수중에 3의 배수는 제외한 합을 구해서 출력해보세요
			
		
		
		
		
		
		
		
		
		
		
		
		
		//=========================선생님 풀이=========================
		
//		Scanner sc = new Scanner(System.in);
//		int i = 1;
//		int sum = 0;
//		while (i < 100)
//		{
//			if(i%3==0)
//			{
//				sum+=i; //3배수가 아닌경우 실행코드
//			}
//			i++;
//		}
//		System.out.println(sum);	
		
		//====================================================
		
			//문제
			//문자열을 입력받아서 각문자를 거꾸로 출력해봅시다
			//입력 : apple
			//출력 : elppa
			
			
		
		
		
		//=========================선생님 풀이=========================
			// String str = "안녕?";
			// System.out.println("길이 : " +str.length());
			// str = str +"나는 ";
			// System.out.println("길이 : " +str.length());
		//////////////////////////////////////////////////
		
		
			Scanner sc = new Scanner(System.in);
			
			String str1 = sc.nextLine();
			String reverse = " ";
			int len = str1.length()-1;
			
			String r = " "; //  <-이걸 쓰면  / r+=str1.charAt(len); <- 값을 이렇게 써야한다.
			System.out.println("길이 : " + len);
			while (len>=0)	//음수값이 되면 반복문을 벗어나게 된다.
			{
			//  System.out.print(str1.charAt(len)); // 다르게 쓰는법 
				
			//reverse += str1.charAt(len);	// 0값 / 다르게 쓰는법.
				
				r+=str1.charAt(len);
				len--;
				
			}
			System.out.println(reverse);
			
			
		//====================================================

	}

}
