package CH38.Domain;
// https://download.eclipse.org/releases/2022-09 
public class MemberDTO extends DTO{
	private String memid;
	private String pwd;
	
		// Getter and Setter
		// 모든인자 받는 생성자
		// toString() 재정의
		// 디폴트 생성자
		//을 만들어야 한다 먼저
	
	//디폴트 생성자 만들기
	public MemberDTO() {}

	// 모든인자 받는 생성자
	public MemberDTO(String memid, String pwd) {
		super();
		this.memid = memid;
		this.pwd = pwd;
	}
	
	//Getter and Setter 만들기
	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	// toString() 재정의
	@Override
	public String toString() {
		return "MemberDTO [memid=" + memid + ", pwd=" + pwd + "]";
	}
	
	
	
}
