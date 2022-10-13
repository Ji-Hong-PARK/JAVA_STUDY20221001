package CH08;

public class C06ComputerMain {

	public static void main(String[] args) {

		C06Computer LGGRAM1010 = new C06Computer();
		
		
		LGGRAM1010.SerialNo = "1010"; 
		LGGRAM1010.CPUSpec = "I7";
		LGGRAM1010.RAMSpec = "16G";
		LGGRAM1010.DISKSpec = "2TB";
		
		LGGRAM1010.PowerON();
		LGGRAM1010.ShowINFO();
		LGGRAM1010.PowerOFF();
		
		
	}

}
