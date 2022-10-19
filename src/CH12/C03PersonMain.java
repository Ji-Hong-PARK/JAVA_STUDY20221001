package CH12;

class C03Person
{
	String name;
	String age;
	String addr;
}


public class C03PersonMain {

	public static void main(String[] args) {
		
		C03Person [] employee = new C03Person[3];
		
		employee[0] = new C03Person(); // 객체를 생성해줘야  참조변수에 값이 들어가진다.
		
		employee[0].name = "홍길동";
		employee[0].age = "36";
		employee[0].addr = "대구광역시~";
		
		
		employee[1] = new C03Person(); // employee[1] 에다 객체변수를 다룰수있는 걸 만들어주야한다.
		
		employee[1].name = "이광수";
		employee[1].age = "55";
		employee[1].addr = "울산";
		
		
		employee[2] = new C03Person();
		
		employee[2].name = "서태지";
		employee[2].age = "27";
		employee[2].addr = "창원";
	
		
		
		for(int i=0; i <employee.length; i++)
		{
			System.out.println("이름 : " + employee[i].name);
			System.out.println("나이 : " + employee[i].age);
			System.out.println("주소 : " + employee[i].addr);
			System.out.println();
		}
				
		

	}

}
