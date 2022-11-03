package CH27;


import java.net.Socket;

public class ClientChat {
			
	public static void main(String[] args) throws Exception{
		
	
			//1
			Socket client = new Socket("서버IP" , 8888);
			
			//3 송수신 스레드객체를 만들어서 접속
			ClientRecvThread recv = new ClientRecvThread(client);
			ClientsSndThread send = new ClientsSndThread(client);
			Thread th1 = new Thread(recv);
			Thread th2  = new Thread(send);
			
			//4 스레드 실행 
			th1.start();
			th2.start();
	}	
}
