package CH11;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C01Egem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 선생님 문제
		
		//10 크기의 int형 배열을 만들어서
		// 반복문과 함께 해당배열의  0 - 9 까지 요소에 각각 정수 값을 입력
		// 합, 평균, 최대값, 최소값을 구해보자.
		
//		int[] ar1 = new int[10];
//		int total = 0, min = 0, max = 0;
//		double  avg = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		// 그냥 적을때.
////		ar1[0] = sc.nextInt();
////		ar1[1] = sc.nextInt();
////		ar1[2] = sc.nextInt();
////		ar1[3] = sc.nextInt();
////		ar1[4] = sc.nextInt();
////		ar1[5] = sc.nextInt();
////		ar1[6] = sc.nextInt();
////		ar1[7] = sc.nextInt();
////		ar1[8] = sc.nextInt();
////		ar1[9] = sc.nextInt();
//		// for문 활용할때
//		
//		for(int i = 0; i < ar1.length; i++)
//		{	
//			ar1[i] = sc.nextInt();
//			System.out.print(ar1[i] + " ");
//			
//			total += ar1[i];
//			avg = total/10;
//			if(max < ar1.length)
//			{
//				max = ar1[i];
//			}
//			if(min > ar1.length)
//			{
//				min = ar1[i];
//			}
//			
//		
//		}
//		System.out.println();
//		System.out.println("배열 0 - 9번까지의 합은 : " + total);
//		System.out.println("배열 0 - 9번까지의 평균은 : " + avg);
//		System.out.println("배열 0 - 9번까지의 최대값은 : " + max);
//		System.out.println("배열 0 - 9번까지의 최소값은 : " + min);
	
		
		// 선생님 풀이
		//10 크기의 int형 배열을 만들어서
		// 반복문과 함께 해당배열의  0 - 9 까지 요소에 각각 정수 값을 입력
		// 합, 평균, 최대값, 최소값을 구해보자.
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int max,min, sum = 0;
		double avg = 0.0;
		// 값 입력받기
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		//최대, 최소 합 구하기
		max = arr[0];	//기본값
		min = arr[0];	//기본값
		for(int num : arr)
		{
			if(max < num)
			{
				max = num;
			}
			if(min < num)
			{
				min = num;
			}
			sum += num;
		}
		avg =(double)sum / arr.length;
		
		
		System.out.printf("최대 : %d 최소 : %d  합 : %d 평균 : %f\n ", max,min,sum,avg);
		
		// 또 다른방법 
		// 각 배열을  정렬한뒤 제일 마지막 숫자와 제일 앞의 숫자를  출력하게된다 이러면 최소 최대값을 알수있다.
		System.out.println("----------정렬 후 확인--------------");
		
		Arrays.sort(arr);
		for(int a : arr)
		{
			System.out.print(a + " \n");
		}
		System.out.println("----------정렬 후 확인--------------");
		System.out.println("최대값 : " + arr[arr.length-1]);
		System.out.println("최소값 : " + arr[0]);
		
		//또 다른방법
		
		int max1 = Arrays.stream(arr).max().getAsInt();
		int min1 = Arrays.stream(arr).min().getAsInt();
		System.out.println("최대값  : " + max1);
		System.out.println("최소값  : " + min1);
		
		
	}

}
