package oopsConcepts.Abstraction;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("cat make meow meow sound!!");
	}

	@Override
	public void eat() {
		System.out.println("cat eats cat food!!");
	}

	@Override
	public void color() {
		System.out.println("cats has different colors!!");
	}
	
	@Override    // DEFAULT METHODS CAN BE OVERRIDEN!!
	public void run() {
		System.out.println("I can run but i prefer to JUMP!!");
	}

}
