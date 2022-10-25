package CH18;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class C04ClassCastExceptionExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);		// 잘못된 참조변수 전달
		
		System.out.println("Main 함수로 복귀");
	}
	
	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog) {
		try {
			Dog dog = (Dog) animal; 				//ClassCastException
		}catch(ClassCastException e) {
			System.out.println("캐스트 오류가 발생");
		}finally {
			System.out.println("Finally 구문");
		}
		//} 
	}
}



