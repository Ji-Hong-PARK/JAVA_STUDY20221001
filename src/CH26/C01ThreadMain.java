package CH26;

public class C01ThreadMain {

	public static void main(String[] args) {
		
		//메인 스레드에서 실행 흐름 (위에서 부터 아래로 순차적으로)
		for(int i = 0; i < 5; i++)
		{
			System.out.println("TASK1");
			try
			{
				Thread.sleep(500);
			}
			catch (Exception e) 
			{
	
			}
		}
		for(int i = 0; i < 5; i++)
		{
			System.out.println("TASK2");
		}
		try {Thread.sleep(500);}catch (Exception e) {}

	}

}
