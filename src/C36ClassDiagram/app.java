package C36ClassDiagram;

public class app {

	public static void main(String[] args) {
		
		Lecture 이산수학 = new Lecture(1010L, "이산수학");
		Lecture JAVA = new Lecture(2020L, "JAVA");
		Lecture Servlet = new Lecture(3030L, "Servlet");
		
		
		Student 홍길동 = new Student("홍길동", 25, "대구", 20221010L,"컴퓨터공학");
		Student 남길동 = new Student("남길동", 21, "구미", 20211011L,"컴퓨터공학");
		홍길동.addSubject(이산수학);
		홍길동.addSubject(JAVA);
		남길동.addSubject(이산수학);
		
		System.out.println(이산수학);
		
		
	}

}
