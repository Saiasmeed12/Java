package oopsConcepts.Abstraction;

import java.util.Scanner;

public class Triangle extends Shape {

	Scanner sc =new Scanner(System.in);
	@Override
	public void area() {
		
		System.out.println("*** TRIANGLE CALCULATED ***");
		
		System.out.println("Enter the Base:-");
		double b=sc.nextDouble();
		
		System.out.println("Enter the Height:-");
		double h=sc.nextDouble();
		
		System.out.println("The Area of Triangle is:- "+0.5*b*h);

		
		
	}

}
