package CH16;

interface C01Remocon	//인터페이스에서 필드와 기능을 만든다.
{
	//필드(
	int MAX_VOLUMN = 10;	// 최대볼륨
	int MIN_VOLUMN = 0;		// 최소볼륨
	//기능(추상메서드)  구체적으로 안만들어도 된다.
	void trunON();
	void trunOFF();
	void setVolumn(int vol);
	
	
}

class C01TV implements C01Remocon
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

class C01Radio implements C01Remocon
{
	int vol;
	@Override
	public void trunON() {
		System.out.println("Radio를 켭니다.");	
	}

	@Override
	public void trunOFF() {
		System.out.println("Radio를 끕니다.");	
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
		System.out.println("현재 Radio Volumn : " + this.vol);
	}
	
	
}

public class C01InterfaceMain {
	//추상클래스해서 메인함수 바로 위에다 넣어야한다.
	public static void TurnON(C01Remocon contorller)
	{
		contorller.trunON();
	}
	public static void TurnOFF(C01Remocon contorller)
	{
		contorller.trunOFF();
	}
	public static void SetVol(C01Remocon contorller, int num)
	{
		contorller.setVolumn(num);
	}
	
	public static void main(String[] args) {
		
		C01TV tv = new C01TV();
		C01Radio radio = new C01Radio();
		
		
		TurnON(tv);
		TurnON(radio);
		TurnOFF(tv);
		TurnOFF(radio);
		
		SetVol(tv,8);
		SetVol(radio,10);
		
	}

}
