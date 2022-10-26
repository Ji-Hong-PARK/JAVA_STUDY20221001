package CH24;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 버튼 추가하기.
class C05GUI extends JFrame implements ActionListener,KeyListener
{// 상속 코드 extends JFrame
	JTextField txt1;
	JTextArea area;
	JScrollPane Scroll;
	JButton btn1;
	JButton btn2;
	
	C05GUI()
	{
		super("다섯번째 프레임입니다.");	// 프레임창 제목
		
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
		//pannel.add(area);  // 스크롤을 추가할시에 area를 패널에 추가를 생략 가능하다.
		
		//textarea 안에 스크롤바 넣기 
		Scroll = new JScrollPane(area);
		Scroll.setBounds(10, 10, 260, 240);
		pannel.add(Scroll);
		
		//버튼 추가하기
		btn1 = new JButton("버튼1");	// 버튼 생성
		//btn1.setBackground(new Color(0,0,0));	// 버튼의 컬러 설정하기 코드
		btn1.setBounds(10, 300, 120, 30);	// 버튼 위치, 크지 지정.
		pannel.add(btn1);					// 패널에 버튼 추가하기
		btn1.addActionListener(this);		// 버튼1을 누르면 이벤트 추가!
		
		//버튼 추가하기
		btn2 = new JButton("버튼2");	
		btn2.setBounds(150, 300, 120, 30);	
		pannel.add(btn2);					
		btn2.addActionListener(this);		// 버튼2을 누르면 이벤트 추가!
		
		
		
		add(pannel);		//프레임에 추가
		setBounds(100,100,300,400);// 프레임 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능 상태
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) //이벤트를 발생시킨 퍼포먼스를확인한다.
		{
			System.out.println("버튼 1 클릭함.");
		}
		if(e.getSource() == btn2)
		{
			System.out.println("버튼 2 클릭함.");
		}
		
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
		System.out.println("KEY PRESSED 함수 : " + e.getKeyChar());
		System.out.println("KEY PRESSED 함수 : " + e.getKeyCode());
		
		if(e.getKeyCode() == 10)	// 엔터키 입력
		{
			// 1 필드의 내용 -> Area
			area.append("[CLIENT] : " + txt1.getText() + "\n");
			
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

public class C05Swing {

	public static void main(String[] args) {
		
//		JFrame frame = new JFrame("첫번째 프레임창입니다.");
//		frame.setBounds(100,100,700,700);      					// x,y,width,height		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// 작업관리자 세부정보에 프로세스를 종료하게 하는 코드	
//		frame.setVisible(true); 								// 프레임표시 여부			
			
		new C05GUI();	// 위 클래스에서 만든 2번째창을 불러옵니다. 
	
		
		
	}

}
