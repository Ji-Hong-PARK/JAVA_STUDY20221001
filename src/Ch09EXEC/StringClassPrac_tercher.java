package Ch09EXEC;

class Profiletercher
{

	private String name;
	private String addr;
	private String job;
	private String major;
	//1 디폴트 생성자 삽입
	Profiletercher()
	{
		
	}
	//2 모든 인자를 받는 생성자 삽입
	Profiletercher(String name, String addr, String job, String major)
	{
		super();
		this.name = name;
		this.addr = addr;
		this.job = job;
		this.major = major;		
	}
	

	//3다음 생성자 안 코드 처리하기.
	Profiletercher(String all)				// String all = " 홍길동,대구,프로그래머,컴퓨터공학 "
	{
		all = all.trim();			// all = "홍길동,대구,프로그래머,컴퓨터공학 "
		
		String tmp[] = all.split(",");	// tmp = ["홍길동,대구,프로그래머,컴퓨터공학 "]
		//tmp[0]== "홍길동", tmp[1] == "대구", tmp[2] == "프로그래머", tmp[3] == "컴퓨터공학"
		
		name = tmp[0];
		addr = tmp[1];
		job = tmp[2];
		major = tmp[3];		// 이렇게 쓰면 배열에다 각각의 값이 저장이 된다.
	}
	
	
	

	

	boolean isContain(String findstr) 
	{
		//findstr 의 문자열이 멤버인 name,addr,job,major 중 하나라도 포함되면 true 리턴
		//아니면 false 리턴
		
		if(name.contains(findstr)) //이름 문자열에 "길동"이라는 문자가 들어있나? 라고 물어보는것. 있으면 true 
		{
			System.out.println(findstr + "은 name =" + name + " 이라는 이름에 포함되어있습니다.");
			return true;
		}
		else if(addr.contains(findstr))
		{
			System.out.println(findstr + "은 주소에 포함되어 있습니다.");
			return true;
		}
		else if(job.contains(findstr))
		{
			System.out.println(findstr + "은 직업에 포함되어 있습니다.");
			return true;
		}
		else if(major.contains(findstr))
		{
			System.out.println(findstr + "은 전공에 포함되어 있습니다.");
			return true;
		}
		System.out.println(findstr + " 은 해당 객체에 포함되어 있지 않습니다.");
		return false;
		
	}
	
	
	boolean isequals(String all) 
	{
		//all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
		//name,addr,job,major 와 일치 하면 true
		//아니면 false 를 리턴
		
		all = all.trim();
		String tmp[] = all.split(",");	//[홍길동,대구,프로그래머,컴퓨터공학]
		
		if(!name.equals(tmp[0]))	// name과 tmp[0]와 같지 않다면 true
		{
			return false;
		}
		else if(!addr.equals(tmp[1]))	//멤버의 주소와  입력받은 주소가 같다면 아래칸으로 이동(if문)
		{
			return false;
		}
		else if(!job.equals(tmp[2]))
		{
			return false;
		}
		else if(!major.equals(tmp[3]))
		{
			return false;
		}
		return true;
		
		
		
		
	}
	
	
	
	//4 toString() 재정의 코드 삽입
	
	@Override
	public String toString() {
		return "Profile [name=" + name + ", addr=" + addr + ", job=" + job + ", major=" + major + "]";
	}
	
	
	//5 Getter and Setter 코드 삽입W
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	
}



public class StringClassPrac_tercher {

	public static void main(String[] args) {
		Profiletercher hong = new Profiletercher(" 홍길동,대구,프로그래머,컴퓨터공학 ");
		
		//멤버 내용 출력
		System.out.println(hong.toString());
		
		System.out.println("길동 포함 여부 : " + hong.isContain("길동"));
		System.out.println("컴퓨터 포함 여부 : " + hong.isContain("컴퓨터"));
		System.out.println("---------------------------------");
		System.out.println("프로필 일치 여부 : "+ hong.isequals(" 홍길동,대구,프로그래머,컴퓨터공학 "));
		System.out.println("프로필 일치 여부 : "+ hong.isequals(" 홍길동,울산,프로그래머,컴퓨터공학 "));
		
		
	}

}
