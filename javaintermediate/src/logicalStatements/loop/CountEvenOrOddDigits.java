package logicalStatements.loop;

import java.util.Scanner;

public class CountEvenOrOddDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		int n=sc.nextInt();
		 eord(n);
		 
		 sc.close();
	}
	
		
	static void eord(int n) {
   
		int evencount=0;
		int oddcount=0;
		int r=0;
		while(n>0) {
			r=n%10;  //123 %10 ->3
			n=n/10;  //123 /10 ->12 
			
		if(r%2==0) { 
			evencount++;
		}
		else {
			oddcount++;
		}
			
		}
		System.out.println("Even Digits Are :-"+evencount);
		System.out.println("Odd Digits Are:-"+oddcount);
       
	}

}

/**Count the number of even and odd digits in a number.
Example: 123456 → Even = 3, Odd = 3 **/