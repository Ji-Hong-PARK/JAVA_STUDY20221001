package C_ThisisJAVA_Problem;

import java.util.Scanner;

public class C01_Test {
	public static void main(String[] args) {
		
		
		
//		int i = 0;
//		int j = 0;
		
//		while(i<4)
//		{
//			j = 0;
//			while( j <= i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		while(i < 4)
//		{
//			j = 0;
//			while( j <= 3 -i)
//			{
//				System.out.printf("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		// 다이아몬드 만들기  값
//		j<= (n/2-1)-i
//		k<= (2*i)
//		
//		j<= i-(n/2+1)
//		k<= (n-1)*2-2*i
		
		//
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=0, j=0, k=0;
		while(i <= n)
		{
			if(i<(n/2))
			{
				//공백
				j=0;
				while(j<=(n/2-1)-i)
					{
						System.out.print(" ");
						j++;
					}
				//별
				k=0;
				while(k <= 2*i)
				{
					System.out.print("*");
					k++;
				}	
			}
			else
			{
				//공백
				j=0;
				while(j<= i-(n/2+1))
					{
						System.out.print(" ");
						j++;
					}
				//별
				k=0;
				while(k <= (n-1)*2-2*i)
				{
					System.out.print("*");
					k++;
				}
			}
			System.out.println();
			i++;
		}
		
		
		

	}

}
