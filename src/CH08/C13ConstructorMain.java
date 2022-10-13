package CH08;

import java.util.Scanner;

class C13Simple
{	
	//속성
	int x;			// 0
	double y;		// 0.0
	char z;			// ' '
	boolean b;		// false
	String str;		// null
	
	// 디폴트 생성자
	C13Simple()
	{
		System.out.println("디폴트 생성자 호출!");
		
	}
	
	//생성자 함수 오버로딩
	C13Simple(int x)
	{
		this.x = x;
		System.out.println("C13Simple(int) 생성자 호출!");
	}
	//생성자 함수 오버로딩(int, double) 
	C13Simple(int x, double y)
	{
		this.x=x;
		this.y=y;
		System.out.println("C13Simple(int,double) 생성자 호출!");
	}
	
	
	
	
	// 우클릭 ->  소스 -> Generate to String() 선택
	@Override
	public String toString() {
		return "C13Simple [x=" + x + ", y=" + y + ", z=" + z + ", b=" + b + ", str=" + str + "]";
	}	
	
}


public class C13ConstructorMain {

	public static void main(String[] args) {
		
		C13Simple obj = new C13Simple();		//디폴트 생성자
		System.out.println(obj.toString());
		
		C13Simple obj2 = new C13Simple(101);	//int받은 생성자
		System.out.println(obj2.toString());
		
		C13Simple obj3 = new C13Simple(10,12.34);
		System.out.println(obj3.toString());
		
		// 객체?				: 존재 사물 -> 공간차지하는 사물 -> 메모리 공간
		// 인스턴스?			: 객체가 추상화 과정을 통해 자바프로그램 내의 메모리공간에 저장된 상태 
		// 객체구조?			: 속성/ 기능/ 생성자 
		// 클래스?			: 객체 생성 위한 자료형 (객체생성 공간을 만들고 자료를 준다)
		
		// 기본코드?			:  
		//	  클래스   참조변수	  힙영역에 공간 할당		생성자	인자/인수
		//  - Scanner sc 	= new 				Scanner(System.in);
		
		// 멤버변수?			: 속성,필드-> 객체의 개별정보 저장용
		// 멤버메서드?			: 기능 -> 액션, 동사형(문법),특정 역활 수행위한 코드블럭
		
		// 메서드 기본구조?		: 함수헤더부분은 정보를 알수있는부분, 바디부분은 행동하는 로직 
		// 	- 함수의 헤더부분(반환자료형 함수명 (파라미터..)) + 함수의바디부분(로직)을 가지고 있다.
		
		// 메서드 오버로딩?		: 메서드 파라미터의 형태를 다양하게 둘 수 있도록 허용한 문법
		// 지역변수?			: {....} <- 내에서 선언되는 변수, { } 벗어나면 기본적으로 소멸
		// 생성자?			: 객체 생성시1회 호출, 기본값 Setup 사용 메서드(함수)
		
		// 생성자 오버로딩?		: 생성자 함수의 파라미터형을 다양하세 허용함으로써,
		//						외부로부터의 다양한 초기값을 허용
		
	}

}
