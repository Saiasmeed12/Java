package oopsConcepts.Abstraction;

public class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("dog makes bow boww sound!!!");
	}

	@Override
	public void eat() {
		System.out.println("dog eats dog food!!!");
	}

	@Override
	public void color() {
		System.out.println("dog have different colors!!!");
	}

}
