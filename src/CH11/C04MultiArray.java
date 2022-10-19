package CH11;

public class C04MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr2 = 
			{
				{10,20},
				{30,40,50},
				{60,70,80,90},
				{100,110,120,130,140}
			};
		//길이 확인
		System.out.println("arr2 의 행의 길이 : " + arr2.length);
		System.out.println("arr2의 0번째 요소 길이 : " + arr2[0].length);
		System.out.println("arr2의 1번째 요소 길이 : " + arr2[1].length);	
		System.out.println("arr2의 2번째 요소 길이 : " + arr2[2].length);	
		System.out.println("arr2의 3번째 요소 길이 : " + arr2[3].length);
		
	}

}
