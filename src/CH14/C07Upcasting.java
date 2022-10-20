package CH14;

class C07Super
{
	int num1;
	public void sound()
	{
		System.out.println("Sound1()");
	}
}


class C07Sub extends C07Super
{
	int num2;	//확장
	public void move(){System.out.println("Sub1 move1()");}	//확장
	public void sound(){System.out.println("Sub's.Sound1()");	//재정의
	}
	
}

public class C07Upcasting {

	public static void main(String[] args) {
		
		//Upcsating 을 알아보자.
		
		C07Super ob = new C07Sub();	//확장된 num2에 접근가능?
									//확장된 move()를 사용할수 있을까?
									//재정의된 sound()를 사용할수 있는지?
		
		ob.num1 = 10;	//Super's
		//ob.num2 = 20;	//Sub's
		//ob.mover();
		ob.sound();

	}

}
