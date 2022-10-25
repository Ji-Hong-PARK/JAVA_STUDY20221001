package CH21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02Reader {

	public static void main(String[] args) throws Exception {
		
		// 파일을 가져와서 읽는 형태의 코딩
		
		Reader in = new FileReader("C:\\iotest\\test.txt");

		while(true)
		{
			int data = in.read();
			if(data==-1)	//in.read으로 받아오는게 마지막에 아무것도 없으면 -1이되는데 그때 무한루프를 끄겠다한다. 
			{
				break;
			}
			// int형 유니코드로 받아와서 char로 형변환하면 문자가된다.
			System.out.print((char)data + " ");	
			System.out.println();
			
		}
	}

}
