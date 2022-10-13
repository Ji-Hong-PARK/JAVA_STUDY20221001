package CH08;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

class Sum
{
	//속성
	Scanner sc = new Scanner(System.in);
	
	//기능
	//반환 O 매개변수 O 
	int sum1(int x, int y)
	{
		return x+y; // return은 반환자료형 int 로 연결되어 r1변수에 저장이 되어 출력된다.
	}
	
	//반환 O 매개변수 X
	int sum2()
	{
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	
	//반환 X 매개변수 O
	void sum3(int x, int y)	//반환형이 없으면 return; 을 안쓴다.
	{
		System.out.println("sum3(x,y) = "+ (x+y));
	}
	
	//반환 X 매개변수 X
	void sum4()
	{
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println("sum4() = " + (x+y));
	}
	
}


public class C07SimpleMethodTest {

	public static void main(String[] args) {
		
		Sum calc = new Sum();	//Sum객체 생성 이후 calc 참조변수에 연결
		//반환 O 매개변수 O 
		int r1 = calc.sum1(10, 20);	//calc 객체의 sum1함수를 실행
		System.out.println("sum1(x,y) = " + r1);
		
		//반환 O 매개변수 X
		int r2 = calc.sum2();
		System.out.println("sum2() = " + r2);
		
		//반환 X 매개변수 O
		calc.sum3(12, 34);	//void 값은 다시 돌아오기 떄문에 "int r3=" <- 쓰면 안된다.
		
		//반환 X 매개변수 X
		calc.sum4();
		System.out.println("프로그램을 종료합니다.");
		
	}

}
