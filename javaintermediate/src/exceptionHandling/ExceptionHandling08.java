package exceptionHandling;

import java.util.Scanner;

public class ExceptionHandling08 {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Main Method Started!!");
		
		int [] arr= new int[5]; // 0 1 2 3 4
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		try {
			System.out.println("Enter array Index:-");
			int index=sc.nextInt();
			System.out.println("Index Element is:- "+arr[index]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());	

		}

		System.out.println("Enter First Element");
		String a=sc.next();
		
		System.out.println("Enter Second Element");
		String b= sc.next();
		
		int n1=Integer.parseInt(a);
		int n2=Integer.parseInt(b);
		
		try {
		System.out.println("Result:- "+n1/n2);
		}
		catch(ArithmeticException e) {
			System.err.println(e.getMessage());	
		}
		
		
		try {
			String str3="2";
			int n3= Integer.parseInt(str3);
			System.out.println(n3*30);
			}
			catch(NumberFormatException e) {
				System.err.println(e.getMessage());
				
			}
			
		System.out.println("Main Method Ended!!");
	
		
	}

}


/*
 * 1.Create a Java program that performs the following operations: Ask the user
 * to enter two numbers as Strings. Convert the Strings into integers using
 * Integer.parseInt(). Divide the first number by the second number. Handle
 * ArithmeticException if the second number is 0. Create an integer array
 * containing 5 elements. Ask the user to enter an array index and display the
 * element at that index. Handle ArrayIndexOutOfBoundsException if the index is
 * invalid. If the user enters an invalid number while converting the String to
 * an integer, handle NumberFormatException. Use separate catch blocks for all
 * three exceptions.
 */