package Ch36ClassDiagram;

public class Person implements ToDo{
	
	private String name;
	private int age;
	private String address;
	
	
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	@Override
	public void eat() {
		System.out.println(name+" 이 음식을 먹습니다.");
	}
	@Override
	public void sleep() {
		System.out.println(name+" 이 잠을 잡니다.");
	}
	void drive(Car car) {
		car.move();
	}
}
