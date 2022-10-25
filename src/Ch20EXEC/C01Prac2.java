package Ch20EXEC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01Prac2 {
	public static void main(String[] args) {
		int num = 0;
		List<String> list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("=======M E N U =======");
			System.out.println("1 이름 등록");
			System.out.println("2 이름 조회");
			System.out.println("3 이름 삭제");
			System.out.println("4 전체 조회");
			System.out.println("5 종료");
			System.out.println("=======M E N U =======");
			System.out.print("번호 : " );
			num = sc.nextInt();
			switch(num)
			{
			case 1:
				//이름 입력받아서 ArrayList 에  add
				System.out.print("이름 : ");
				String tmp = sc.next();
				list.add(tmp);
				break;
				
			case 2:
				//이름 입력받아서 조회(있다,없다로 조회) 이름이 있으면 "있다" 없으면 "없다"..
				System.out.print("조회");
				tmp = sc.next();
				if(list.contains(tmp))
				{
					System.out.println(tmp + " 은 리스트에 있습니다.");
				}
				else
				{
					System.out.println(tmp + " 은 리스트에 없습니다.");
				}
				
				break;
				
			case 3:
				//이름 입력받아서 삭제.. 삭제되었으면 "삭제완료" 삭제할 이름 없으면 "삭제실패" 
				
				System.out.print("입력 : ");
				tmp = sc.next();
				if(list.contains(tmp))
				{
					list.remove(tmp);
					System.out.println("삭제 완료");
				}
				else
				{
					System.out.println("삭제 실패");
					System.out.println(tmp + " 은 리스트에 존재하지 않습니다.");
				}
				break;
				
			case 4:
				//전체 조회
				
				for(String a : list)
				{
					System.out.println(a);
				}
				
				break;
			case 5:
				System.exit(-1);
			default:
				System.out.println("다시 입력...");
			}
		}
	}
}

