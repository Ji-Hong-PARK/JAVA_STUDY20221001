package Ch05;

import java.io.IOException;

public class C05LogicArith {

	public static void main(String[] args) {
		{
			int a=0,b=0;
			boolean c;
			a = 1;
			b = 1;
			c =(++a>0)&&(++b>0) ;
			System.out.printf("a = %d , b = %d c = %s\n", a, b, c);

			a = 1;
			b = 1;
			c = (++a>0)&&(--b>0) ;
			System.out.printf("a = %d , b = %d c = %s\n", a, b, c);

			a = 1;
			b = 1;
			c = (--a>0)&&(++b>0) ;
			System.out.printf("a = %d , b = %d c = %s\n", a, b, c);

			a = 1;
			b = 1;
			c = (--a>0)&&(b-->0) ;
			System.out.printf("a = %d , b = %d c = %s\n", a, b, c);
		}

	}

}
