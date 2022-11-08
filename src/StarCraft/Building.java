package StarCraft;

public abstract class Building {

	public int HP;
	public int ammor;
	
	//건물을 짓는 추상메서드로 만든다.
	abstract void Construct();
	
	abstract void UnderAttack(Unit unit);
	

	
	
//	public String name; //건물의 이름
//	public boolean boom; //건물의HP
	
//	void UnderAttack(int damage) {
//		if (HP - damage <= 0) {
//			System.out.println(name + "파괴되었습니다.");
//			boom = false;
//		}
//		System.out.println(name + "공격당합니다.");
//		HP -= damage;
//	}
	
}
