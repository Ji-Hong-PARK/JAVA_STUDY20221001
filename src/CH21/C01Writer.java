package CH21;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01Writer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Writer out = new FileWriter("C:\\iotest\\test.txt", true);	
		//2바이트 크기으 파일을  보내겠다  지정경로로 스트림
		//중복이되면은... 덮어쓰기가 기본옵션으로 되어있다!  
		//경로는 기본으로 false로 되어있는데 ("C:\\iotest\\test.txt", true);	 이렇게 true로 쓰면 추가로 바뀜
		out.write("aaa\n");
		out.write("bbb\n");
		out.write("ccc\n");
		
		out.flush();		//버퍼 초기화
		out.close();		//스트림 제거
		
		
		
		
	}

}
