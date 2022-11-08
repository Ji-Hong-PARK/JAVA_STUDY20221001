package C35ClassDiagram;

public abstract class Employees {

	public String name;
	public int age;
	
	protected Employees(){} // 디폴트 생성자를 만들어서 protected넣어도되고 안넣어도되고 이렇게 적어야 레귤러에서 디폴트값이 먹힌다.
	public Employees(String name2) {
		this.name = name2;
	}
	
	public Employees(String name2, int age2) {
		this.name = name2;
		this.age = age2;
	}
	abstract double pay();
	abstract void showinfo();
	
	
}
