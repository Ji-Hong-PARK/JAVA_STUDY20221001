package Ch08EXEC;

import java.util.Scanner;

class C04Person{
	//속성(=필드,멤버변수)
	String name;
	int age;
	String addr;
	//기능(멤버매서드)
	void talk() {
		System.out.println(name+"님이 말합니다.");
	}
	void walk() {
		System.out.println(name + "님이 걷습니다.");
	}
	void ShowInfo() {
		System.out.printf("이름 : %s 나이 : %d 주소 : %s\n" , name,age,addr);
	}
	
	C04Person() {
		
	}
	C04Person(String name)
	{
		this.name = name;
	}
	C04Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	C04Person(String name,int age,String addr)
	{
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "C04Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
}

public class C04PersonMain {

	public static void main(String[] args) {
		
		//다음코드가 성립될수 있도록 생성자함수를 오버로딩 합니다
		//toString()코드 삽입을 통해서 결과 확인합니다
		C04Person ob1 = new C04Person();
		System.out.println(ob1.toString());
		C04Person ob2 = new C04Person("홍길동");
		System.out.println(ob2.toString());
		C04Person ob3 = new C04Person("서길동",22);
		System.out.println(ob3.toString());
		C04Person ob4 = new C04Person("남길동",30,"대구");
		System.out.println(ob4.toString());

	}

}
