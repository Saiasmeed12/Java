package logicalStatements.loop;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String y;
		do {
		System.out.println("Enter a Number:-");
		int n= sc.nextInt();
		
	  
			if( n % 2 == 0) {
				System.out.println("The Given number is Even");
			}
			else {
				System.out.println("The Given number is Odd");
			}
			
			System.out.println("Do you want to continue? Y/N");
			y=sc.next();
		
		}
		while(y.equalsIgnoreCase("Y")); 
			
		System.out.println("EXIT");
		
		
      sc.close();
	}
	

}
