package Ch35ClassDiagram;

public abstract class Employees {
	
	public String name;
	public int age;
	
	protected Employees(){}
	public Employees(String name2) {
		this.name=name2;
	}
	public Employees(String name2, int age2) {
		this.name=name2;
		this.age=age2;
	}
	abstract double pay();
	abstract void showinfo();
	

}
