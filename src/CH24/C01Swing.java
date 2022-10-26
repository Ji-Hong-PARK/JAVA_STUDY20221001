package CH24;

import javax.swing.JFrame;

public class C01Swing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("첫번째 프레임창입니다.");
		frame.setBounds(100,100,700,700);		//x,y,width,height
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 작업관리자 세부정보에 프로세스를 종료하게 하는 코드
		frame.setVisible(true); 				//프레임표시 여부
		
		
	}

}
