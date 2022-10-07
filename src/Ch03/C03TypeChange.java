package Ch03;

//형변환시 데이터 손실의 예
public class C03TypeChange {

	public static void main(String[] args) {
		int num1 = 129;			//00000000 00000000 00000000 10000001
		int num2 = 130;			//00000000 00000000 00000000 10000010
		byte ch1 = (byte)num1;	//마지막 1byte만 존재 10000001
		byte ch2 = (byte)num2;	//마지막 1byte만 존재 10000010 

		System.out.printf("%d\n", (int)ch1);
		System.out.printf("%d\n", (int)ch2);	
		
	}

}
