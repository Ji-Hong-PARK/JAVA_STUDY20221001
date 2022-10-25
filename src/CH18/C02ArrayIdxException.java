package CH18;




public class C02ArrayIdxException {

	public static void main(String[] args) {
			
		int arr[] = {10,20,30};
		
		try {
		for(int i =0; i<5;i++) 
		{
			System.out.println(arr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) // catch(Exception e){} 상위클래스로 적어도된다.
		{
			e.printStackTrace();
		}
		
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		

	}

}
