package exceptionHandling;

//Multiple Catchs

public class ExceptionHandling06 {

	public static void main(String[] args) {

		System.out.println("Main Method Started!!");
		
		try {
		System.out.println("Symbol 1");
		System.out.println("Symbol 2");
		System.out.println("Symbol 3");
		int a =10/5;
		
		String str="Abhi";
		System.out.println(str.charAt(a));
		
		System.out.println("Symbol 4");
		System.out.println("Symbol 5");
		}
		
		
		catch(ArithmeticException | StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		 
		  }
		 
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Method Ended!!");
	}

}
