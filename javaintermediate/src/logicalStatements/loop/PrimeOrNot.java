package logicalStatements.loop;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter a Number:-");
		 int n= sc.nextInt();
	
			  if (isprime(n)) {
				  System.out.print("Prime Number");
			 }
			  else {
				  System.out.println("Not a Prime Number");
			  }
			sc.close();
			 }

	static boolean isprime(int n) {
		boolean status = true;
		if(n==0 ||n ==1) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n % i==0) {
				return false;
			}
		}
		
		return status;
		
	}
}
	

