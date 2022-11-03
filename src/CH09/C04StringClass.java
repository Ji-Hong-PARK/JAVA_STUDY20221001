package CH09;

import java.net.SecureCacheResponse;
import java.util.Scanner;

import javax.security.auth.Subject;

public class C04StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int alength, blength;
		char achar, bchar;
		String str1 = new String("java Powerful");
		String str2 = new String("java Programming");
		String str3 = str1 + str2;
		
		//System.out.println(str3);
		
		alength = str1.length();
		blength = str2.length();
		achar = str1.charAt(5); // 문자마다  배열로 0~4번째 있는 문자를 가져온다.
		bchar = str2.charAt(10);	
		
//		System.out.println("str1에 저장 = " + str1 + "길이 = " + alength);
//		System.out.println("str2에 저장 = " + str2 + "길이 = " + blength);
//		System.out.println("str1의 5번째 문장 = " + achar);
//		System.out.println("str1의 10번째 문장 = " + bchar);
//		System.out.println("str1의 대문자로 변환 : " + str1.toUpperCase());
//		System.out.println("str1의 소문자로 변환 : " + str1.toLowerCase());
//		System.out.println("str2의 a를 A로 변환 : " + str2.replace('a','A'));
//		System.out.println("---------------------");
		
		//trim() // 앞 뒤 공백 제거
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		
		System.out.println(tmp);
		System.out.println(tmp.trim());
		
		//subString()
		System.out.println(tmp.substring(2));
		System.out.println(tmp.substring(2,5));
		
		//indexof (문자열) :문자열의 index 번호확이
		System.out.println(tmp.indexOf("H"));
		//lastIndexof("문자열")	: 문자열의 index번호 확인
		System.out.println(tmp.lastIndexOf("H"));
		
		
		
		//contains("문자열") : 문자열 포함여부
		System.out.println(tmp.contains("He"));
		
		//split("구분자")	: 구분자를 기준으로 문자열을 분할(배열형으로 저장)
		String arr[] = tmp.split(" ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.printf("arr[%d] = %s\n",i, arr[i]);
		}
		
		
	}

}
