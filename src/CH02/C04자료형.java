package CH02;

public class C04자료형 {

	public static void main(String[] args) {
		
		
		//---------------------------
		// 정수
		//---------------------------
		// int : 4byte 정수, 기본자료형
		
		//int n1 = 0b1111;	// 2진수
		
//		int n1 = 0b10101101;// 2진수
//		int n2 = 173;		// 10진수
//		int n3 = 0255;		// 8진수
//		int n4 = 0xad;		// 16진수
//		System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
		
		
		
		
		//byte : 1byte 정수, 부호 O
		//int 공간에는  -128 ~ 127 까지의 숫자가 들어간다.
		
//		byte n1 = -128;
//		byte n2 = -30;
//		byte n3 = 30;
//		byte n4 = 127;
//		//byte n5 = 128; // ERROR..  why?
//		byte n5 = (byte)128; //강제형변환 해서  출력되게 만든다. 대신에 -128로 출력이된다.
//		
//		System.out.printf("%d\n", n5);
		
		
		
		//short VS char 비교
		//char		:	2byte 정수 부호 X, 단일문자 저장용으로 주로 사용
		//short		:	2byte 정수 부호 O, 
		
//		char  n1 = 60000; // 0 ~ (2^16-1) / 0 ~65536
//		//short n2 = 60000; // ?? 
//		short n2 = 32767; // -32768 ~ 32767 까지의 숫자만 허용된다. -2^15 ~ (2^15-1) 
//		
//		char n3 = 60000;
//		//short n4 = n3; // 크기가 앉맞아서 오류
//		short n4 = (short)n3;  //강제 형변환을 해서 출력을하면  -5536가 나온다.
//		System.out.println(n4);
//		System.out.println(n3);
		
		
//		8bit -> 1byte 부호 O
//		00000000
//		10000000
//		
//		0 -127
//		-2^7 ~ (2^7-1)
//		-128 ~ 127
//		
//		
//		short = 16비트 부호O
//		00000000 00000000
//		양수 : 0-(2^15-1)
//		음수 : -2^16
//		
//		-2^15 ~ (2^15-1)
//		-32768 ~ 32767
//		
//		
//		char = 16비트 부호 X
//		0 ~ 2^16
//		0 ~ 655
		
		
		//long	: 8byte 정수
		
//		long n1 = 10;	//리터럴 접미사 x -> 기본자료형(int)
//		long n2 = 20L;	//리터럴 접미사 L,l : long 자료형
//		
//		long n3 = 10000000000;	//ERROR.. WHY?
//		long n4 = 10000000000L;
		

		//---------------------------
		// 실수
		//---------------------------
		
		
		// float : 4byte 실수(6 -9 자리)
		// double : 8byte 실수(기본값)(15 - 18 자리)
		
//		float n1 = 3.14f;	//리터럴접미사 F,f : float 자료형
//		double n2 = 3.14;	//리터럴접미사x -> 기본자료형(double)
//		
//		//정밀도 확인
//		float n3 = 0.123456789123456789F;
//		double n4 = 0.123456789123456789;
//		System.out.println(n3);
//		System.out.println(n4);
//		
//		//고정 소수점 방식      : 소수점의 위치가 고정
//		//부동 소수점 방식(기본) : 소수점의 위치가 가변
//		
//		//구글에서 단정밀도 배정밀도 검색!/////////////////////////////////////////////////////////
//		
//		
//		// 지수형으로 표현
//		double n5 = 3e6; //3*10^6
//		double n6 = 2e-4; //3*10-4
//		System.out.println(n5);
//		System.out.println(n6);
		
		//---------------------------
		// 단일문자
		//---------------------------
		//char 2byte 문자 저장 자료형
		
//		char ch1 = 'A';
//		char ch2 = '가';
//		short ch3 = 'A';	//약 -30000 ~+ 30000
//		short ch4 = (short)'가';	//범위 
//		System.out.println(ch1);
//		System.out.printf("%c\n", ch1);
//		System.out.printf("%d\n",(int)ch1);
//		System.out.println(ch4);
//		System.out.println((int)ch2); //문자는 숫자로도 확인 가능하다.
//		
//		int n1 = 44032;
//		//int n1 = 44033;
//		//int n1 = 44034; // 44033,44034랑  각각 다르게 출력이된다.
//		System.out.printf("%d %c\n", n1,n1); // 숫자,문자로 각각 표현
//		System.out.printf("%c\n", '\uACA2'); //   \ u : 유니코드 적용 서식문자
			
		
		//---------------------------
		// 문자열 : String
		//---------------------------
		//String : 클래스 자료형.. - 객체지향 파트에서 다시 설명
		
//		String name = "홍길동"; //참조변수 name에는
//		
//		String job = "프로그래머";	//문자열이 저장된 위치값(메모리주소)가 저장
//		name += " 입니다";
//		
//		System.out.println(name);
//		//System.out.println("%x\n",System.identityHashCode(name));
//		System.out.println(job);

		
		//---------------------------
		// boolean : 논리형(true/false 저장)
		//---------------------------
		//
		//true(참)		:0이 아닌 모든 값
		//false(거짓)		:0
//		boolean flag = true;
//		if(flag)
//		{
//			System.out.println("참인경우 실행~");
//		}
//		else
//		{
//			System.out.println("거짓인경우 실행~");
//		}
//		System.out.println(flag);
		
		

//////////////////////////////////////////////////////////선생님 문제		
//		정수 타입 		: byte,short,int ,long
//		char 타입 	: ' ' 
//		String 타입 	: " "
//		실수 타입 		: double , float
//		논리 타입 		: boolean
	//
	//
//		확인 문제1
	//
//		정수타입 
//		1byte : byte
//		2byte : short
//		4byte : int
//		8byte : long
	//
//		실수타입
//		4byte : float
//		8byte : double
	//
//		논리타입
//		1byte : boolean
	//
	//
//		확인문제2
	//
//		맞는 코드인지 틀린 코드인지 확인 
//		byte var = 200;							(x	)
//		char var='AB';							(x	)
//		char var=65;							(o	)
//		long var=50000000000;					(x	)	
//		float var = 3.14						(o	)
//		double var = 100.0						(o	)
//		String var = "나의직업은 "개발자" 입니다.";	(o	)
//		boolean var = 0;						(o	)
//		int v2 = le2;							(x	)
//		float =1e2f;							(x	)
		
		
	}

}
