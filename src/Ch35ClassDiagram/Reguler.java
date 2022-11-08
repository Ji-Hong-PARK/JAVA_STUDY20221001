package Ch35ClassDiagram;

public class Reguler extends Employees{

	public int salary;
	
	Reguler(){}
	Reguler(String name,int age,int salary){
		super(name,age);
		this.salary = salary;
	}
	
	@Override
	double pay() {
		return salary;
	}

	@Override
	void showinfo() {
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "이름 : " + name+" , 나이 : "+age+" , 급여 : "+pay()+"원";
	}
	

}
