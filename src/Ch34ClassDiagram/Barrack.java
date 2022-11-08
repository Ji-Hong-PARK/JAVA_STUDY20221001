package Ch34ClassDiagram;

public class Barrack extends Building implements ICanFly {

	@Override
	void Construct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void UnderAttack(Unit unit) {
		// TODO Auto-generated method stub
		
	}
	
	Marine MakeMarine(String name) {
		return new Marine(new Rifle(),name);
	}
	Medic MakeMedic(String name) {
		return new Medic();
	}

	@Override
	public void Move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		
	}

}
