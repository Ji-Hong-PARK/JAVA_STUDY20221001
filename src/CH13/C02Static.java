package CH13;

class C02Simple
{
	int n1;					//힙에 저장된 영역
	static int n2;
	
	void Func1() 
	{
		n1 = 10;
		n2 = 20;
		int n3 = 100;
	}
	
	static void Func2()
	{
		//n1 = 10;	//문제 발생... 왜?? // 스테틱으로 지정된건 스테틱으로만 사용가능.// static메서드에서는 기본멤버변수 사용은 불가능!
		n2 = 20;
		int num = 10;  				// 지역변수는 사용 가능하다.
	}
}


public class C02Static {

	public static void main(String[] args) {
		
		
		
		
	}

}
