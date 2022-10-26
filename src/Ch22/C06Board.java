package Ch22;

//자바 시스템 내부에서 사용되는 Object 또는 Data를 외부의 자바 시스템에서도 사용할 수 있도록 byte 형태로 데이터를 변환하는 기술.
//JVM(Java Virtual Machine 이하 JVM)의 메모리에 상주(힙 또는 스택)되어 있는 객체 데이터를 바이트 형태로 변환하는 기술
//직렬화(Serialize) 조건
//java.io.Serializable 인터페이스를 상속받은 객체는 직렬화 할 수 있는 기본 조건입니다.


import java.io.Serializable;
import java.util.Date;

public class C06Board implements Serializable {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	
	public C06Board(int bno, String title, String content, String writer, Date date) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	
	
	public int getBno() { return bno; }
	public void setBno(int bno) { this.bno = bno; }
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getContent() { return content; }
	public void setContent(String content) { this.content = content; }
	public String getWriter() { return writer; }
	public void setWriter(String writer) { this.writer = writer; }
	public Date getDate() { return date; }
	public void setDate(Date date) { this.date = date; }
}
