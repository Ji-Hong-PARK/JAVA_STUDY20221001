package Ch22;

import java.io.*;

public class C03ReadLineExample {
	public static void main(String[] args) throws Exception {
		
		Writer writer = new FileWriter("c:/temp/RWbuffer.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("This is BufferedReader Buffered Writer Test\n");
		bw.flush();
		bw.close();
		writer.close();
		
		
		Reader reader = new FileReader("c:/temp/RWbuffer.txt");
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();	//개행을 기준으로 읽음 
			if(data == null) break;
			System.out.println(data);
		}
		
		br.close();
		reader.close();
	}
}
