package Korea_It_Test2;

import java.util.ArrayList;
import java.util.List;


//다음 Cal 클래스를  singeton 패턴 코드를 삽입하세요
//멤버변수 arr배열을 ArrayList로 변경 처리해보세요
//(참조변수명은 임의로 지정합니다)
//ShowVal() 멤버함수의 코드를 ArrayList에 맞게 변경해 보세요.

class Cal
{
	//멤버변수(arr[] -> ArrayList로 변경! , idx는 삭제)
	
	ArrayList<Integer> list = new ArrayList<>();
	
	//싱글톤 패턴 코드 삽입
	private static Cal instance;	

	public int InsertVal(int tmp)
	{
		try {
			list.add(tmp);
		}catch (Exception e) {
			return -1;
		}
		return 0;
	}

	
	
	public static Cal getInstance()
	{
		if(instance == null)
		{
			instance = new Cal();
		}
		return instance;
	}
	
	//저장된 값 확인(ArrayList 에 맞제 변경하기)
	public void ShowVal() {
		System.out.println("-------조회---------");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
	}
	
}

public class test {

	public static void main(String[] args) {
		
		Cal cal = Cal.getInstance();
		
		for(int i = 1; i <= 100; i++)
		{
			cal.InsertVal(i);
		}
		cal.ShowVal();
	}

}










