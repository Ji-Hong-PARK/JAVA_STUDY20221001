package Ch22;

import java.io.*;

public class C02NonBufferVsBufferExample {
	public static void main(String[] args) throws Exception {
		
		//버퍼 미사용 스트림
		String targetFilePath1 = "C:/iotest/cg125.jpg";
		FileInputStream fis = new FileInputStream(targetFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		//버퍼 사용 스트림
		String targetFilePath2 = "C:/iotest/cg125.jpg";
		FileInputStream fis2 = new FileInputStream(targetFilePath2);
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + "ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 때:\t\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();//시작시간
		while(true) {
			data = is.read();//INPUT 스트림으로부터  한바이트씩 읽기
			if(data == -1) 
				break;
			os.write(data);	//OUTPUT 스트림으로 한바이트씩 쓰기
		}
		os.flush();
		long end = System.nanoTime(); //끝시간
		return (end-start);
	}
}
