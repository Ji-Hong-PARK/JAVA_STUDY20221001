package CH10;

class Controller
{
	MemberInfo member;
	
	void SetMember(MemberInfo member)
	{
		this.member = member;
	}
	MemberInfo getMember()
	 {
		 return member;
	 }	
}

class MemberInfo
{
	String name;
	int age;
	String addr;
	
	public MemberInfo(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MemberInfo [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}	
}


public class C01ClassMethod {

	public static void main(String[] args) {
	
		MemberInfo obj = new MemberInfo("홍길동", 55,"대구");
		
		Controller controller = new Controller();
		controller.SetMember(obj);
		
		MemberInfo tmp = controller.getMember();
		
		
		
		
		
	}

}
