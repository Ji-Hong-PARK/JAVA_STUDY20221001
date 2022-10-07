package Ch03;

public class C01TypeChange {
	public static void main(String[] args) {
		//자 동 형 변 환
		//범위가 넓은 공간에 작은값이 대입되는경우
		//컴파일러에 의한 자동형변환
		//byte < short < int< long < float < double  - 데이터 손실을 최소화
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가 의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;;
		System.out.println("longValue: " + longValue);	
		
		longValue = 100;
		float floatValue = longValue; 
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);
	} 
}

