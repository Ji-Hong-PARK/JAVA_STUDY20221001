package CH02;

public class C03변수 {

	public static void main(String[] args) {
		//변수  =	 변   수(저장되는 공간에 들어가는 수)
		//		 변 (변화되는 수)
		
		int num1;  //int = 자료형이다, 4바이트의 정수공간을 생성하고 + 그공간에 num1이라는 이름을 만든다. 
		num1 = 10; // num1 = 공간, 10 = 값 (오른쪽을 먼저 처리한다) , 10상수값을 num1공간에 대입
		
		int num2 = 4; // 4상수값을 4byte 정수 num2공간에 초기화
		
		int num3 = num1 + num2; // 오른쪽 num1 + num2 = 값이라고 말한다
		//num1값 + num2값을 4byte 정수 num3공간에 초기화를 한다.
		
		System.out.println(num3);// 함수의 인자로 변수명이 사용되면 값으로 해석
								// num3안의 값을 println
		
		
//		자바의 기본 자료형  = 정수형 	byte 	= 1byte
//								char 	= 2byte , 부호 X
//								short	= 2byte , 부호 O
//								(기본)int	= 4byte , 부호 O
//								long	= 8byte ,
//						
//								
//					   = 실수형	float 	= 4byte
//					    		double	= 8byte
//					    		
//					   = 논리형	boolean = true / false 두가지의 답을 말한다.
	}

}
