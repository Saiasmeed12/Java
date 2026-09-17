package exceptionHandling;

public class ExceptionHandling04 {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		
		String str="Sai Asmeed";
		
		
		try {
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(11));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
	
		}
		
		
		System.out.println("Main Method Ended");

	}

}
