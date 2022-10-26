package CH24;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


class C03GUI extends JFrame // 상속 코드 extends JFrame
{
	C03GUI()
	{
		super("두번째 프레임입니다.");	// 프레임창 제목
		
		JPanel pannel = new JPanel();	//패널 생성
		
		//배경색 지정
		Color col = new Color(30,30,30);	//RGB(Red(0 -255),Green(0 - 255),Blue(0 - 255))
		pannel.setBackground(col);
		
		add(pannel);		//프레임에 추가
		setBounds(100,100,700,700);// 프레임 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료버튼 사용가능 상태
		setVisible(true);
	}
}

public class C03Swing {

	public static void main(String[] args) {
		
//		JFrame frame = new JFrame("첫번째 프레임창입니다.");
//		frame.setBounds(100,100,700,700);      					// x,y,width,height		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// 작업관리자 세부정보에 프로세스를 종료하게 하는 코드	
//		frame.setVisible(true); 								// 프레임표시 여부			
			
		new C03GUI();	// 위 클래스에서 만든 2번째창을 불러옵니다. 
	
		
		
	}

}
