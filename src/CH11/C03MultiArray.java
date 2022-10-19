package CH11;

public class C03MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이차원 배열[행][열]
		int [][] arr1 = new int[2][3];
		
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		
		
		arr1[1][0] = 11;
		arr1[1][1] = 22;
		arr1[1][2] = 33;
								// 행의 길이 
		System.out.println("행 개수 : " + arr1.length);
		System.out.println("0번째 행의 열의 개수 : " + arr1[0].length);
		System.out.println("1번째 행의 열의 개수 : " + arr1[0].length);
		
		
		//중첩 반복문		//행의 반복문
		for(int i = 0; i < arr1.length; i++)
		{						//열의 반복문
			for(int j = 0; j < arr1[i].length; j++)
			{
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		//개량 반복문
		for(int a[] : arr1)
		{
			for(int b : a)
			{
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
