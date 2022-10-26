package CH24;

import javax.swing.JFrame;


class C02GUI extends JFrame // 상속 코드 extends JFrame
{
	C02GUI()
	{
		super("두번째 프레임입니다.");
		setBounds(100,100,700,700);	//extends JFrame로 부터 상속받았기 때문에 가져와서 쓰면된다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); 
	}
}

public class C02Swing {

	public static void main(String[] args) {
		
//		JFrame frame = new JFrame("첫번째 프레임창입니다.");
//		frame.setBounds(100,100,700,700);      					// x,y,width,height		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 	// 작업관리자 세부정보에 프로세스를 종료하게 하는 코드	
//		frame.setVisible(true); 								// 프레임표시 여부			
			
		new C02GUI();	// 위 클래스에서 만든 2번째창을 불러옵니다. 
	
		
		
	}

}
