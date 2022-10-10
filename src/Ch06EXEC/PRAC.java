package Ch06EXEC;

import java.text.BreakIterator;
import java.util.Scanner;

public class PRAC {

	public static void main(String[] args) {
		//문제 1번
		//if문을 써서 값을 구하시오.
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
			
//			Scanner sc = new Scanner(System.in);
//			System.out.print("정수를 입력하세요 : ");
//			int num = sc.nextInt();
//			
//			if(num % 3 == 0)
//				System.out.printf("%d"+"는 3의 배수입니다.",num);
//			else
//				System.out.printf("%d" + "는 3의 배수가 아닙니다.", num);		
//			
//			System.out.println();
	
		
//========================================================================
		
		//문제2번
		// 두수를 입력받아 두수 중에 큰수를 출력
			
//			int num1,num2,result;
			
			//2번문제 if문을 안쓰고 적을경우
			
//			Scanner sc1 = new Scanner(System.in);
//			System.out.print("첫 번째 정수를 입력하세요 : ");	
//			num1 = sc.nextInt();
//			System.out.print("두 번째 정수를 입력하세요 : ");
//			num2 = sc.nextInt();	
//			result = (num1 > num2) ? num1 : num2;	
//			System.out.println("입력받은 두 수중에 큰수는 " + result + "입니다.");
			
			
			//2번 문제 if문을 쓸경우 코드
			
//			Scanner sc1 = new Scanner(System.in);
//			System.out.print("첫 번째 정수를 입력하세요 : ");	
//			num1 = sc1.nextInt();
//			Scanner sc2 = new Scanner(System.in);
//			System.out.print("두 번째 정수를 입력하세요 : ");	
//			num2 = sc2.nextInt();
//			if(num1 > num2) 
//				System.out.println(num1 + " 는 두 수중에 제일 큰 숫자입니다.");
//			if(num1 < num2)
//				System.out.println(num2 + " 는 두 수중에 제일 큰 숫자입니다.");
		
			
//=============================================================================
			
		//문제3번
		
		// 세 정수를 입력받아 세 정수 중에 가장 큰수와 가장 작은수를 출력
		
//		int num1,num2,num3;
//		
//		Scanner sc1 = new Scanner(System.in);
//		System.out.print("첫 번째 정수를 입력하세요 : ");	
//		num1 = sc1.nextInt();
//		Scanner sc2 = new Scanner(System.in);
//		System.out.print("두 번째 정수를 입력하세요 : ");	
//		num2 = sc2.nextInt();
//		Scanner sc3 = new Scanner(System.in);
//		System.out.print("세 번째 정수를 입력하세요 : ");	
//		num3 = sc3.nextInt();
//		
//		if((num1 > num2) && (num1 >num3))
//		{
//			System.out.println(num1 + " 는 세자리수 중에 첫번째로 입력한 제일 큰 숫자입니다.");
//			
//		}
//		else if((num2 > num3) && (num2 >num1))
//			{
//			System.out.println(num2 + " 는 세자리수 중에 두번째로 입력한 제일 큰 숫자입니다.");
//			}
//		else
//		{
//		System.out.println(num3 + " 는 세자리수 중에 세번째로 입력한 제일 큰 숫자입니다.");
//		}
		
		
		
//===================================================================================	
			
		//문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		
		int num1,num2,num3;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");	
		num1 = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.print("두 번째 정수를 입력하세요 : ");	
		num2 = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.print("세 번째 정수를 입력하세요 : ");	
		num3 = sc3.nextInt();
		
		//세개의 정수를 입력받아 합을 구하시오.
		int sum = (num1 + num2+ num3);
		System.out.printf("세 정수를 입력받아 합친 값 = %d\n",sum);
		int average = (sum / 3);
		System.out.printf("세 정수를 입력받아 평균 값 = %d\n",average);
		
		
		//if 문을 써서 만들어 보자.
		
		
		
	}

}
