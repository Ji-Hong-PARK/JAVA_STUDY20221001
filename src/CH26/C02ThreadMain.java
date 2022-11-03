package CH26;

public class C02ThreadMain {

	public static void main(String[] args) throws Exception{
		
		//작업스레드 객체 생성
		C02Worker1 worker1 = new C02Worker1();
		C02Worker2 worker2 = new C02Worker2();
		
		//독립된 스레드 공간에 작업스레드 전달
		Thread th1 = new Thread(worker1);
		Thread th2 = new Thread(worker2);
		
		
		//스레드 실행
		th1.start();
		th2.start();
		
		// 메인 스레드에서의 실행 흐름
		for(int i = 0; i < 5; i++)
		{
			System.out.println("MAINThread");
			Thread.sleep(800);
		}
		
	}

}
