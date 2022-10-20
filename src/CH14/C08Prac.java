
package CH14;

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
	
	//업케스팅 할려고 한다.
	void Show()	// 오버라이딩 할려고 show 메소드를 임시로 만든거다.
	{
		
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
	void Show() {
		// TODO Auto-generated method stub
		super.Show();
		System.out.printf("시간제 근로자 : %s %s %s %d\n",name,age,addr,hourpay);
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
	void Show() {
		// TODO Auto-generated method stub
		super.Show();
		System.out.printf("정규 근로자 : %s %s %s %d\n",name,age,addr,salary);
	}
	
}



public class C08Prac {

	public static void ShowInfo(Employee emp) {
		//업캐스팅을 통해서 parttimer or regular를 선별해서
		//모든 정보를 출력해보세요
		
		emp.Show();
		
	}
	public static void main(String[] args) {
		Parttimer emp1 = new Parttimer("홍길동","25","대구",20000);
		Regular emp2 = new Regular("서길동","45","울산",50000000);
		ShowInfo(emp1);
		System.out.println("------------");
		ShowInfo(emp2);

	}

}
