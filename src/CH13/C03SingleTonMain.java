package CH13;

// 싱글패턴 4일차에  내부평가 나옴.오늘이 1일차

class C03Company
{	//멤버 변수
	int x;
	int y;
	private static C03Company instance;//프라이빗(은닉) 스테틱 () 자료형(주소값)
	
	//생성자
	private C03Company()
	{
		x = 10;
		y = 20;
	}
	
	//멤버 함수
	public static C03Company getInstance()
	{
		if(instance == null)
		{
			instance = new C03Company();
		}
		return instance;
	}
}


public class C03SingleTonMain {

	public static void main(String[] args) {
		
		C03Company myCompany1 = C03Company.getInstance();
		C03Company myCompany2 = C03Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
		
		System.out.println("myCompany1 : " + myCompany1.x);
		System.out.println("myCompany2 : " + myCompany2.x);
		
		System.out.println("myCompany1 : " + myCompany1.y);
		System.out.println("myCompany2 : " + myCompany2.y);
	}

}
