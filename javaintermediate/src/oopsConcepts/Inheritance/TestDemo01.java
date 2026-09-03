package oopsConcepts.Inheritance;


class Vehicle{
	int speed=50;
public void display() {
		System.out.println("Parent Display called");
	}
}

class car extends Vehicle{
	int speed=100;
	
	public void display() {
		System.out.println("Child Display called");
	}
	
	
}

public class TestDemo01 {

	public static void main(String[] args) {
		
		 Vehicle c= new car();
		
		c.display();
		System.out.println(c.speed);
		

	}

}

/*
 * 1.Create a Java program using inheritance with a parent class Vehicle and a
 * child class Car. Requirements: Vehicle should have a variable speed = 50 and
 * a method display(). Car should have its own variable speed = 100 and override
 * the display() method. Create a Car object using a parent-class reference.
 * Access the speed variable and call the display() method. Predict the output
 * before running the program. Explain why the variable and method behave
 * differently.
 */