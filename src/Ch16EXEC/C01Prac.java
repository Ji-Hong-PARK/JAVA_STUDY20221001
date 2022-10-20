package Ch16EXEC;

interface Shape {
	   final double PI = 3.14; // 상수
	   void draw(); // 도형을 그리는 추상 메소드
	   double getArea(); // 도형의 면적을 리턴하는 추상 메소드
	   default public void redraw() { // 디폴트 메소드
	      System.out.print("--- 다시 그립니다.");
	      draw();
	   }
	}

class Circle implements Shape
{
	int r;
	Circle(int num)
	{
		r = num;
		draw();
	}
	@Override
	public void draw() {
		double result = getArea();
		System.out.println("원이 넓이가 " + result + " 인 원을 그립니다.");
		
	}
	@Override
	public double getArea() {
		
		return r*r*PI;
	}
	
	
}
public class C01Prac {

	public static void main(String[] args) {
		   Shape donut = new Circle(10); // 반지름이 10인 원 객체
		   donut.redraw();
		   System.out.println("면적은 "+ donut.getArea());

	}

}
