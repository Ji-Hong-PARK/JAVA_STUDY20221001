package Ch34ClassDiagram;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Marine mar1 = new Marine(new Rifle(),"마린1");
		Marine mar2 = new Marine(new Rifle(),"마린2");
		
		while(true)
		{
			mar1.Attack(mar2);
			Thread.sleep(500);
		}

	}

}
