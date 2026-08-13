package logicalStatements.loop;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		int n=sc.nextInt();
		 int flag=por(n);
		 if(n==flag) {
			 System.out.println("Palindrome Number");
			 }
		 else {
			 System.out.println("Not a Palindrome Number");
		 }
		 sc.close();
	}
		
	static int por(int n) {
   
		int rev=0;
		int rem=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
			
		}
		return rev;
       
	}

}
