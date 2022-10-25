package Ch99;

//판매자
/*
- Seller 클래스의 Receive 메서드 실행시

◎ MyMoney 의 금액 누적증가

◎ Applecnt 에 받음금액만큼의 사과개수 차감

◎ 사과개수 리턴
*/
class C01Selelr
{
	//속성
	private int MyMoney;	//지문중 : 멤버변수는 private 으로 구성하라
	private int AppleCnt;
	private int Price;
	
	//생성자
	public C01Selelr(int myMoney, int appleCnt, int price) {
		super();
		MyMoney = myMoney;
		AppleCnt = appleCnt;
		Price = price;
	}	
	//기능
	int  Receive(int money)
	{
		MyMoney += money; //판매자는 머니를 받으므로 증감시킨다.
		int appleCnt = money / Price; //카운트는 머니에서 가격을 나눈만큼 카운트한다.
		AppleCnt -= appleCnt;
		return appleCnt;
	}
	void ShowInfo()
	{
		System.out.println("보유금액 : " + MyMoney + "\n사과개수 : " + AppleCnt + "\n개당 가격 : " + Price);
	}

	
}

//구매자
/*
- Buyer 클래스의 Payment 메서드를 실행시

◎ MyMoney 의 금액 차감

◎ Seller01 의 Receive(money) 전달

◎ 리턴되는 사과개수를 appleCnt에 누적
*/
class C01Buyer
{
	//속성
	private int MyMoney;
	private int AppleCnt;
	
	//생성자
	public C01Buyer(int myMoney, int appleCnt) {
		super();
		MyMoney = myMoney;
		AppleCnt = appleCnt;
	}
	
	//기능
	void Payment(C01Selelr Selelr, int money)
	{
		MyMoney -= money;	//구매자는 가진돈을 차감시켜 사과를 구매한다.
		int appleCnt = Selelr.Receive(money); // 셀러에게 appleCnt만큼 money를 준다.
		AppleCnt += appleCnt; // 구매자의 사과카운트는 셀러에게 줌으로서 appleCnt를 증감시킨다.
	}
	
	void ShowInfo()
	{
		System.out.println("보유금액 : " + MyMoney + "\n사과개수 : " + AppleCnt);
	}

}


public class test {

	public static void main(String[] args) {
		
		C01Selelr seller = new C01Selelr(100000, 100, 1000);
		C01Buyer buyer01 = new C01Buyer(10000, 0);
		C01Buyer buyer02 = new C01Buyer(20000, 0);
		C01Buyer buyer03 = new C01Buyer(30000, 0);
		buyer01.Payment(seller,2000);
		buyer02.Payment(seller,5000);
		buyer03.Payment(seller,3000);
		System.out.println("-------판매자 정보--------");
		seller.ShowInfo();
		System.out.println("-------구매자 정보--------");
		System.out.println("-buyer01-");
		buyer01.ShowInfo();
		System.out.println("-buyer02-");
		buyer02.ShowInfo();
		System.out.println("-buyer03-");
		buyer03.ShowInfo();
		
	}

}
