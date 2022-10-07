package Ch03;

public class C06TypeChangeArithmethic {

	public static void main(String[] args) {
		int num1 = 10, num2 = 4;
		double dnum1 = num1 / num2 ; 		//피연산자 num1은 int 형이기때문에 연산후에 소수점 데이터손실

		double dnum2 = (double)num1 / num2;	//나누는 수를 double형으로 강제 형변환함으로서 연산결과 발생되는
											//소수점을 표현할 공간을 마련 
		
		//이렇게 적어도 된다. num1에다 1.0을 곱해주면 소숫점 더블로 형변환되어서 값이 나온다.
		double dnum3 = (1.0*num1) / num2;	
		
		System.out.println("dnum1 : " +dnum1);
		System.out.println("dnum2 : " +dnum2);
		System.out.println("dnum2 : " +dnum3);
	}

}
