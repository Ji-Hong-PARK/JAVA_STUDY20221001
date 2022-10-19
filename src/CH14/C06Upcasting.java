package CH14;

/*
다중 업케스팅을 만들어 보자.

*/
class A{int n1 = 10;}

class B extends A{int n2 = 20;}

class C extends A
	{
		int n3 = 30;
	}

class D extends B
{
	int n4 = 40;
}

class E extends C{}
class F extends E{}


public class C06Upcasting {

	public static void UpcastingTest(A tmp)// A tmp = ob1 
	{
		System.out.println(tmp.n1);
		//instanceof

		if (tmp instanceof B) 
		{
			B down = (B)tmp;
			System.out.println(down.n2);
		}
		if(tmp instanceof C)
		{
			C down = (C)tmp;
			System.out.println(down.n3);
		}
		
		if(tmp instanceof D)
		{
			D down = (D)tmp;
			System.out.println(down.n4);
		}
		
	}
	
	public static void main(String[] args) {
			
		B ob1 = new B();
		C ob2 = new C();
		D ob3 = new D();
		E ob4 = new E();
		F ob5 = new F();
		// ↑ 노캐스팅
		
//		UpcastingTest(ob1); // A tmp = ob1에서 받겠다.
//		UpcastingTest(ob2);
		UpcastingTest(ob3);
		//UpcastingTest(ob4);
//		UpcastingTest(ob5);
		
		
		

	}
}
