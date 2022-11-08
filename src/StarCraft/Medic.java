package StarCraft;

public class Medic extends Unit {

	boolean isalive = true;
	
	private int RP;
	Medic(){
		RP = 5;
	}
	
	void move() {
		if(isalive) {
		System.out.println(name + "이 이동합니다.");
		
		}
	}
//	void UnderAttack(int damage) {
//		if (HP - damage <= 0) {
//			System.out.println(name + "전사하였습니다.");
//			isalive = false;
//		}
//		System.out.println("공격당합니다.");
//		HP -= damage;
//		
//		
//	}
	
	void Healing(Unit unit) {
		if(isalive) {
		unit.HP += 5;
		System.out.println(unit.name + "체력이 증가합니다.");
		}
	}
}
