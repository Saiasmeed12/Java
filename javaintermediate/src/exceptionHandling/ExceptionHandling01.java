package exceptionHandling;

import java.util.Scanner;

// ARTHIMETIC AND INPUTMISMATCH EXCEPTION

public class ExceptionHandling01 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		try {
		System.out.println("Main Method Started");
		
		System.out.println("Enter First Value:-");
		int a= sc.nextInt();
		
		System.out.println("Enter Second Value:-");
		int b= sc.nextInt();
		
		System.out.println(a/b);
		}
	
		catch(Exception e) {
			e.printStackTrace();
//			System.err.print(e);
//			System.err.print(e.getMessage());
//			System.err.print(e.toString());
			
		}
		
		System.out.println("Main Method Ended");

		sc.close();
		
	}

}
