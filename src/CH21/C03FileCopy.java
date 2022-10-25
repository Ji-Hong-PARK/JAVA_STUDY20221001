package CH21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class C03FileCopy {

	public static void main(String[] args)  throws Exception
	{
		Reader in = new FileReader("c:\\iotest\\original.txt");	// 원본
		Writer out = new FileWriter("c:\\iotest\\copyfile.txt");//복사본
		
		
		//한문자씩 가져오면  시간이 오래걸릴수 잇으니 버퍼 공간을 만든다.
		//버퍼 배열
		
		char buff[] = new char[100];
		
		while(true)
		{	//buff크기만큼 읽어서 buff에 저장 한뒤 읽은 개수를 cnt에 전달.
			int cnt = in.read(buff);
			if(cnt == -1)
			{
				break;
			}
			System.out.println("CNT : " + cnt);
			out.write(buff);
			out.flush();
		}
		

	}

}
