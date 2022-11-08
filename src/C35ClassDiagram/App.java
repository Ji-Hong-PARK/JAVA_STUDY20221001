package C35ClassDiagram;

public class App {

	public static void main(String[] args) {
		
		Temporary tmp = new Temporary("박치기", 21, 20, 90000);
		
		
		tmp.showinfo(); // Temporary [ilsu=20, ildang=90000, name=박치기, age=21]
		
		Reguler reg = new Reguler("홍길동",23,1234000);
		reg.showinfo(); //Reguler [salary=1234000, name=홍길동, age=23]
		
		Sales sal = new Sales("한송이",25,2345000,3000,0.25);
		sal.showinfo(); //Sales [recode=3000, commission=0.25, salary=2345000, name=한송이, age=25]
		
		Manager = manager = new Manager("한국인", 27, 2555000, 0.6);
		manager.showinfo();

	}

}
