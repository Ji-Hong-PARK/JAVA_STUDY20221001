package Ch13EXEC;


//다음 2개의 static 가진 ArrayUtil 클래스를 만들어보자. 
//다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.

class ArrayUtil {									// 문제를 이해를 돕기 위해 :  배열 복사! 
   public static int[] concat(int[] a, int[] b) 
   {
            /* 배열 a와 b를 연결한 새로운 배열 리턴 */
	   int tmp[] = new int[a.length+b.length];	//배열을  길이를 구해서 tmp [] 라는 곳에 복사를한다.
	      int i=0;								// 2차원 배열을 1차원으로 돌리기위해  순서에 맞게 넣기위해서 for문을 사용
	      for(; i<a.length; i++) {				// for문 0부터 a길이만큼 i를 증가시켜서 
	         tmp[i] = a[i];						// tmp[i]를 a[i]와 같다 넣는다.
	      }
	      for(;i<a.length+b.length;i++) {		//2중 for문을 활용하여 a배열과 b배열을 더한만큼 순차적으로 돌린다.
	         tmp[i] = b[i-a.length];			// b[i-a.length] b배열에서 a를 뺀만큼 tmp[i] 넣는다. 
	      }
	      return tmp;							//tmp[i]를 리턴해서 저장.
	   
   }
   public static void print(int[] a) 
   { 
      /* 배열 a 출력 */
	   System.out.print("[");					// 배열 a를  출력하기 전에 [ <-이걸 넣어서 배열이라는걸 가르킨다.
	      for(int i=0; i<a.length;i++) {
	         System.out.print(" "+a[i]+" ");
	      }
	      System.out.print("]");
	   
	   
   }
}

public class C01PRAC {
	public static void main(String[] args) {
		   // TODO Auto-generated method stub
	      int[] array1 = {1, 5, 7, 9};
	      int[] array2 = {3, 6, -1, 100, 77};
	      int[] array3 = ArrayUtil.concat(array1, array2);
	      //int[] array3 = ArrayUtil.concat(array2, array1);
	      ArrayUtil.print(array3);
	      //ArrayUtil.print(array1);
	      //ArrayUtil.print(array2);
	     
	}
}
