package logicalStatements.loop;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		int n=sc.nextInt();
		
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;  //123%10 ->3  12%10-> 2    1%10-> 1
			n=n/10;  // 123/10->12  12/10 -> 1  1/10-> 0(exit loop)
			sum=sum+r; // 0+3 ->3 3+2 -->5 5+1-->6.
	
			
		}
		System.out.println("The Sum of Digits is:- "+sum);
		sc.close();
	}

}
