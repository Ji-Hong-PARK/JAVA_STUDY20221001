package CH16;

interface C03Remocon	//인터페이스에서 필드와 기능을 만든다.
{
	//필드(
	int MAX_VOLUMN = 10;	// 최대볼륨
	int MIN_VOLUMN = 0;		// 최소볼륨
	//기능(추상메서드)  구체적으로 안만들어도 된다.
	void trunON();
	void trunOFF();
	void setVolumn(int vol);
	
	
}

class C03TV implements C03Remocon
{
	int vol;
	@Override
	public void trunON() {
		System.out.println("TV를 켭니다.");	
	}
	@Override
	public void trunOFF() {
		System.out.println("TV를 끕니다.");	
	}

	@Override
	public void setVolumn(int vol) {
		if(MAX_VOLUMN <= vol)
		{
			this.vol = MAX_VOLUMN;
		}
		else if(MIN_VOLUMN >= vol)
		{
			this.vol = MIN_VOLUMN;
		}
		else
		{
			this.vol = vol;
		}
		System.out.println("현재 TV Volumn : " + this.vol);
	}
}

//다중상속 코드 추가

interface SearchURL
{
	void Search(String url);
}

class C03SmartTV extends C03TV implements SearchURL
{

	@Override
	public void Search(String url) {
		System.out.println(url + " 검색 시작합니다.");
		
	}
	
}

public class C03InterfaceMain {
	//추상클래스해서 메인함수 바로 위에다 넣어야한다.
	public static void TurnON(C03Remocon contorller)
	{
		contorller.trunON();
	}
	public static void TurnOFF(C03Remocon contorller)
	{
		contorller.trunOFF();
	}
	public static void SetVol(C03Remocon contorller, int num)
	{
		contorller.setVolumn(num);
	}
	
	public static void Search(SearchURL prodict, String url)
	{
		prodict.Search(url);
	}
	
	public static void main(String[] args) {
		
		C03SmartTV tv = new C03SmartTV();
		
		TurnON(tv);
		SetVol(tv,5);
		Search(tv,"www.naver.com");
		
	}

}
