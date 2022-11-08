package StarCraft;

public abstract class Unit {

		public int HP;
		public String name;
		public boolean isalive;
		abstract void move();
		
		//abstract void UnderAttack(int damage);
		void UnderAttack(int damage) {
			if (HP - damage <= 0) {
				System.out.println(name + "전사하였습니다.");
				isalive = false;
			}
			System.out.println(name + "공격당합니다.");
			HP -= damage;
		}
		
		
}
