package CH10;

class Buyer1
{
	int myMoney;
	int appleCnt;
	
	// 8번째로 toString 재정의
	public Buyer1(int myMoney, int appleCnt)
	{
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	@Override
	public String toString() {
		return "Buyer1 [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}	
	void pay1(Seller1 seller1, int money)//누구에게? 얼마? 무얼?	// 1번째로 적을건  pay 돈을 준다라고 적는다.
	{		// ↑ 누구에게?, 돈을 이라는 매개변수를 적는다.
		// 보유금액 차감
					// 순서를 정한다  pay를 제일 먼저 쓴다고 생각하자
		myMoney -= money;
		// seller 에 money전달 사과개수 리턴받음
		int cnt = seller1.returnApple(money); // 3번째로  사과를 리턴 받는다.
		// 내 사과개수에 누적.
	}
	
	
}

class Seller1
{
	int myMoney;
	int appleCnt;
	int price;
	
	// 8번째로 toString 재정의
	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}
	// 9번째로  생성자 코드 삽입

	public Seller1(int myMoney, int appleCnt, int price) 
	{
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}
	
	int returnApple(int money)	// 2번째 로 적을건  사과개수를 리턴해야한다.
	{
		//보유금액에 금액 누적
		myMoney += money;		//4번째 머니를 받으므로 증가시킨다.
		//사과개수 계산 후 보유개수에서 차감
		int cnt = money/price;	// 5번째로 돈/금액을 해서 카운트 한다.
		appleCnt -= cnt; //6번째 사과개수를 차감시킨다. 
		// 사과개수 참감
		return cnt;	//7번째 사과개수 리턴 시킨다.  // cnt가  위에 pay에 적힌 코드로 가서 저장된다고 생각한다.
	}
}
public class C03AppleMain {
	
	public static void main(String[] args) 
	{
		Seller1 seller = new Seller1(10000, 100, 1000);
		Buyer1 buyer = new Buyer1(5000,0);
		buyer.pay1(seller,2000);
		System.out.println(seller); 	//보유금액, 사과개수 출력
		System.out.println(buyer);	//보유금액, 사과개수 출력 
	}
}
