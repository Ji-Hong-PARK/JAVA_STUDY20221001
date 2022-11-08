package C35ClassDiagram;

public class Manager extends Reguler{
	
	public double incentive;

	public Manager(String name, int age, int salary, double incen){
		super(name,age,salary);
		incentive = incen;
	}
	
	@Override
	double pay() {
		return salary + (salary * 1.0 * incentive); //외부에서 if문을 쓸것이다. 200만이상 250만이상 등 그리고 0.6은 반올림해서 1.0으로적는다
		
	}
	
	@Override
	public String toString() {
			return "이름 : " + name + ",나이 : " + age + ", 수령액 : " + pay()+ " 원";
		
	}
}
