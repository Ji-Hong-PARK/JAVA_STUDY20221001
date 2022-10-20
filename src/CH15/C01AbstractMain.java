package CH15;

class par1
{
	void method1()
	{
		//일반메서드
	}
}
class son1 extends par1
{
	void method1()
	{
		System.out.println("son1 의 자율적 재정의된 메서드");
	}
}
//-------------------------------추상 클래스 상속관계------------------------------------
abstract class par2
{
	//추상메서드
	abstract void method2();
}
class son2 extends par2
{
	@Override
	void method2() 
	{
		System.out.println("son2의 강제 재정의된 메서드");
	}
	
}


public class C01AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일반 클래스
		par1 obj1 = new par1();			//상위클래스로 객체 생성가능
		son1 obj2 = new son1();			//하위클래스로 객체 생성 가능
		obj1 = obj2;					//업캐스팅(자동형변환)
		obj1.method1();					//재정의된 메서드 이용가능
		
		//추상 클래스
		
//		par2 obj3 = new par2();			//추상클래스로 객체 생성 불가능
//		par2 obj3 = null;				//추상클래스로 참조변수 생성가능.
		son2 obj4 = new son2();			//하위클래스에서 추상메서드가 재정의되었다면 객체 생성가능 
		
	}

}
