package Ch34ClassDiagram;

public class Rifle extends Gun{

	
	Rifle(){
		bulletCnt=20; //저장된 총의 개수
		super.power=100; //파워기본값
	}
	
	@Override
	void fire(Unit unit) {
		if(bulletCnt-1 <0) {
			System.out.println("탄환 부족..");
			return ;
		}
		System.out.println("발사!");
		
		//unit.HP-=power;
		unit.UnderAttack(power);
		bulletCnt--;
	}

	@Override
	void reload() {
		System.out.println("재장전!");
		
		
	}

}
