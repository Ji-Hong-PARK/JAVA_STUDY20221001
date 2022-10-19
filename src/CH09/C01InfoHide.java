package CH09;


// 접근한정자
// public 	:	모든 클래스에서 사용가능
// default	:	동일 패키지에 속한 클래스에서만 접근가능
// private	:	현재 클래스에서만 접근 가능
// protected:	동일 패키지에 속한 클래스 or 상속관계에서 하위크랠스에서만 접근가능

class C01Person
{
	//속성
	public String name;		//이름
	private String id;		//주민번호
	private int age;		//나이
	private float weight;	//몸무게
	private double hight;	//신장
	private int salary;		//연봉
	
	//퍼블릭은  모든 클래스에 사용가능
	//프라이빗은 나만보고 다른사람들은 못보게.
	//
	
	//생성자.
	// 소스코드로 자동으로 넣는법
	// 클래스 안에 우클릭 -> 소스 -> genereat Constuctor using fields -> 생성자 만들기.
	
	public C01Person(String name, String id, int age, float weight, double hight, int salary) 
	{
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.hight = hight;
		this.salary = salary;
	}
//	// Setter 함수 지정
//	public void setId(String id)
//	{
//		this.id = id;
//	}
//	// Getter 함수 지정
//	public String getid()
//	{
//		return id;
//	}
	// age Getter and Setter 만들기
	// weight Getter and Setter 만들기
	// hight Getter만 만들기
	// salart Setter만 만들기
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

	
	
}

public class C01InfoHide {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 메서드 적기
		C01Person hong = new C01Person("홍길동", "1111-1111", 44, 70.2f, 177.5,5000);
		
		
		
	}

}
