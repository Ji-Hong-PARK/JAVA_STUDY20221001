package Ch13EXEC;


//다음 2개의 static 가진 ArrayUtil 클래스를 만들어보자. 
//다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.

class ArrayUtil2 {									// 문제를 이해를 돕기 위해 :  배열 복사! 
   public static int[] concat(int[] a, int[] b) 
   {
            /* 배열 a와 b를 연결한 새로운 배열 리턴 */
	   int len = a.length + b.length;
	   int[]arr = new int[len];
	   int i= 0;
	   while(i<a.length)
	   {
		   arr[i] = a[i];
		   i++;
	   }
	   while(i < len) 
	   {
		   arr[i] = b[i-a.length];
		   i++;
	   }
	   return arr;
   }
   public static void print(int[] a) 
   { 
      /* 배열 a 출력 */
	 for(int t : a)
	 {
		 System.out.println(t + " ");
	 }
   }
}

public class C01PRAC2 {
	public static void main(String[] args) {
		   // TODO Auto-generated method stub
	      int[] array1 = {1, 5, 7, 9};
	      int[] array2 = {3, 6, -1, 100, 77};
	      int[] array3 = ArrayUtil2.concat(array1, array2);	     
	      ArrayUtil2.print(array3);
	      
	     
	}
}
