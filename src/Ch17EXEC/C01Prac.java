package Ch17EXEC;
//문제 
//다음 클래스의 equals 메서드를 재정의해서 멤버변수간(x,y)의 값이 일치할때 true
//불일치시 false를 반환하도록 하세요
class C01Point
{
	int x;
	int y;
	
	C01Point(int x, int y)
	{
		this.x =x; this.y=y;
	}

	//equals 재정의 하기
	
	@Override
	public boolean equals(Object obj) 
	{
		
		if(obj instanceof C01Point)
		{
			C01Point down = (C01Point)obj;
			return this.x == down.x && this.y == down.y;
		}
		
		return super.equals(obj);
	}
	
	
	
}

public class C01Prac {

	public static void main(String[] args) {
		C01Point pos1 = new C01Point(10,20);
		C01Point pos2 = new C01Point(10,50);
		C01Point pos3 = new C01Point(40,20);
		System.out.println(pos1.equals(pos2));
		System.out.println(pos2.equals(pos3));
		System.out.println(pos1.equals(pos3));

	}

}
