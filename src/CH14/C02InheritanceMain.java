package CH14;



//상속관계에서 생성자 호출
//상위클래스의 생성자 호출 -> 하위클래스 생성자 호출
//상위 클래스 생성자 호출  super() 예약어를 사용하여 상위 클래스의 오버로딩된 생성자에
//접근이 가능하다.

class Parent
{
	int x;
	int y;
	int z;
	Parent()
	{
		System.out.println("parent()  생성자 호출!");
	}
	Parent(int x)
	{
		System.out.println("Parent(x)  생성자 호출!");
		this.x = x;
	}
	Parent(int x, int y)
	{
		System.out.println("Parent(x,y)  생성자 호출!");
		this.x = x;
		this.y = y;
	}
	Parent(int x, int y,int z)
	{
		System.out.println("Parent(x,y,z)  생성자 호출!");
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
class Son extends Parent
{
	int  z;
	Son()
	{
		//super(10);	//상위클래스 인자하나를 받아 생성자 호출!
		super();	//상위 클래스 디폴트 생성자 호출
		System.out.println("son() 생성자 호출!");	
	}
	Son(int x, int y,int z) {
		super(x, y, z);
		this.z = z;
		//super(10,20,30);
		System.out.println("Son(int x, int y, int z) 생성자 호출!");
	}
//	Son(int x, int y, int z) {	//이렇게도 쓸수 있다.
//		super(x, y, z);
//		//super(10,20,30);
//		System.out.println("Son(int x, int y, int z) 생성자 호출!");
//	}
	Son(int x, int y) {
		super(x,y);
		//super(10,20);
		System.out.println("Son(int x, int y) 생성자 호출!");
	}
	Son(int x) 
	{
		super(x);
		//this.x = x; 이렇게 써도 되지만 super를 써보자.
		System.out.println("Son(int x) 생성자 호출!");
	}
	
	// toString 해서 x,y,z 값 보기.(나중에)
	@Override
	public String toString() {
		return "Son [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}


public class C02InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Son ob1 = new Son();	
		Son ob2	= new Son(10);		// X 멤버에 10 값 넣기 super 예약어 사용
		Son ob3	= new Son(10, 20);	// x,y 멤버에 10,20 값 넣기
		Son ob4	= new Son(10,20,30);// x,y,z 멤머에 10,20,30 값 넣기
		
		
		
	}

}
