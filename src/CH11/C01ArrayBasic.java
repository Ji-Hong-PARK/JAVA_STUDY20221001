package CH11;

import java.util.Scanner;

public class C01ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//길이가 5인 int 형 1차원 배열의 생성
		int[] ar1 = new int[5];
		Scanner sc = new Scanner(System.in); // 값이 지정된게 아니라 스캐너로 넣얼수도 있다.
		
		
		//기본값을 넣어보자.
		ar1[0] = 11;
		ar1[1] = 12;
		ar1[2] = 13;
		ar1[3] = 14;
		ar1[4] = 15;
		
		
		//or
		
		int[] ar4 = new int[5];
		ar4[0] = sc.nextInt();
		ar4[1] = sc.nextInt();
		ar4[2] = sc.nextInt();
		ar4[3] = sc.nextInt();
		ar4[4] = sc.nextInt();
		// 컬렉션 ( 지정된 배열보다 좀더 큰 배열을 쓸려면 컬렉션을 써야 한다.) 
		
		
		
		//반복문을 만들어보자
		//기존 방법
		for(int i = 0; i < ar1.length; i++)
		{
			System.out.print(ar1[i] + " ");
		}
		System.out.println();
		
		// or
		//추가(컬렉션에도 적용가능) 방법
		for(int val : ar1)
		{
			//va1에 각 원소를 넣어준다.
			System.out.print(val + " ");
		}
		System.out.println();
		
		//---------------
		
		for(int val1 : ar4)
		{
			//va1에 각 원소를 넣어준다.
			System.out.print(val1 + " ");
		}
		System.out.println();
		
		
		//길이가 7인 double 형 1차원 배열의 생성
		double[] ar2 = new double[7];
		
		//배열의 참조변수와 인스턴스 생성 분리
		float[] ar3;
		ar3 = new float[9];
		
		//배열의 인스턴스 변수 접근
		System.out.println("배열 ar1 길이 : " + ar2.length);
		System.out.println("배열 ar2 길이 : " + ar2.length);
		System.out.println("배열 ar3 길이 : " + ar3.length);
	}

}
