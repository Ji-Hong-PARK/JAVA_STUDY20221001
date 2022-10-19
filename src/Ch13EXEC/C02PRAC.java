package Ch13EXEC;


 class ShopService{
	//싱글톤 구현
	 String x,y,name;
	private static ShopService instance;
	
	private ShopService()
	{
		x = "어렵다 여러개의 생성자를 하나의 주소값 으로!  불러온다!!! ";
		y = "싱글턴 패턴은 프라이빗으로 인한 생성자를 못불러오기때문에 getInstance를 사용해서 생성자를 불러온다";
		name = "박지홍";
	}
	
	public static ShopService getInstance()
	{
		if(instance == null)
		{
			instance = new ShopService();
		}
		return instance;
	}
	
}

 
 
 //--------------------------선생님 풀이---------------------------------------
// class ShopService{
//	 
//	 private static ShopService instance;
//	 private ShopService() {};	// 프라이빗으로 생성자를 생성할수 없게 만든다!
//	 public static ShopService getInstance()
//	 {
//		 if(instance == null)	// 중복이 되면 안되기때문에  null 이랑 같다고 적으면된다.
//		 instance = new ShopService();		// instance(인스턴스)를  = new ShopService();라고 명칭한다. 
//		 return instance;	// 인스턴스를 리턴을 한다.
//	 }
// }

 
public class C02PRAC {

		//---------------------------------------
		//Practice
		//---------------------------------------
		//shopService 객체를 싱글톤으로 만들어 보세요 
		//ShopServiceExample 클래스에서 shopService 의 getInstance() 메소드로 싱글톤을 얻을 수 있도록
		//ShopService 클래스를 작성해보세요

		//------------------
		//ShopService.java
		//------------------
		//Package Ch15;
	


		//------------------
		// ShopServiceExample.java
		//------------------
		//Package Ch15;
			
	public static class ShopServiceExample{
		public static void main(String [] args) {
			ShopService obj1 = ShopService.getInstance();
			ShopService obj2 = ShopService.getInstance();
// ShopService obj3 = new ShopService();<- X : new ShopService = instance = ShopService.getInstance
			if(obj1==obj2) {
				System.out.println("같은 ShopService 객체입니다. // 같은 주소값이므로  서로 같다고 할수있다!");
			}
			else 
			{
				System.out.println("다른 ShopService 객체 입니다.");
			}
			
			
			System.out.println(obj1.name);
//			System.out.println("obj1 : " + obj1.y);
//			
//			System.out.println("obj2 : " + obj2.x);
//			System.out.println("obj2 : " + obj2.y);
			
			
		}
	}

}


