package CH38.Domain;

public class MemberDTO extends DTO {
	private String memId;
	private String pwd;
	private int role;	//0 회원 , 1 사서
	
	
	
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [memId=" + memId + ", pwd=" + pwd + ", role=" + role + "]";
	}
	public MemberDTO(String memId, String pwd) {
		super();
		this.memId = memId;
		this.pwd = pwd;
		this.role = 0;
	}
	public MemberDTO(String memId, String pwd, int role) {
		super();
		this.memId = memId;
		this.pwd = pwd;
		this.role = role;
	}
	
	public MemberDTO() {}
	//Getter and Setter
	//디폴트 생성자
	//모든인자 받는 생성자
	//toString() 재정의
	
}
