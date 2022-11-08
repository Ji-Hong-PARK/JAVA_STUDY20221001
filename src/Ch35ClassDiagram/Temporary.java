package Ch35ClassDiagram;

public class Temporary extends Employees{

	public int ilsu;
	public int ildang;
	
	Temporary(String name,int age, int ilsu,int ildang){
		super(name,age);
		this.ilsu = ilsu;
		this.ildang = ildang;
	}
	
	@Override
	double pay() {
		return ilsu*ildang;
	}

	@Override
	void showinfo() {
		System.out.println(toString());
		
	}

	@Override
	public String toString() {
		return "이름 : " + name+" , 나이 : "+age+" , 월급 : "+pay()+"원";
	}
	
	
}
