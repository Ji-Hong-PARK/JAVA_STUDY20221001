package StarCraft;

public class Factory extends Building implements ICanFly{

	public FactoryAddOn extendOn;
	
	void ExtendDactory() {
		extendOn = new FactoryAddOn();
	}
	
	@Override
	void Construct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void UnderAttack(Unit unit) {
		// TODO Auto-generated method stub
		
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
