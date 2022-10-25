package CH19;

class Simple<T>
{
	T x;
	T y;
	Simple(T x, T y)
	{
		this.x = x; this.y = y;
	}
	void ShowMember()
	{
		System.out.println("X = " + x + ", Y = " + y);
	}
}
class Person
{
	String name;
	String addr;
	Person(String name, String addr)
	{
		this.name = name; this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + "]";
	}
	
	
}


public class C02Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple<Integer> ob1 = new Simple<Integer>(10,20);
		ob1.ShowMember();
		System.out.println();
		
		Simple<Person> ob2 = new Simple<Person>(new Person("홍길동", "대구")
												,new Person("서길동", "남해"));
		ob2.ShowMember();
	}

}
