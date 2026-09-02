package oopsConcepts;

public class Animal {

	public void bark() {
		System.out.println("ANimal Brakes");
	}
}
class Dog extends Animal{
	
	public void smell() {
		System.out.println("Dog smells good");
		
	}

	
	
	public static void main(String[] args) {

		Dog d = new Dog();
		
		d.bark();
		d.smell();
		
		
	}

}
