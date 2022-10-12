package Ch07;

import java.net.SecureCacheResponse;
import java.util.Scanner;

import javax.swing.filechooser.FileNameExtensionFilter;

public class C04For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int i = 0;	//초기값
//		while(i<10)	//조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++;	//증감 연산식
//		}
		
		
//		for(int i =0; i < 10; i++)
//		{
//			System.out.println("HELLO WORLD");
//		}
		
		
		// 1부터 10까지 합
//		int sum = 0;
//		for(int i = 1; i<=10; i++)
//		{	
//			sum+=i;	
//		}
//		System.out.println("sum = " + sum);
		
		
		//------선생님 코드
		
		
		
		// 1부터 N까지 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = 0;
//		for(int i = 0; i<=n; i++)
//		{
//			sum+=i;
//		}
//		System.out.println("sum = " + sum);
		
		
		//------선생님 코드
		
		
		
		
		
		
		// N부터 M까지 합
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		int n = sc.nextInt();
//		int sum = 0;		
//		for( i = 0; i<=n; i++)
//			{
//				sum+=i;
//			}
//			System.out.println("sum = " + sum);
		
		
		//------선생님 코드
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if(n>m)
//		{
//			int tmp = n;
//			n=m;
//			m=tmp;
//		}
//		int i;
//		int sum = 0;
//		for(i=n;i<=m;i++)
//		{
//			sum+=i;
//			i++;
//		}
//		System.out.println("sum = " + sum);
		
		
		
		// 구구단 2단
//		int dan =2;
//		int result;
//		
//		for(int i = 0; i <= 9; i++)
//		{
//			result = dan*i;
//			System.out.printf("%d X %d = %d\n",dan,i,result);	
//		}
		
		
		//------선생님 코드
		
		
		
		//구구단 N단
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		int result;
//		
//		for(int i = 0; i <= 9; i++)
//		{
//			result = dan*i;
//			System.out.printf("%d X %d = %d\n",dan,i,result);	
//		}
		
		
		//------선생님 코드
		
		
		
		//구구단 전체

//		for(int i = 1; i<=9; i++)
//		{
//			System.out.printf("======%d단=====\n",i);
//			for(int j=1; j<=9; j++)
//			{
//				System.out.printf("%d X %d = %d\n",i,j,i*j);
//				
//			}
//			System.out.println();
//		}
		
		
		//------선생님 코드
		
		
		
		
		//별찍기
		//삼각형 만들기.
		
//		for(int i=0; i<=4; i++)
//		{
//			for(int j=0; j<=i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		

		//------선생님 코드
		

		int i =0;
		int j = 0;
		int k =0;
		
		for(i=0;i<7;i++)
		{
			if (i<4) 
			{
			    //별
				for(j=0;j<=2-i;j++)
				{
					System.out.print(" ");	
				}
				//공백
				for(k=0;k<=2*i;k++)
				{
					System.out.print("*");	
				}
			}
			else
			{
				//공백
				for(j=0;j<=i-4;j++)
				{
					System.out.print(" ");	
				}
				//별
				for(k=0;k<=12-(2*i);k++)
				{
					System.out.print("*");		
				}
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
