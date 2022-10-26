package Ch22;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;



public class C06ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		writeList();
		List<C06Board> list = readList();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(C06Board board : list) {
			System.out.println(
				board.getBno() + "\t" + board.getTitle() + "\t" + 
				board.getContent() + "\t" + board.getWriter() + "\t" +
				sdf.format(board.getDate())
			);
		}
	}
	
	public static void writeList() throws Exception {
		List<C06Board> list = new ArrayList<>();
		list.add(new C06Board(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new C06Board(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new C06Board(3, "제목3", "내용3", "글쓴이3", new Date()));
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	
		oos.writeObject(list);//객체단위 전송 (직렬화)
		oos.flush();
		oos.close();
	}
	
	public static List<C06Board> readList() throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<C06Board> list = (List<C06Board>) ois.readObject(); // 객체단위 수신(역직렬화)
		return list;
	}
}
