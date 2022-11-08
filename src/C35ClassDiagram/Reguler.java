package C35ClassDiagram;

public class Reguler extends Employees{

	public int salary;
	
	Reguler(){} //디폴트 생성자 만들고
	Reguler(String name, int age, int salary){
		super(name, age);
		//this.age = age;
		this.salary = salary;
	}
	
	@Override
	double pay() {
		
		return salary;
	}

	@Override
	void showinfo() {
		System.out.println(toString()); // 밑에 toString가 출력이된다.
		
	}

	@Override// 내용출력하기위해 여기서 투스트링을 한다.
	public String toString() {
		return "이름 : " + name + ",나이 : " + age + ", 급여 : " + pay()+ " 원";
	}
	

}
