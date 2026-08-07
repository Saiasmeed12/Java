package logicalStatements;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Welcome, know your digits");
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Enter you Number:-");
		int num=sc.nextInt();
		
	
		if(num >=10 && num<=99) {
			System.out.println("You Entered Two Digit Number");
		}
		 if(num>=100 && num<=999) {
			System.out.println("You Entered Three Digit Number");
		}
		 
		 if(num>999) {
			 System.out.println("You Entered More Than Three Digits ");
		 }
		else {
			
			System.out.println("You Entered Less Than 2 Digits");
			
		}
		
		sc.close();
		

	}//main

}//class

/**Java
Question:
1.Write a Java program to check whether a given number is a two-digit, three-digit, or more than three digits using if-else if statements.
1.The program should:
Accept an integer as input.
Display:
2.Two-Digit Number if the number has 2 digits.
3.Three-Digit Number if the number has 3 digits.
4.More Than Three Digits if the number has more than 3 digits.
5.Less Than Two Digits if the number has only 1 digit.  **/