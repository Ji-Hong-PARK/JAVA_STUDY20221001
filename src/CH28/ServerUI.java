package CH28;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 버튼 추가하기.
class SGUI extends JFrame implements KeyListener
{// 상속 코드 extends JFrame
	JTextField txt1;
	JTextArea area;
	JScrollPane Scroll;
	//소켓코드 추가.
	ServerSocket server;
	Socket client;
	
	SGUI() throws Exception
	{
		super("Chat Server.");	// 프레임창 제목
		
		JPanel pannel = new JPanel();	//패널 생성
		
		//배경색 지정
//		Color col = new Color(30,30,30);	//RGB(Red(0 -255),Green(0 - 255),Blue(0 - 255))
//		pannel.setBackground(col);
		
		
		//패널의 기본 자리배치 말고  내가 원하는데로 지정하고싶을때 쓰는 코드
		pannel.setLayout(null);				//Layout 설정 X
		
		
		//텍스트 창 넣기
		txt1 = new JTextField(); //텍스트 입력창
		txt1.setBounds(10, 260, 260, 30);	//첵스트 입력창 크기 및 위치 설정 
		pannel.add(txt1);					//패널에 텍스트 입력창 추가하기.
		txt1.addKeyListener(this);			// KeyListener 이벤트를 추가하면 된다.
		
		
		
		//텍스트 에어리어 넣기. textarea는 여러 줄의 긴 문장을 입력할 수 있는 양식이다.
		area = new JTextArea();	//텍스트 영역창
		area.setBounds(10, 10, 260, 240);	//내가 적은 글자를 에어리어안에 출력할수있게 만든는 작업이다.
		area.setEditable(false); //에어리어 안에 글을 못적게 하는것.
		//pannel.add(area);  // 스크롤을 추가할시에 area를 패널에 추가를 생략 가능하다.
		
		//textarea 안에 스크롤바 넣기 
		Scroll = new JScrollPane(area);
		Scroll.setBounds(10, 10, 260, 240);
		pannel.add(Scroll);
		
	
		
		
		add(pannel);		//프레임에 추가
		setBounds(100,100,300,350);// 프레임 위치
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능 상태
		setVisible(true);	//프레임창 보여주기.
		
		//소켓 코드 추가.
		//1
		server = new ServerSocket(5555);
		//2
		client = server.accept();
		//3 스레드 만들기(수신용 : recv)
		ServerRecvThread recv = new ServerRecvThread(client, this);
		Thread th1 = new Thread(recv);
		
		//4 스레드 실행하기(수신 : recv)
		th1.start();
		
		//처음 접속 메세지 띄우기
		area.append(client.getInetAddress() + " 에서 접속했습니다.\n");
	}

	
	// 키를 뗏을때 (유니코드 지원)
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("KEY TPYED 함수 : " + e.getKeyChar());
		
	}

	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("KEY PRESSED 함수 : " + e.getKeyChar());
		//System.out.println("KEY PRESSED 함수 : " + e.getKeyCode());
		
		if(e.getKeyCode() == 10)	// 엔터키 입력
		{
			//Send 소켓 작업을 한다.
			try{
				DataOutputStream Dout = new DataOutputStream(client.getOutputStream());
				Dout.writeUTF(txt1.getText());
				Dout.flush();	//초기화시키고
			}catch (Exception e1) {
				e1.printStackTrace();
			}
			
			// 1 필드의 내용 -> Area
			area.append("[Server] : " + txt1.getText() + "\n");	
			// 2 필드의 내용 삭제
			txt1.setText("");	
		}
	}

	// 키를 뗏을때 (유니코드 미지원)
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("KEY RELEASED 함수 : " + e.getKeyChar());
		
	}
}

public class ServerUI {

	public static void main(String[] args) throws Exception {
		
//		JFrame frame = new JFrame("첫번째 프레임창입니다.");
//		frame.setBounds(100,100,700,700);      					// x,y,width,height		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// 작업관리자 세부정보에 프로세스를 종료하게 하는 코드	
//		frame.setVisible(true); 								// 프레임표시 여부			
			
		new SGUI();	// 위 클래스에서 만든 2번째창을 불러옵니다. 
	
		
		
	}

}
