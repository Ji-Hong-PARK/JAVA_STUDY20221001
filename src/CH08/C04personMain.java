package CH08;


class C04Person{
	//속성 (= 필드, 멤버변수)
	
	String name;
	int age;
	String addr;
	
	//기능(멤버메서드)
	void talk() // 머리  (반환명 + 함수명 + 매개변수)
	{				
		System.out.println(name + "님이 말합니다.");   //본체 (머리에 대한 로직)
	}
	void walk() 
	{
		System.out.println(name + "님이 걷습니다."); // void name(맴버변수)를 class name(맴버함수를 사용한다)
	}
	void ShowInfo()
	{
		System.out.printf("이름 : %s 나이 : %d 주소 : %s\n",name,age,addr);
	}
}

public class C04personMain {

	public static void main(String[] args) {
		
		C04Person hong = new C04Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.addr = "대구대구대구";
		
		System.out.printf("%s %d %s\n",hong.name,hong.age,hong.addr);
			
		hong.talk();
		hong.walk();
		hong.ShowInfo();
		// 출력 순서는 메인 함수 위에서 아래로  

	}

}
