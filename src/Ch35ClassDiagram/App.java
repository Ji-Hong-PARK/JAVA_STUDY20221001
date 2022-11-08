package Ch35ClassDiagram;

public class App {

	public static void main(String[] args) {
	
		Temporary tmp = new Temporary("박치기",21,20,90000);
		tmp.showinfo();
		Reguler reg = new Reguler("홍길동",23,1234000);
		reg.showinfo();
		Sales sal = new Sales("한송이",25,2345000,3000,0.25);
		sal.showinfo();
		Manager manager = new Manager("한국인",27,2555000,0.6);
		manager.showinfo();
	}

}
