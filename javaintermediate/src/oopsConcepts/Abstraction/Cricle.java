package oopsConcepts.Abstraction;

import java.util.Scanner;

 class Cricle extends Shape {

	Scanner sc=new Scanner(System.in);
	@Override
	public void area() {

		System.out.println("*** CIRCLE CALCULATED ***");

		System.out.println("Enter the Radius(r):- ");
		double r =sc.nextDouble();
		
		System.out.println("The Area of Circle is:- "+Math.PI*Math.pow(r,2));
		
	}

}
