package StarCraft;

public class Bunker extends Building{

	
	
	
	public Unit member[];
	int idx = 0;
	Bunker(){
		member = new Unit[4]; //4명의 유닛이 들어간다.
	}
	
	public void InsertMember(Unit unit) {
		if(idx == 4) {
			System.out.println("더이상 들어올 수 없습니다.");
		}
		member[idx++] = unit;
		
	}
	
	@Override
	void Construct() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	void UnderAttack(Unit unit) {
		//HP --
		//Amor --
		
	}
	
	

}
