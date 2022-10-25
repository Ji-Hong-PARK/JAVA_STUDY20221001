package Ch21EXEC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C01Prac {
	//Key : 제목, Value : 내용
	public static Map<String,String> map = new HashMap();
	//중복을 허용할려면 어레이리스트를 사용해라
	
	
	//전체 조회 출력을 하기위해 . showinfo를 쓰겠다.
	
	private  static void ShowInfo(String tmp) 
	{
		Set<String> subject = map.keySet();		
		for(String key : subject)
		{
			String contents = map.get(subject);
			System.out.println("제목 : " + subject + ", 내용 : " + contents);
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		String subject = null;
		String contents = null;
		while (true) {
			System.out.println("-----------M E M O-----------");
			System.out.println("1 메모하기");
			System.out.println("2 불러오기");
			System.out.println("3 파일로 저장");
			System.out.println("4 종료");
			System.out.println("-----------M E M O-----------");
			System.out.print("번호 : ");
			num = sc.nextInt();
			switch (num) {
			case 1:
				System.out.print("제목 입력 : " ); //map의 key로 저장
				subject = sc.next();
				if(map.containsKey(subject))
				{
					//동일한 제목이 있을경우 
					System.out.println("기존 제목과 동일한 제목이 있습니다.");
					break;
				}
				System.out.print("----내용----\n");	//map의 vlaue로 저장
				sc.nextLine();
				while(true)
				{
					String tmp = sc.nextLine();
					if(tmp.contains("-1"))
					{
						break;
					}
					contents += tmp;
					//contents += sc.nextLine();
				}
				//contents = sc.nextLine();
				map.put(subject, contents);
				//제목과 내용을 입력 받아서 map에 저장합니다
				//기존의 제목과 동일한 제목이 있으면 내용입력이 불가능하게 설정합니다
				
				break;
				
				
			case 2://제목을 입력하면 해당 제목의 내용일 출력되게 합니다.
				System.out.print("제목 입력 : " );
				String tmp = sc.nextLine();
				if(tmp == subject)
				{
					ShowInfo(tmp);
				}
				
				
				
				break;
				
				
			case 3:
				//map의 제목 리스트가 나오게 합니다
				//제목 리스트마다 번호를 부여해서 번호를 입력하면 파일로 저장되게 합니다
				//파일명도 받아서 처리합니다
				break;
				
				
			case 4:
				System.out.println("종료합니다.");
				System.exit(-1);
				
			default : 
				System.out.println("다시 입력하세요..");	

			}
		}

	}
}
