package CH25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02Server {
	public static void main(String[] args)  throws Exception{
		ServerSocket server = null;
		Socket client = null;
		InputStream in = null;
		DataInputStream out = null;
		
		server = new ServerSocket(6060);
		System.out.println("Server Started...");
		
		client = server.accept();
		System.out.println(client.getInetAddress() + " 에서 접속합니다.");
		
		DataInputStream Din = new DataInputStream(client.getInputStream());
		DataOutputStream Dout = new DataOutputStream(client.getOutputStream());
		
		Scanner sc = new Scanner(System.in);
		String recv=null;
		String send=null;
		while (true) {
			recv = Din.readUTF();	
			if(recv.equals("q"))
				break;
			System.out.println("[Client] : " +recv);
			System.out.print("[Server(q:종료)] : ");
			send=sc.nextLine();
			Dout.writeUTF(send);
			Dout.flush();
			if(send.equals("q"))
				break;
		}
		Dout.close();
		Din.close();
		client.close();
		server.close();
	}
}
