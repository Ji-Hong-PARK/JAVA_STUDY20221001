package Ch08EXEC;


class C05Car
{
	String owner;
	int speed;
	int fuel;
	String model;
	
	//기능
	//가속함수
	void Accel() {
		//1 fuel 확인
		//2 speed 10증가
		//3 200km/h 제한
		//4 fuel 5 감소 
		if(fuel-5<=0) {
			fuel=0;
			System.out.println("[ERR]가속불가 - 연료가 부족합니다.");
		}else {
			fuel-=5;
			if(speed+10>=200) {
				speed=200;
				System.out.println("[WARN]최대속도입니다. 200km/h");
			}else {
				speed+=10;
				System.out.println("[INFO]가속합니다. 현재속도 : "+speed+"km/h");
			}
		}	
	}
	//감속함수
	void Break() {
		//1 속도체크 
		//2 속도감속(-5)
		if(speed-5<=0) {
			speed=0;
			System.out.println("[INFO]감속불가 합니다. 현재속도 : 0km/h");
		}else {
			speed-=5;
			System.out.println("[INFO]감속합니다. 현재속도 : "+speed+"km/h");
		}
	}
	
	C05Car(){}
	C05Car(String owner, int speed, int fuel, String model)
	{
		this.owner = owner;
		this.speed = speed;
		this.fuel = fuel;
		this.model = model;
	}
	C05Car(String owner, int fuel, String model, int speed)
	{
		this.owner = owner;
		this.speed = speed;
		this.fuel = fuel;
		this.model = model;
	}
	C05Car(String owner, String model, int fuel, int speed)
	{
		this.owner = owner;
		this.speed = speed;
		this.fuel = fuel;
		this.model = model;
	}
	@Override
	public String toString() {
		return "C05Car [owner=" + owner + ", speed=" + speed + ", fuel=" + fuel + ", model=" + model + "]";
	}
	
 
}
public class C05CarMain {

	public static void main(String[] args) throws InterruptedException {
		
		//다음 코드가 문제 없도록 클래스 구성을 합니다
		//toString() 코드 삽입으로 멤버변수 값 확인합니다
		
		C05Car ob = new C05Car();
		
		C05Car ob1  = new C05Car("홍길동",0,100,"코나"); //owner,speed,fuel,model
		System.out.println(ob1.toString());
		C05Car ob2  = new C05Car("서길동",50,"아반떼",0);	//owner,fuel,model,speed
		System.out.println(ob2.toString());
		C05Car ob3  = new C05Car("김철수","그렌저",0,0); //owner,model,fuel,speed
		System.out.println(ob3.toString());
	
		

		
		
		
	}

}
