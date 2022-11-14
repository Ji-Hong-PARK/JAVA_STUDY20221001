package CH38.Domain;

public class LendDTO {
	private int Lid;
	private int bookcode;
	private String memid;
	private String starDate;
	private String endDate;
	
	
	//getter and setter 만들기.
	public int getLid() {
		return Lid;
	}

	public void setLid(int lid) {
		Lid = lid;
	}

	public int getBookcode() {
		return bookcode;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	public String getStarDate() {
		return starDate;
	}

	public void setStarDate(String starDate) {
		this.starDate = starDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	//toString 만들기
	@Override
	public String toString() {
		return "LendDTO [Lid=" + Lid + ", bookcode=" + bookcode + ", memid=" + memid + ", starDate=" + starDate
				+ ", endDate=" + endDate + "]";
	}
	//기본생성자, 모든인자 생성	
	public LendDTO(int lid, int bookcode, String memid, String starDate, String endDate) {
		super();
		Lid = lid;
		this.bookcode = bookcode;
		this.memid = memid;
		this.starDate = starDate;
		this.endDate = endDate;
	}
	

	// 모든인자생성
	public LendDTO() {};
	


	
	
	
	
	
}
