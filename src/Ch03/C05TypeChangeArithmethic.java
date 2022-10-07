package Ch03;

//연산식과 형변환

public class C05TypeChangeArithmethic {

	public static void main(String[] args) {
		double num1 = 10.5 + 5;		//double 형으로 피연산자 형변환
		int num2 = (int)10.5 + 5;	//오른쪽은 double형자동형변환 이기때문에 왼쪽 공간에 대입하려면 10.5를 강제 형변환해야한다
									//Data손실일어남
		double num3 = 10.5 + 5;		//자동형변환된 값을 num3에 정상자료형에 대입 
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		
	}

}
