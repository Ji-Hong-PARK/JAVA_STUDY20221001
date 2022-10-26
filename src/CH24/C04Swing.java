package CH24;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 버튼 추가하기.
class C04GUI extends JFrame // 상속 코드 extends JFrame
{
	C04GUI()
	{
		super("네번째 프레임입니다.");	// 프레임창 제목
		
		JPanel pannel = new JPanel();	//패널 생성
		
		//배경색 지정
//		Color col = new Color(30,30,30);	//RGB(Red(0 -255),Green(0 - 255),Blue(0 - 255))
//		pannel.setBackground(col);
		
		
		//패널의 기본 자리배치 말고  내가 원하는데로 지정하고싶을때 쓰는 코드
		pannel.setLayout(null);				//Layout 설정 X
		
		
		//텍스트 창 넣기
		JTextField txt1 = new JTextField(); //텍스트 입력창
		txt1.setBounds(10, 260, 250, 30);	//첵스트 입력창 크기 및 위치 설정 
		pannel.add(txt1);					//패널에 텍스트 입력창 추가하기.
		
		//텍스트 에어리어 넣기. textarea는 여러 줄의 긴 문장을 입력할 수 있는 양식이다.
		JTextArea area = new JTextArea();	//텍스트 영역창
		area.setBounds(10, 10, 260, 240);	//내가 적은 글자를 에어리어안에 출력할수있게 만든는 작업이다.
		//pannel.add(area);  // 스크롤을 추가할시에 area를 패널에 추가를 생략 가능하다.
		
		//textarea 안에 스크롤바 넣기 
		JScrollPane Scroll = new JScrollPane(area);
		Scroll.setBounds(10, 10, 260, 240);
		pannel.add(Scroll);
		
		//버튼 추가하기
		JButton btn1 = new JButton("버튼1");	// 버튼 생성
		//btn1.setBackground(new Color(0,0,0));	// 버튼의 컬러 설정하기 코드
		btn1.setBounds(10, 300, 120, 30);	// 버튼 위치, 크지 지정.
		pannel.add(btn1);					// 패널에 버튼 추가하기
		
		
		//버튼 추가하기
		JButton btn2 = new JButton("버튼2");	
		btn2.setBounds(150, 300, 120, 30);	
		pannel.add(btn2);					
		
		
		
		
		add(pannel);		//프레임에 추가
		setBounds(100,100,300,400);// 프레임 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능 상태
		setVisible(true);
	}
}

public class C04Swing {

	public static void main(String[] args) {
		
//		JFrame frame = new JFrame("첫번째 프레임창입니다.");
//		frame.setBounds(100,100,700,700);      					// x,y,width,height		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// 작업관리자 세부정보에 프로세스를 종료하게 하는 코드	
//		frame.setVisible(true); 								// 프레임표시 여부			
			
		new C04GUI();	// 위 클래스에서 만든 2번째창을 불러옵니다. 
	
		
		
	}

}
