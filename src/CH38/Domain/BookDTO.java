package CH38.Domain;

public class BookDTO extends DTO{
	private int bookCode;
	private String bookname;
	private boolean isLend;
	
	public BookDTO(int bookCode, String bookname, boolean isLend) {
		super();
		this.bookCode = bookCode;
		this.bookname = bookname;
		this.isLend = isLend;
	}
	public BookDTO(int bookCode, String bookname) {
		super();
		this.bookCode = bookCode;
		this.bookname = bookname;
		this.isLend = true;
	}
	BookDTO(){}
	
	// 생성자(모든인자받기)
	// 디폴트 생성자
	// toString() 재정의
	// Getter and Setter
	
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public boolean isLend() {
		return isLend;
	}
	public void setLend(boolean isLend) {
		this.isLend = isLend;
	}
	
	
	@Override
	public String toString() {
		return "BookDTO [bookCode=" + bookCode + ", bookname=" + bookname + ", isLend=" + isLend + "]";
	}

	
}
