package CH27;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientsSndThread implements Runnable{
	Socket client;
	DataOutputStream Dout;
	Scanner sc = new Scanner(System.in);
	public ClientsSndThread(Socket client) {
		this.client = client;
	}
	
	@Override
	public void run() {
		try {
			Dout = new DataOutputStream(client.getOutputStream());
			String send;
			while(true)
			{
				System.out.println("[client] : ");
				send = sc.nextLine();
				Dout.writeUTF(send);
				if(send == null || send.equals("q"))
				{
					System.out.println("프로그램을 종료합니다.");
					System.exit(-1);
				}
				Dout.flush();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
