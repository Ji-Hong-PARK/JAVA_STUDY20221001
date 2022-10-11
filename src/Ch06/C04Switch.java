package Ch06;

public class C04Switch {

	public static void main(String[] args) {
		int ranking = 6;
		char medalColor;
		switch(ranking)
		{
		case 1:
			medalColor = 'G';
			System.out.println("메달색상 : G");
			break;
		case 2:
			medalColor = 'S';
			System.out.println("메달색상 : S");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("메달색상 : B");
			break;
		default:
			medalColor = 'C';
			System.out.println("메달색상 : C");
		}
		System.out.println(ranking + " 등 메달의 색은 "+medalColor + " 입니다.");
	
	}

}
