package Ch14EXEC;

//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.

//부모클래스
class TV{
	   private int size;
	   public TV(int size) { this.size = size; }
	   protected int getSize() { return size; } // size가 private 이기 때문에  get 함수를 만들어준다.
	   
	}


//자식 클래스
class ColorTV extends TV
{
	int color;

	public ColorTV(int size, int color) 
	{
		super(size);
		this.color = color;
	}
	public void printProperty()
	{
		System.out.printf("%d인치 %d컬러\n", getSize(), color); // 위에 size가 private 이기 때문에  getSize() 라고 써준다.
	}

}



public class C01Prac {

		public static void main(String[] args) {
			   ColorTV myTV = new ColorTV(32, 1024);
			   myTV.printProperty();
			}
}


