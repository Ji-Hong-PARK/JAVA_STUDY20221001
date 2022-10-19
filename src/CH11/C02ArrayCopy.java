package CH11;

import java.util.Arrays;

public class C02ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 복사에 대해 배워보자 
		
		int [] arr1 = { 10, 20, 30};
		// 얕은 복사(위치값 복사)
		int [] arr2 = arr1;
		
		int[] arr3 = new int[3];
		for(int i =0; i < arr3.length; i++)
		{
			arr3[i] = arr1[i]; //깊은 복사(데이터값 복사) 
		}
		
		int [] arr4 = Arrays.copyOf(arr1, arr1.length);
		
		
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		System.out.println("arr3 : " + arr3);
		System.out.println("arr4 : " + arr4);
		
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		
		for(int n : arr1)
		{
			System.out.println(n);
		}
		for(int n : arr4)
		{
			System.out.println(n);
		}
		

	}

}
