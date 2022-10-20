package CH17;



public class C03ObjectHasCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println("--------------------");
		System.out.printf("%x\n", obj1.hashCode());
		System.out.printf("%x\n", obj2.hashCode());
		System.out.println("--------------------");
		System.out.printf("%x\n", System.identityHashCode(obj1));
		System.out.printf("%x\n", System.identityHashCode(obj2));
		
	}

}
