package logicalStatements.loop;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter a number to stop:-");
	 int n= sc.nextInt();
	 
	 for(int i=1;i<=n;i++) {
	  if (isprime(i)) {
		  System.out.print(i+" ");
	 }
	 // else {
		//  System.out.println("No Prime Numbers");
	  //}
	  
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
