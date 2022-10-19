package Ch11EXEC;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class C01ArrayPrac {

	public static void main(String[] args) {
		//10 크기의 int형 배열을 만들어서
		//반복문과 함께 해당배열의 0 - 9 까지 요소에 각각 정수값을 입력
		//합,평균,최대값,최소값을 구합시다	
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int max,min,sum=0;
		double avg=0.0;
		//값입력받기
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		//최대,최소,합
		max=arr[0]; //기본값
		min=arr[0]; //기본값
		for(int num : arr) {
			if(max<num) {
				max=num;
			}
			if(min>num) {
				min=num;
			}
			sum+=num;
		}
		avg=(double)sum/arr.length;
		
		System.out.printf("최대:%d 최소:%d 합:%d 평균:%f\n",max,min,sum,avg);

		//또다른 방법
		System.out.println("-----------정렬 후 확인-----------");
		Arrays.sort(arr);
		for(int a : arr) {
			System.out.print(a +" ");
		}
		System.out.println("\n-----------정렬 후 확인-----------");
		System.out.println("최대값 : " + arr[arr.length-1]);
		System.out.println("최소값 : " + arr[0]);
		
		
		//또다른 방법
		int max1 = Arrays.stream(arr).max().getAsInt();
		int min1 = Arrays.stream(arr).min().getAsInt();
		
		
		
				
	
		
		
		
	}

}
