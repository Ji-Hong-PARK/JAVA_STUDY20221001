package CH25;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {

	public static void main(String[] args) throws Exception {
		// 소셋서버를 만들면서 포트번호를 적용한다.
		ServerSocket server = new ServerSocket(5050); //ip주소 : 192.168.3.79:5050
		System.out.println("Server Start!!..");
		Socket client = server.accept();
		
		
		OutputStream out = client.getOutputStream(); // 클라이언트가 전화를 했을때 요청하는 메세지를 띄운다.
		DataOutputStream Dout = new DataOutputStream(out);
		//Dout.writeUTF("Server 접속이 확인되었습니다."); // 유니코드 문자열로 확인
		Dout.writeUTF("카카오톡보다 좋네??");
		Dout.flush();
		server.close();
		client.close();
		
	}

}
