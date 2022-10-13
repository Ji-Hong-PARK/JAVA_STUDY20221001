package CH08;

public class C01PersonMain {

	public static void main(String[] args) {
		
		C01Person hong = new C01Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.5;
		System.out.printf("%s %d %f %f\n",hong.name,hong.age,hong.height,hong.weight);
		
	}

}
