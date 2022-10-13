package CH08;


class C12Simple
{	
	//속성
	int x;			// 0
	double y;		// 0.0
	char z;			// ' '
	boolean b;		// false
	String str;		// null
	
	// 디폴트 생성자
	C12Simple()
	{
		System.out.println("디폴트 생성자 호출!");
		
	}

	
	// 우클릭 ->  소스 -> Generate to String() 선택
	@Override
	public String toString() {
		return "C12Simple [x=" + x + ", y=" + y + ", z=" + z + ", b=" + b + ", str=" + str + "]";
	}	
	
}


public class C12ConstructorMain {

	public static void main(String[] args) {
		
		C12Simple obj = new C12Simple();
		System.out.println(obj.toString());
		
		
		
	}

}
