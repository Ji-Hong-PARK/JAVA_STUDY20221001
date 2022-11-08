package StarCraft;

public class Marine  extends Unit{

	Gun myGun;
	boolean isalive = true;
	
	
	
	Marine(Gun gun, String name){
		myGun = gun;
		HP = 1000;
		this.name = name;
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
//		System.out.println(name + "공격당합니다.현제 HP : " + HP);
//		HP -= damage;	
//	}
	void Attack(Unit unit) {
		System.out.println(name + "이 공격합니다.");
		myGun.fire(unit);
	}

}
