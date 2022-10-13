package CH08;

public class C06Computer {

	String SerialNo;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	void PowerON()
	{
		System.out.println(SerialNo + "의 전원을 켭니다");
	}
	void PowerOFF()
	{
		System.out.println(SerialNo + "의 전원을 끕니다");
	}
	void ShowINFO()
	{
		System.out.printf("시리얼 넘버 : %s\n CPU스펙 : %s\n RAM스펙 : %s\n DISK스펙 : %s\n",SerialNo,CPUSpec
				,RAMSpec,DISKSpec);
		
		//System.out.println("SN :" + SerialNo);
		// -System.out.println 으로도 사용 가능
	}
	
}
