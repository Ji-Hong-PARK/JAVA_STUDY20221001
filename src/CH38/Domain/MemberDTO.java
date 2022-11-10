package CH38.Domain;
// https://download.eclipse.org/releases/2022-09 
public class MemberDTO extends DTO{
	private String memid;
	private String pwd;
	private int role; 	// 0 : 회원, 1 : 사서   권한을 준다.
	
	
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
		
		this.role = 0; 	// role를 추가해서 2개짜리 생성자에 0값을 넣어주었따.
	}
	
	// role을 추가해서  3개 생성자를 다시 만들었다.
	public MemberDTO(String memid, String pwd, int role) {
		super();
		this.memid = memid;
		this.pwd = pwd;
		this.role = role;
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
	
	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
	
	// toString() 재정의
	
	@Override
	public String toString() {
		return "MemberDTO [memid=" + memid + ", pwd=" + pwd + ", role=" + role + "]";
	}
	
	
	
	
}
