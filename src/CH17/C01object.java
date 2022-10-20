package CH17;


class A
{
	int x = 10; 
	int y = 20;
	
	@Override
	public String toString() {
		return "x = " + x + "," + "y = " + y ;
	}	
}

public class C01object {

	public static void main(String[] args) {
		
		Object ob1 = new Object();
	
		System.out.println(ob1.toString());
		System.out.println(ob1);
		
		A ob2 = new A();
		System.out.println(ob2.toString());
		System.out.println(ob2);
	}
}
