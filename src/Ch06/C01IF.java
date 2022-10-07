package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		
		//단순 IF
		
		/*
		int age = 7;
		if(age >=8)
		{
			System.out.println("학교에 다닙니다");
		}
		
		if(age <8)
		{
			System.out.println("학교에 다니지 않습니다");
		}
		*/
		
		//IF - ELSE
		/*
		if(age >=8)
		{
			System.out.println("학교에 다닙니다");
		}
		else
		{
			System.out.println("학교에 다니지 않습니다");
		}
		*/

		//입력값 받기 + if
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 입력 : ");
		int num = sc.nextInt();
		
		if(num%2==0)	//짝수이냐?
		{
			System.out.println("입력한 값은 짝수 입니다");
		}
		else
		{
			System.out.println("입력한 값은 홀수 입니다");
		}
		*/
		
		
		//문제
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		
		/*
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		num=sc.nextInt();
		if(num%3==0)//3의 배수라면
		{
			System.out.println(num + " 는 3의 배수 입니다");
		}
		*/
		
		//문제
		// 두수를 입력받아 두수 중에 큰수를 출력
		
		/*
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("1 정수 입력 :");
		num1=sc.nextInt();
		System.out.print("2 정수 입력 :");
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("큰수 : " + num1);
		}
		else
		{
			System.out.println("큰수 : " + num2);
		}
		sc.close();
		*/
		
		//문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		
		/*
		int num1,num2,num3;
		int sum=0;
		double avr=0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("세 수를 입력하세요 : ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		
		sum=num1+num2+num3;
		avr=(double)sum/3;
		
		System.out.println("합 :" + sum + "평균 : " + avr);
		*/
		
		
		
	}

}
