package Ch06;


import java.util.Scanner;

public class C02IF {

	public static void main(String[] args) {
		//입력한수가 짝수이고,3의 배수라면 출력
		//입력한수가 홀수이고,5의 배수라면 출력
		int num=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("값 입력 : ");
		num=sc.nextInt();
		
		if(num%2==0)
		{
			//짝수인경우 실행코드
			if(num%3==0)
			{
				//짝수이면서 3의배수인경우 실행코드
				System.out.println(num + " 은 짝수이면서 3의 배수");
			}
		}
		else
		{
			//홀수인경우 실행코드
			if(num%5==0)
			{
				//5의 배수라면 실행
				System.out.println(num + " 은 홀수이면서 5의 배수");
			}
		}
		
		
	}

}
