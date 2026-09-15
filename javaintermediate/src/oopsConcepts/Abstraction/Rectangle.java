package oopsConcepts.Abstraction;

import java.util.Scanner;

public class Rectangle extends Shape{

	Scanner sc = new Scanner(System.in);
	@Override
	public void area() {
		System.out.println("*** RECTANGLE CALCULATED ***");
		
		System.out.println("Enter the Length:-");
		double l=sc.nextDouble();
		
		System.out.println("Enter the Width:-");
		double w=sc.nextDouble();
		
		System.out.println("The Area of Rectangle is:- "+ l*w);
		
		
		
	}

}



