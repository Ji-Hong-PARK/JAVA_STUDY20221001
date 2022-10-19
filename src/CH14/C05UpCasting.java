package CH14;

class C05Super
{
	int num1;
}

class C05Sub extends C05Super
{
	int unm2;	//확장
}




public class C05UpCasting {

	public static void main(String[] args) {
		
		//Nocasting
		C05Super ob1 = new C05Super();
		ob1.num1 = 100;
		C05Sub ob2 = new C05Sub();
		//앞에	C05Sub <- 이건 범위라고 생각!
		ob2.num1 = 10;ob2.unm2=20;
		
		
		// Upcasting(상위 클래스 참조 변수 = 하위객체)
		C05Super ob3 = new C05Sub(); 	// 하위객체에서는 num1,num2가있지만 상위클래스로 접근하면 상위클래스가 가지고있는num1만 인식한다.
		ob3.num1 = 10; //가능
		//ob3.num2 = 20; //불가능 못불러 온다.(참조변수가 num2를 찾지못함)
		
		
		// Downcasting
		//C05Sub down = ob3; //컴파일에러발생 왜?
		//↑하위클래스 	   //↑상위클래스	 	//자료형이 안맞아서 컴파일에서 오류라고 인식한다.
		  
		C05Sub down =(C05Sub)ob3;
		down.unm2 = 10;
		
		// 노캐스팅은 형변환이 없다. 
		// 업캐스팅은 많이 쓴다 모든 문법에 적용한다(웹관련 작업을 하면 프레임워크라는 도구라는 걸 쓰는데 이게 상속관계를 작용한다.)
		//	- 상속관계되어있는 하위객체를 상위클래스가  접근하기 위해 많이 쓴다.(자동형변환)
		// 단점은 하위클래스에서 추가하면 접근을 못한다.
		
		// 다운캐스팅은 (강제 형변환)
		// 강제형변환을 무족건 해줘야 한다!
		// 
		
	}

}
