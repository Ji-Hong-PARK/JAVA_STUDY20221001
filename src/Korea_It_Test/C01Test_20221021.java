package Korea_It_Test;

import java.util.Scanner;

public class C01Test_20221021 {

	public static void main(String[] args) {
		/*
		 
		1. 아래 내용을 확인하고, 그에 대한 결과를 작성하세요. (삼각형 별찍기) (25점)
		-------------------------------------------------------------   
				- 높이를 입력받아 높이만큼 삼각형을 찍어내는 프로그램을 구현합니다.

		내용		- for문 혹은 while문 둘다 사용가능합니다.

				- 중첩반복문을 이용하세요.

				- Main method 내의 결과코드를 답변란에 올려줍니다.
		--------------------------------------------------------------
			높이 6의 피라미드 삼각형을 만들어라.
		*/
		
		
		// while문으로 작성
		
		Scanner sc = new Scanner(System.in);
		System.out.print("높이 입력 : ");
		int n = sc.nextInt();	
		
//		int i = 0, j=0, k=0;
//		while(i<n)	
//		{	
//			j=0;
//			while(j<=(n-2)-i)
//			{
//				System.out.print(" ");
//				j++;	
//			}
//			
//			k=0;
//			while(k<=2*i)
//			{
//			 System.out.print("*");
//			 k++;	
//			}
//			System.out.println();
//			i++;
//		}		
		
		// for문으로 작성시 
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j<=(n-2)-i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 0;k<=2*i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
