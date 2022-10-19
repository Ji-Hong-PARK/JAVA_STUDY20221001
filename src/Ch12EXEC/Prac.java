package Ch12EXEC;

//1 자바 클래스를 작성하는 연습을 해보자. 다음 main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV 클래스를 작성하라.
//출력 결과
//LG에서 만든 2017년형 32인치 TV

//class TV
//{
//	String Company;
//	int Year;
//	int Inch;
//	
//	void show()
//	{
//		System.out.println(Company+"에서 만든 " + Year + "년 " + Inch + "인치 TV");
//	}
//
//	public TV(String company, int year, int inch) {
//		super();
//		Company = company;
//		Year = year;
//		Inch = inch;
//	}
//	
//}

////선생님 풀이
//
class TV
{
	String brand;
	int year;
	int inch;
	
	TV(String brand,int year,int inch)
	{
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	void show()
	{
		//System.out.println(brand+"에서 만든 "+ year+"년 "+inch+"인치 TV");
		System.out.printf("%s 에서 만든 %d 년 %d 인치 TV",brand,year,inch);
	}
}

public class Prac {	
	public static void main(String[] args) {
   TV myTV = new TV("LG", 2017, 32); //LG에서 만든 2017년 32인치
   myTV.show();
}

//-----------------------------------------------------문제 1번


//	2 Grade 클래스를 작성해보자. 3 과목의 점수를 입력받아 Grade 객체를 생성하고 성적 평균을 출력하는 main()과 실행 예시는 다음과 같다.
//public class Prac {
//	public static void main(String[] args) {
//	   // TODO Auto-generated method stub
//	   Scanner sc = new Scanner(System.in);
//	   
//	   System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> ");
//	   int math = sc.nextInt();
//	   int science = sc.nextInt();
//	   int english = sc.nextInt();
//	   Grade me = new Grade(math, science, english);
//	   System.out.println("평균은 "+me.average()); // average()는 평균을 계산하여 리턴
//	   
//	   sc.close();
//	}
//	수학, 과학, 영어 순으로 3개의 정수 입력 >> 90 88 96
//	평균은 91
//	[Hint] Grade 클래스에 int 타입의 math, science, english 필드를 private로 선언하고, 생성자와 세 과목의 평균을 리턴하는 average() 메소드를 작성한다.
//

	
	//3 노래 한 곡을 나타내는 Song 클래스를 작성하라. Song은 다음 필드로 구성된다.

	//- 노래의 제목을 나타내는 title
	//- 가수를 나타내는 artist
	//- 노래가 발표된 연도를 나타내는 year
	//- 국적을 나타내는 country
	//
	//또한 Song 클래스에 다음 생성자와 메소드를 작성하라.
	//- 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
	//- 노래 정보를 출력하는 show() 메소드
	//- main() 메소드에서는 1978년, 스웨덴 국적의 ABBA가 부른 "Dancing Queen"을
	//song 객체로 생성하고 show()를 이용하여 노래의 정보를 다음과 같이 출력하라.
	//1978년 스웨덴국적의 ABBA가 부른 Dancing Queen

	
	//[문제&풀이] 
	//https://security-nanglam.tistory.com/m/213
		
	
}
