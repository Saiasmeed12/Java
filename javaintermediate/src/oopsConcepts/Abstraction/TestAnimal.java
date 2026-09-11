package oopsConcepts.Abstraction;

public class TestAnimal  {

	public static void main(String[] args) {
		
		System.out.println("DOG INFO🦴");
		Animal d =new Dog();      //we will not create the child object-child refernce to avoid   
		d.sound();                //exposer of implementation so we stored the child object in interface
		d.eat();                  //to provide abstraction
		d.color();
		d.run();
//		d.breath();//This static method of interface Animal can only be accessed as Animal.breath
		Animal.breath();
		System.out.println("------------------");
		
		System.out.println("CAT INFO🐈");
		Animal c = new Cat();
		c.sound();
		c.eat();
		c.color();
		c.run();
		Animal.breath();
		System.out.println("------------------");
		
	}

}
