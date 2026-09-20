package exceptionHandling;

public class ExceptionHandling05 {

	public static void main(String[] args) {

		System.out.println("Main Method Started!!");

		String str="123";
		long n1=Long.parseLong(str);
		System.out.println(n1*10);
		
		
		String str2="50";
		int n2=Integer.parseInt(str2);
		System.out.println(n2*20);
		
		try {
		String str3="three";
		int n3= Integer.parseInt(str3);
		System.out.println(n3*30);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			
		}
		
		
		System.out.println("Main Method Ended!!");

		
	}

}
