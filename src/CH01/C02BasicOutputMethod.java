package CH01;

public class C02BasicOutputMethod {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//00 System.out : 표준 출력 스트림
		//01 System.out.print();
		
		//ESCAPE (이스케이프)문자 사용
		// \n : 개행문자
		// \b : 백스페이스(C언어)
		// \a : 알람기능(C언어)
		// \t : 탭길이(기본8칸) 만큼 이동.
		
//		System.out.print("HELLO WORLD\n");
//		System.out.print("HE\tLLO WORLD\n");
//		System.out.print("HELLO WORLD\n");
		
		//문제
		//		 *
		//		***
		//	   *****
		//	  *******
		//	 *********
//		System.out.print("\t\t *\n");
//		System.out.println("\t\t***");
//		System.out.println("\t       *****");
//		System.out.println("\t      *******");
//		System.out.println("\t     *********");
		
		
		
		
		//02 System.out.printf();
		
		// - 서식문자를 사용할 수 있는 출력 메서드
		// 서식 	: 서류를 꾸미는 양식
		//	%d 	: 10진 정수 서식문자
		//	%f 	: 실수 서식문자
		//	%c	: 한문자 서식문자
		//	%s	: 문자열 서식문자
		
		//				  " " <- 서식을 만드는 문자라고 보면된다. 12라는 값을 넣어서 프린트 하겠다 생각하면된다.
//		System.out.printf("%d", 12);
//		System.out.printf("%f", 12.5);
//		
//		
//		
//		System.out.printf("%d %d %d %n", 10,20,30);
//		System.out.printf("%f %f %f %n", 10.1,20.1,30.1);
//		System.out.printf("%c %c %c %n", 'A','B','C');
//		System.out.printf("%s %s %s %n", "This is", " string ", "Test");
//		System.out.printf("%d.%s : %d/n", 1, "국어" ,100 );
		
		
		// 문제
		// 다음과 같이 출력합니다
		// NO	이름		나이	주소
		// 1	김광수	35	대구
		// 2	이태수	55	울산
		// 3	이지성	44	김해
		
//		System.out.printf("%s %s %s %s %n", "No","이름","나이","주소");
//		System.out.printf("%d %s %d %s %n", 1, "김광수", 35, "대구");
//		System.out.printf("%d %s %d %s %n", 2, "이태수", 55, "울산");
//		System.out.printf("%d %s %d %s %n", 3, "이지성", 44, "김해");
//		
//		System.out.printf("%s/t%s/t%s/t%s/n", "NO","이름","나이","주소");
//		System.out.printf("%2d/t%s/t%3d/t%s/n", "1","김광수","35","대구");
		
		
		
		
		//03 System.out.println();
		
		System.out.printf("Hello WORLD/n");
		System.out.printf("Hello WORLD");
		System.out.printf("");
		System.out.println("Hello WORLD");
		System.out.println("Hello WORLD");
		System.out.println("Hello WORLD");
		System.out.println("Hello WORLD");
		
		System.out.println("I SAY \"HELLO?\" ");
		
		
		
		
		
		
	}

}
