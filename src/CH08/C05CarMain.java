package CH08;

class C05Car {

	String owner, model;
	int speed, fuel;
	
	//기능
	//가속 함수
	void accel()
	{
		//1 fuel 확인
		//2 speed 10증가
		//3 200km/h 제한
		//4 fuel 5 감소
		if(fuel -5 <= 0)
		{
			fuel -= 5; 
			System.out.println("가속불가 - [ERR]연료량이 부족합니다.");
		}
		else
		{
			fuel = -5;
			if(speed +10 >= 200)
			{
				speed =200;
				System.out.println("[WARN]최대속도입니다. 200Km/h");
			}
			else
			{
				speed += 10;
				System.out.println("[INFO]가속합니다.  현재속도 : "+speed + "km/h");
			}
		}
		
	}
	//감속 함수
	void Break()
	{
		//1 속도체크
		//2 속도감속(-5)
		if(speed -5 <= 0)
		{
			speed = 0;
			System.out.println("[ERR]감속불가 합니다. 현재속도 : 0 Km/h");
		}
		else
		{
			speed -= 5;
			System.out.println("[INFO]감속 합니다. 현재속도 :  Km/h" + speed + "Km/h");
		}
	}
	//정보확인
	void ShowInfo()
	{
		
	}
}



public class C05CarMain {

	public static void main(String[] args) throws InterruptedException {
		
		C05Car hong = new C05Car();
		hong.owner = "홍길동";
		hong.speed = 200;
		hong.fuel = 100;
		hong.model = "아반떼Xd";
		
		while(true)
		{
			//hong.accel();
			hong.Break();
			Thread.sleep(500);
		}
		
		
		
		
		
		
		
	}

}
