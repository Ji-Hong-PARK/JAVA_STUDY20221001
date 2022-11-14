package CH38.Domain;

public class LendDTO  extends DTO{
	private int Lid;
	private boolean login;
	private int perm;
	private String id;
	private int bookcode;
	private String memid;
	private String starDate;
	private String endDate;
	
	
	
	// 새로만든 get,setter 추가해준다.
	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	public int getPerm() {
		return perm;
	}

	public void setPerm(int perm) {
		this.perm = perm;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
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
