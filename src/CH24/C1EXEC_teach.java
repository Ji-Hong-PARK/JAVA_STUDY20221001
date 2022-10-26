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
class C1GUI extends JFrame implements ActionListener, KeyListener
{
	JTextField txt1;
	JTextArea area;
	JScrollPane Scroll;
	JButton 입력;
	JButton 저장;
	JButton 요청;
	JButton 기록;
	
	C1GUI()
	{
		super("Chatting Server");	// 프레임창 제목
		
		JPanel pannel = new JPanel();	//패널 생성
		
		
		//패널의 기본 자리배치 말고  내가 원하는데로 지정하고싶을때 쓰는 코드
		pannel.setLayout(null);				//Layout 설정 X
		
		
		//텍스트 창 넣기
		txt1 = new JTextField(); //텍스트 입력창
		txt1.setBounds(10, 400, 180, 40);	//첵스트 입력창 크기 및 위치 설정 
		txt1.addKeyListener(this);
		
		
		//텍스트 에어리어 넣기. textarea는 여러 줄의 긴 문장을 입력할 수 있는 양식이다.
		area = new JTextArea();	//텍스트 영역창
		area.setBounds(10, 10, 180, 370);	//내가 적은 글자를 에어리어안에 출력할수있게 만든는 작업이다.
		
		// textarea 안에 스크롤바 넣기 
		Scroll = new JScrollPane(area);
		Scroll.setBounds(10, 10, 180, 370);
			
		
		//btn1.setBackground(new Color(0,0,0));	// 버튼의 컬러 설정하기 코드
		
								
		//입력창 추가하기
		입력 = new JButton("입력");	
		입력.setBounds(220, 400, 140, 40);
		입력.addActionListener(this);
		
		//입력창 추가하기
		저장 = new JButton("파일로 저장");	
		저장.setBounds(220, 10, 140, 40);	
		//입력창 추가하기
		요청 = new JButton("1:1 요청");	
		요청.setBounds(220, 65, 140, 40);	
		//입력창 추가하기
		기록 = new JButton("대화 기록 보기");	
		기록.setBounds(220, 120, 140, 40);	
		
		
		pannel.add(저장);
		pannel.add(요청);
		pannel.add(기록);
		pannel.add(입력);
		//pannel.add(area);//스크롤을 추가할시에 area를 패널에 추가를 생략 가능하다.
		pannel.add(Scroll);
		pannel.add(txt1);
		
		
		
		add(pannel);		//프레임에 추가
		
		setBounds(100,100,400,500);// 프레임 위치
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능 상태
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == 입력)
		{
			System.out.println("입력버튼 클릭함.");
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
				area.append("[MASTER] : " + txt1.getText() + "\n");
				
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

public class C1EXEC_teach {

	public static void main(String[] args) {
		
//		JFrame frame = new JFrame("첫번째 프레임창입니다.");
//		frame.setBounds(100,100,700,700);      					// x,y,width,height		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// 작업관리자 세부정보에 프로세스를 종료하게 하는 코드	
//		frame.setVisible(true); 								// 프레임표시 여부			
			
		new C1GUI();	// 위 클래스에서 만든 2번째창을 불러옵니다. 
	
		
		
	}

}
