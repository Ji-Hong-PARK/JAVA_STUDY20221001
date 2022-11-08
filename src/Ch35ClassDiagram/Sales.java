package Ch35ClassDiagram;

public class Sales extends Reguler{
	public int recode; //실적
	public double commission; //수수료
	
	
	
	
	public Sales(String name, int age, int salary, int recode, double commission) {
		super(name,age,salary);
		this.recode=recode;
		this.commission=commission;
	}



	@Override
	double pay() {
		return salary+(recode*commission);
	}



//	@Override
//	public String toString() {
//		return "이름 : " + name+" , 나이 : "+age+" , 수령액 : "+pay()+"원";
//	}
	
	
}
