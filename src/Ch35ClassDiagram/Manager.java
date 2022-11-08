package Ch35ClassDiagram;

public class Manager extends Reguler{

	public double incentive;

	
	public Manager(String name,int age, int salary,double incen){
		super(name,age,salary);
		incentive=incen;
	}
	
	@Override
	double pay() {
		return salary+(salary*1.0*incentive); 
	}

//	@Override
//	public String toString() {
//		return "이름 : " + name+" , 나이 : "+age+" , 수령액 : "+pay()+"원";
//	}
	
	
	
}
