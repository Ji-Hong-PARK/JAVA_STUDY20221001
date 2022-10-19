package CH10;

class Buyer
{
	// 속성
	int myMoney;
	int appleCnt;
	// 기능
	//1) 돈을 지불한다.
	void paymoney(Seller seller, int money) //어느 Seller에게서 살것인가, 얼마를 지불할것인가?, 어떤물건을 구매할것인가를 알아야한다.
	{
		//1) 나의 보유금액에서 물건을 구매한다면 돈이 차감되어야한다 -money
		myMoney -= money;
		
		//2) 지정된 Seller에게 money를 준다!
		//seller.returnallpe(money); // seller에게서 사과값을 준다는 코드 그앞에다 int cnt의 저장값을 만들어보자.
		int cnt = seller.returnallpe(money);//금액을 주고난뒤 사과개수를 확인해본다.
		appleCnt += cnt;	// 사과개수 += cnt 카운트 해서 증가시켜 개수를 출력
	
	}
	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}
	

	
	
	
}

class Seller
{
	//속성
	int saveSellerMoney;
	int appleCnt;
	int price;
	//기능
	// returnapple이라는 사과를 돈을 받고 팔아야하기 떄문에 메소드를 만든다.
	int returnallpe(int money)
	{
		// 보유금액에서 머니를 + 한다.
		saveSellerMoney += money;
		
		// 받은 돈만큼 보유하는 사과개수를 - 카운트한다.
		int cnt = money/price; //int money를 price를 나눠서 카운트를 한다.
		appleCnt -= cnt; //사과개수에서 위 코드 cnt(받을돈 / 사과금액)를 뺀다.
		
		// 사과개수를 리턴을 해준다 / buyer에게 사과를 주고 남은 갯수를 카운트를 해야하기 떄문.
		return cnt;
	}
	public Seller(int saveSellerMoney, int appleCnt, int price) {
		super();
		this.saveSellerMoney = saveSellerMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Seller [saveSellerMoney=" + saveSellerMoney + ", "
				+ "appleCnt=" + appleCnt + ", price=" + price + "]";
	}
	
	
	
	
	
}

public class C03BuyerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//판매하기 메소드 만들기.
		
		//구매자의 객체 만들기
		Buyer buyer = new Buyer(5000, 0);
		
		
		//판매자의 객체 만들기
		Seller seller = new Seller(10000, 100, 1000);
		
		
		//구매자 객체가 구매하는 코드 만들기
		buyer.paymoney(seller, 2000);
		
		//구매하고 난뒤 확인되는 출력물 확인하기
		System.out.println(seller);
		System.out.println(buyer);
		
	}

}
