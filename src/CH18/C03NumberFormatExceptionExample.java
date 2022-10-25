package CH18;

public class C03NumberFormatExceptionExample {
	public static void main(String[] args) {
		try {
		String data1 = "100";
		String data2 = "a100";
				
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);	//문자가 포함된 내용 Integer로 변환 
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
		}catch(NumberFormatException e){
			System.out.println("예외처리 구문");
		}finally {
			System.out.println("예외처리 상관없이 무조건 처리");
		}
		System.out.println("예외처리 끝난 후 처리");
	}
}

