package CH08;


class C02Person{
	String name;
	int age;
	String addr;
}

public class C02personMain {

	public static void main(String[] args) {
		
		C02Person hong = new C02Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.addr = "대구대구대구";
		
		System.out.printf("%s %d %s\n",hong.name,hong.age,hong.addr);
			
		

	}

}
