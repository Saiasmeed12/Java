package logicalStatements.loop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		int n=sc.nextInt();
		
		int rev=0;
		int r=0;
		while(n>0) {
			r=n%10;  //123%10 ->3  12%10-> 2    1%10-> 1
			n=n/10;  // 123/10->12  12/10 -> 1  1/10-> 0(exit loop)
			rev=rev*10+r;  // =0*10+3 -->3(firstly) = 3*10+2;-->32 , 32*10+1 -->321
	
			
		}
		System.out.println("The Reverse Number is:- "+rev);
		sc.close();
	}

}
