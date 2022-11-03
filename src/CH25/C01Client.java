package CH25;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class C01Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Socket client = new Socket("192.168.3.79",5050);
		//Socket client = new Socket("192.168.3.254",5050);//강사님 ip
		//Socket client = new Socket("192.168.3.124",5050);//용체 ip
		Socket client = new Socket("192.168.3.12",5050);
		
		
		InputStream in = client.getInputStream();
		DataInputStream Din = new DataInputStream(in);
		
		System.out.println("---------- 서버 메세지 START -----------");
		System.out.println(Din.readUTF() + "\n");
		System.out.println("---------- 서버 메세지 END ------------");
	}

}
