package CH28;

import java.io.DataInputStream;
import java.net.Socket;

public class ServerRecvThread  implements Runnable{
	Socket client;	//참조변수 메인스레드로부터 연결받기위해.
	DataInputStream Din;
	
	//스윙에 연결하기위해
	SGUI gui;
	
	public ServerRecvThread(Socket client, SGUI sgui) //서버 UI의 에어리어가 여기!
	{
		this.client = client;	
		this.gui = sgui;
	}
	
	
	@Override
	public void run() {
		try {
			Din = new DataInputStream(client.getInputStream());
			String recv;
			while(true)
			{
				recv = Din.readUTF();	// 클라이언트의 전달 메세지를 수신
				if(recv == null || recv.equals("q")) {
					gui.area.append("클라이언트와 연결을 종료합니다.");
					System.exit(-1);
				}
				gui.area.append("\r[Server] : " + recv + "\n");
			}
		}
		catch (Exception e) {e.printStackTrace();}
			
	}
	
}
