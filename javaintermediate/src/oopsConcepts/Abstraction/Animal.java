package oopsConcepts.Abstraction;

public interface Animal {
	
	void sound();
	void eat();
	void color();
	
	//void run(); //  After implementing all methods if i create a new method in interface I NEED TO IMPLEMENT
                // THAT METHOD AGAIN IN THE CLASSES SO THIS PROCESS OF IMPLEMENTING THE NEW METHOD AGAIN 
	            // IN THE CLASSES IS THE PROBLEM OF BACKWARD COMPATIBILITY,
	  		    //TO AVOID THAT WE CAN USE "DEFAULT METHODS".
	
	
	default void run() {
		System.out.println("ALL ANIMALS CAN RUN");
		drink();
	}
	
	
	//Generally we can all static method with object and parent refernce but in static interface will can
	//only call with INTERFACE REFERENCE ONLY!!!!
	static void breath() {
		System.out.println("ALL ANIMALS CAN BREATH!!");
//		drink(); //Cannot make a static reference to the non-static method drink() from the type Animal.
		drink();
	}
	
	
	// to avoid duplicate and changing of data we use private method instead of default method
	
	 private static void drink()
	 {             
		 System.out.println("Animals drink water!!"); // nobody can change or override the method 
		                                              //unlike default method.
	 }
	
}
