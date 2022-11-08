package Ch34ClassDiagram;

public abstract class Gun {
	int bulletCnt;
	int power;
	
	abstract void fire(Unit unit);

	abstract void reload();

}
