package CH21;

import java.io.FileInputStream;
import java.io.InputStream;

public class C05FileInputStream {

	public static void main(String[] args) throws Exception 
	{
		InputStream in = new FileInputStream("c:\\iotest\\test.exe");
		
		while(true)
		{
			int data = in.read();
			if(data == -1)
			{
				break;
			}
			System.out.print((char)data + " ");
		}
		

	}

}
