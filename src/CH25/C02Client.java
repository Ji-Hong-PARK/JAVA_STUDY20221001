package CH25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {

	public static void main(String[] args) throws Exception {
		Socket client = new Socket("192.168.14.136",6060);
		System.out.println("서버와 연결이 완료되었습니다");
		DataInputStream Din = new DataInputStream(client.getInputStream());
		DataOutputStream Dout = new DataOutputStream(client.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		String recv=null;
		String send=null;
		
		while(true)
		{
			System.out.print("[Client (q:종료)] : " );
			send=sc.nextLine();
			System.out.println(send);
			Dout.writeUTF(send);
			Dout.flush();
			if(send.equals("q"))
				break;
			
			recv=Din.readUTF();
			if(recv.equals("q"))
				break;
			System.out.println("[Server ] : "+ recv);	
		}
		
		Dout.close();
		Din.close();
		client.close();
		System.out.println("서버와 연결을 종료합니다");
		

	}

}
