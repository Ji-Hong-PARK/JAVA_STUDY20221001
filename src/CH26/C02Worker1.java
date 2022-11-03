package CH26;

public class C02Worker1 implements Runnable{

	@Override
	public void run() {
		// 해당 스레드들이 들어가야할 곳.
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("TASK1");
		}
		try {Thread.sleep(500);}catch(InterruptedException e) {e.printStackTrace();}
		
	}

	
		
		
	

}
