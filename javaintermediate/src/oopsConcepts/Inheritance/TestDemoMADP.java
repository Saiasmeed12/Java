package oopsConcepts.Inheritance;

    class Animal {
	   public void  bark() {
		  System.out.println("Animal barks!!");	  
	  }
  }
   
   class Dog extends Animal{
	   public void angry() {
		   System.out.println("Dog is angry");
	   }
   }
   
   class Cat extends Animal{
	   public void angry() {
		   System.out.println("Cat is Angry");
	   }
   }
   
   class Cow extends Dog{   // 
	   
   }

public class TestDemoMADP {

	public static void main(String[] args) {
	
		Cow c= new Cow();
		c.angry();	
	}

}
