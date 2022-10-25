package CH19;


abstract class 재료
{
	
}


// <T> = 템플릿이라고 생각하면된다.
// 생성자 호빵에 객체가 들어오면 멤버에다 연결을 해주고  내가 팥이라는 클래스를 만든다.

class 팥 extends 재료
{
	String meterial;
	팥(String meterial)
	{
		this.meterial = meterial;
	}
	
	//toString재정의 해주세요.
	
	@Override
	public String toString() {
		return "팥 [meterial=" + meterial + "]";
	}
	
}


class 야채 extends 재료	// 제네릭클래스 안으로 들어갈 재료에대해 적는것이다.
{
	String meterial;
	야채(String meterial)
	{
		this.meterial = meterial;
	}
	
	//toString재정의 해주세요.
	@Override
	public String toString() {
		return "야채 [meterial=" + meterial + "]";
	}
	
}


class 피자 extends 재료	
{
	String meterial;
	피자(String meterial)
	{
		this.meterial = meterial;
	}
	
	//toString재정의 해주세요.
	@Override
	public String toString() {
		return "피자 [meterial=" + meterial + "]";
	}
	
}

class 민트초코	 extends 재료// 제네릭클래스 안으로 들어갈 재료에대해 적는것이다.
{
	String meterial;
	민트초코(String meterial)
	{
		this.meterial = meterial;
	}
	
	//toString재정의 해주세요.
	@Override
	public String toString() {
		return "민트초코 [meterial=" + meterial + "]";
	}
	
}

class 베스킨라빈스
{
	String meterial;
	베스킨라빈스(String meterial)
	{
		this.meterial = meterial;
	}
	
	//toString재정의 해주세요.
	@Override
	public String toString() {
		return "베스킨라빈스 [meterial=" + meterial + "]";
	}
	
}




class 호빵<T extends 재료>	 		//제네릭 클래스는 호빵이다.
{
	private T meterial;
	호빵(T meterial)
	{
		this.meterial = meterial;
	}
	void showInfo() 
	{
		System.out.println(meterial.toString() + " 으로 만든 호빵");	
	}
}


public class C01Generic {
	
	public static void main(String[] args) {
	
		호빵<팥> ob1 = new 호빵<팥>(new 팥("단팥"));	//제네릭 코드.
		ob1.showInfo();
		호빵<야채> ob2 = new 호빵(new 야채("야채"));//new 호빵<야채> 에서 <야채>는 생략이 가능하다 앞의 객체와 같기때문
		ob2.showInfo();
		호빵<피자> ob3 = new 호빵<피자>(new 피자("콤비네이션 피자"));
		ob3.showInfo();
		호빵<민트초코> ob4 = new 호빵<민트초코>(new 민트초코("민트맛 초코"));
		ob4.showInfo();
//		호빵<베스킨라빈스> ob5 = new 호빵<베스킨라빈스>(new 베스킨라빈스("슈팅스타 맛"));
//		ob5.showInfo();
	}
}
