package CH18;

import CH16.C02다중상속;

public class C06Throw {

	public static void Ex1()
	{
		try {
		throw new ArithmeticException();
		//System.out.println("Ex1에서의 코드");	//예외처리를 하기 위해서  chatch에 코드를 적는것! 
		}
		catch(ArithmeticException e)
		{
			System.out.println("Ex1에서의 코드 / 예외처리");
		}
		System.out.println("Ex1에서의 코드");
	}
	
	public static void Ex2() throws ArithmeticException
	{
		throw new ArithmeticException();
	}
	
	public static void Ex3()
	{
		
	}
	
	public static void main(String[] args) {
		
		Ex1();
		
		try {
		Ex2();	//메인함수에서  오류가 나오기 떄문에  Ex2()에다 try처리를 한다,
		}
		catch(Exception e)
		{
			System.out.println("MAIN에서 예외처리");
		}

	}

}
