package CH27;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {
	
	public static void main(String[] args) throws Exception{
		
		
		//1 전화받는 작업
		ServerSocket server = new ServerSocket(8888);
		System.out.println("서비스 실행...");
		
		//2 클라이언트에게 연결하는 작업.
		Socket client = server.accept();
		System.out.println(client.getInetAddress() + " 에서 접속!");
		
		//3 송수신 스레드객체를 만들어서 접속
		ServerRecvThread recv = new ServerRecvThread(client);
		ServerSndThread send = new ServerSndThread(client);
		Thread th1 = new Thread(recv);
		Thread th2  = new Thread(send);
		
		//4 스레드 실행 
		th1.start();
		th2.start();
		
	}

}
