package CH38.Domain;

public class BookDTO extends DTO{
	private int bookCode;
	private String bookName;
	private boolean isLend;
	
	public BookDTO(int bookCode, String bookName, boolean isLend) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.isLend = isLend;
	}
	public BookDTO(int bookCode, String bookName) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.isLend = true;
	}
	BookDTO(){}
	//생성자(모든인자받기)
	//디폴트 생성자
	//toString() 재정의
	//Getter and Setter
	public int getBookCode() {
		return bookCode;
	}
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public boolean isLend() {
		return isLend;
	}
	public void setLend(boolean isLend) {
		this.isLend = isLend;
	}
	@Override
	public String toString() {
		return "BookDTO [bookCode=" + bookCode + ", bookName=" + bookName + ", isLend=" + isLend + "]";
	}
	
}
