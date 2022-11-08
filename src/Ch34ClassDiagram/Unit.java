package Ch34ClassDiagram;

public abstract class Unit {
	public int HP;
	public String name;
	public boolean isalive;
	abstract void move();

	 
	void UnderAttack(int damage) {
		if (HP - damage <= 0) {
			System.out.println(name + "이 전사하였습니다.");
			isalive = false;
			return ;
		}
		System.out.println(name + " 이 공격당합니다.현재 HP : "+HP);
		HP -= damage;

	}

}
