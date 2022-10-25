package CH18;

public class C05Exception {

	public static void main(String[] args) {
		
		try 
		{
		String str = null;
		System.out.println(str.toString());		//null 예외
		
		//int arr[] = new int[3];
		//arr[4] = 10;			//배열 idx (인덱스) 예외
		
		//System.out.println(10/0);		//산술 오류
		
		//Animal cat = new Cat();
		//Dog dog = (Dog)cat;			//클래스형 변환 예외
		
		}
//		catch (NullPointerException e) 
//		{
//			System.out.println("Null 예외");
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Idx 예외");
//		}
//		catch (ArithmeticException e) {
//			System.out.println("산술 예외");
//		}
		catch (Exception e) {
			e.printStackTrace();	//모든 오류를 상위버전(업케스팅)으로 적는다.
			
		}
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		System.out.println("실행코드3");
		

	}

}
