package CH08;

//생성자 메서드(Method)
// 객체 생성시에 호출되는 특수한 메서드
// 객체 생성시에 1회만 호출
// 객체 생성시 필요한 초기값을 부여할수 있다.
// 클래스 내에 생성자 함수가 명시되지(코드삽입X) 않을경우
// 디폴트 생성자가 자동으로 주입되어서 사용

//생성자 함수(Method) 특징
// 생성자 함수는 클래스 이름과 동일해야 한다.
// 생성자 함수는 반환자료형을 가지지 않는다.

class C11Simple
{	
	//속성
	int x;
	int y;
	
	// 디폴트 생성자
	C11Simple()
	{
		System.out.println("디폴트 생성자 호출!");
		this.x = 100;
		this.y = 200;
	}
}


public class C11ConstructorMain {

	public static void main(String[] args) {
		
		C11Simple obj = new C11Simple();
		System.out.printf("x = %d   y = %d", obj.x,obj.y);	

		
		
		
	}

}
