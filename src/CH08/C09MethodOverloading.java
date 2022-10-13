package CH08;

class C09Simple
{
	String name;
	int sum(int x, int y)
	{
		System.out.println("sum(int, int)호출 !");
		return x+y;
	}
	
	double sum(double x, double y)
	{
		System.out.println("sum(double, double)호출 !");
		return x+y;
	}
	
	int sum(int x, int y, int z)
	{
		System.out.println("sum(int, int, int)호출 !");
		return x+y+z;
	}
	
	int sum(String str1, int x, int y)
	{
		System.out.println("sum(String, int, int)호출 !");
		name = str1;
		return x+y;
	}
	
}


public class C09MethodOverloading {

	public static void main(String[] args) {
		
		C09Simple obj = new C09Simple();
		//obj.sum(10, 20);
		//obj.sum(10.2, 10.3);
		//obj.sum(10, 20, 30);
		obj.sum("홍길동", 10, 20);
		
	}

}
