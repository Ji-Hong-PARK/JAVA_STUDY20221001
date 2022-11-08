package StarCraft;

//하위 클래스로 객체를 만들도록 한다.
public abstract class Gun {
	
	int bulletCnt;
	int power;
	
	abstract void fire(Unit unit);
	
	abstract void reload();
	

}
