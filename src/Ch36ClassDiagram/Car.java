package Ch36ClassDiagram;

public class Car {

	private String carNumber;
	private String model;
	private Engine engine;
	private Radio radio;
	
	
	
	public Car(String carNumber, String model) {
		super();
		this.carNumber = carNumber;
		this.model = model;
		this.engine = new Engine();
		this.radio = new Radio();
	}



	public void move() {
		System.out.println("자동차가 움직입니다.");	
	}

}
