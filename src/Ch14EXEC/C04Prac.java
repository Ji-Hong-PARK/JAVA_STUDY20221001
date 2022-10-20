package Ch14EXEC;

class Moonbanggu
{
//	String write;
//	public Moonbanggu() {}
	//-----선생님 코드
	public static int sharpenCnt = 100;
	public static int PencilCnt = 100;
	
	
	void write(){};
	
}
class Sharpen extends Moonbanggu
{
//	String Sharpen;
//	public Sharpen() {
//		
//	}
//	@Override
//	void write() {
//		System.out.println("샤프로 씁니다");
//	}

	//선생님 코드
	void write() {System.out.println("샤프로 씁니다");}
	
	Sharpen()
		{
			if(sharpenCnt >= 1)
			{
				sharpenCnt--;
			}		
		}
	
	
	
}
class Pencil extends Moonbanggu
{

//	public Pencil() {
//		
//	}
//	
//	@Override
//	void write() {
//		System.out.println("연필로 씁니다");
//	}
	
	//--------선생님 코드
	void write() {System.out.println("연필로 씁니다");}
	
	Pencil()
		{
			if(PencilCnt >= 1)
			{
				PencilCnt--;
			}
		}
	
}


public class C04Prac {
	
	public static void Writing(Moonbanggu item) {
		item.write();
	}
	public static void ShowInfo() 
	{
		System.out.printf("샤프 재고량 : %d 연필 재고량 : %d\n",Moonbanggu.sharpenCnt,Moonbanggu.PencilCnt);
	}
	
	public static void main(String[] args) {
		Sharpen item1 = new Sharpen();
		Pencil item2 = new Pencil();
		Writing(item1);	//"샤프로 씁니다" 가 출력 
		Writing(item2); //"연필로 씁니다" 가 출력 
		ShowInfo();
	}
}
