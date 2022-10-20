package Ch14EXEC;

class Employee	//직원
{
	String name;
	String age;
	String addr;
	
	public Employee(String name, String age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
}
class Parttimer extends Employee	//시간제
{
	int hourpay;

	public Parttimer(String name, String age, String addr, int hourpay) {	//상위 클래스 생성자에서 name,age,addr을 가져오고 추가로 int hourpay를 적어준다,
		super(name, age, addr);	// 상위클래스에서 불러오기 때문에 Super()안에 name,age,addr을 적어준다.
		this.hourpay = hourpay;	//상위클래스에서 추가된것이기 때문에 this.hourpay를 써준다.
	}

	@Override
	public String toString() {
		return "Parttimer [hourpay=" + hourpay + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	
}
class Regular extends Employee	//정규직
{
	int salary;

	public Regular(String name, String age, String addr, int salary) {
		super(name, age, addr);
		this.salary = salary;
	}

	@Override
	public String toString() {// to스트링 할때  필드까지 선택하면 전체 석택된다.
		return "Regular [salary=" + salary + ", name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

	

	
	
}



public class C03CPrac {

	public static void ShowInfo(Employee emp) {
		//다운캐스팅을 통해서 parttimer or regular를 선별해서
		//모든 정보를 출력해보세요
		
		System.out.println(emp.toString());
		
		
		if(emp instanceof Parttimer)	// Parttimer을 downcasting 한다.
		{
			Parttimer emp1 = (Parttimer)emp;
			System.out.println(emp1.name+ " " + emp1.age + " " + emp1.addr + " " + emp1.hourpay);
		}
		
		if(emp instanceof Regular)		// Regular을 downcasting 한다.
		{
			Regular emp2 = (Regular)emp;
			System.out.println(emp2.name + " " + emp2.age + " " + emp2.addr + " " + emp2.salary);

		}
		
	}
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동","25","대구",20000);
		Regular emp2 = new Regular("서길동","45","울산",50000000);
		ShowInfo(emp1);
		System.out.println("------------");
		ShowInfo(emp2);

	}
	
	
	
	//1 상속관계 만들기
	//2 적절한 생성자 만들기( super예약어 사용)
	//3 ShowInfo함수 안에서 Downcasting을 통해서 모든 멤버변수정보 출력하기
	
	
	
	
	
	
	
	

}
