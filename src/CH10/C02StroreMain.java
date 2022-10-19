package CH10;
// 10월 21일 시험 예상 문제!
class Customer
{
	//속성
	int myMoney;	//보유금액
	int colaCnt;	//콜라보유 개수
	//기능
	//구매하기
	
	void pay(Store store, int money) // 어느 편의점에? 얼마를 지불할 것인가? 어떤 물건을?? 
	{
		// 1) 내 보유금액에서 money 차감
		myMoney -= money;

		// 2) 지정된 store에 money를 전달
		//store.returnCola(money); <- 이걸 적으면  갯수가 2배로 없어진다 바로 아래 코드랑 똑같지 않나?
		
		int cnt = store.returnCola(money);
		// 3) 콜라개수 누적
		colaCnt += cnt;
		
	}

	@Override
	public String toString() {
		return "Customer [myMoney=" + myMoney + ", colaCnt=" + colaCnt + "]";
	}

	public Customer(int myMoney, int colaCnt) {
		super();
		this.myMoney = myMoney;
		this.colaCnt = colaCnt;
	}
	

}

class Store
{
	//속성
	int saveMoney;	//보유금액
	int colaCnt;	//콜라재고량
	int price;		//콜라 가격
	//기능
	int returnCola(int money) 
	{	
		// 1) 보유금액에 받은 금액 추가 누적
		saveMoney += money;
		// 2) 받은 금액만큼 콜라 재고량 감소
		int cnt = money/price;
		colaCnt -= cnt;
		// 3) 콜라 개수 리턴. (콜라 개수 고객에게 전달)
		return cnt;
		
		
	}
	public Store(int saveMoney, int colaCnt, int price) {
		super();
		this.saveMoney = saveMoney;
		this.colaCnt = colaCnt;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Store [saveMoney=" + saveMoney + ", colaCnt=" + colaCnt + ", price=" + price + "]";
	}
	
}

public class C02StroreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//고객 객체
		Customer hong = new Customer(10000, 0);
		Customer jung = new Customer(20000, 0);
		
		//편의점 객체
		Store GS감삼 =  new Store(100000, 100, 1000);	//보유금액, 콜라개수, 콜라가격
		Store GS반월 =  new Store(100000, 100, 1000);	//보유금액, 콜라개수, 콜라가격
		
		//구매하기
		hong.pay(GS감삼, 2000);
		jung.pay(GS감삼, 3000);
		// 확인.
		
		System.out.println("---------------고객 정보 확인------------------");
		System.out.println(hong);
		System.out.println(jung);
		System.out.println("---------------편의점 정보 확인------------------");
		System.out.println(GS감삼);
		System.out.println(GS반월);
	
	}

}
