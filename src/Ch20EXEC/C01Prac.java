package Ch20EXEC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01Prac {
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
				String name;
				Scanner sc1 = new Scanner(System.in);
			    System.out.print("이름을 입력하세요 : ");
				name = sc1.nextLine();
				list.add(name);
					
				break;
			case 2:
				//이름 입력받아서 조회(있다,없다로 조회) 이름이 있으면 "있다" 없으면 "없다"..
				System.out.println("--------저장되어 있는 -------");
				System.out.println("총 개체수 : " + list.size());
				System.out.println("--------------------------");
				System.out.print("조회하실 이름을 입력하세요 : ");
				String name1;
				Scanner sc2 = new Scanner(System.in);
			    name1 = sc2.nextLine();
				System.out.println("--------------------------");
				System.out.println("조회하신 이름은 있습니다." + list.contains(name1));
				System.out.println("--------------------------");
				break;
				
			case 3:
				//이름 입력받아서 삭제.. 삭제되었으면 "삭제완료" 삭제할 이름 없으면 "삭제실패" 
				
				String name3;
				Scanner sc3 = new Scanner(System.in);
				System.out.print("삭제하실 이름을 적어주세요 : ");
				name3 = sc3.nextLine();
				
				if(list.contains(name3)) 
				{
					System.out.println("삭제하실 이름은 : " + list.remove(name3));
					System.out.println("삭제완료");
				}
				else
				{
					System.out.println("삭제 실패");
				}
				
				break;
				
			case 4:
				//전체 조회
				
				System.out.println("총 개체수 : " + list.size());
				System.out.println("---------전체 출력--------");
				for(int i = 0; i < list.size(); i++)
				{
					System.out.println(list.get(i));
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

