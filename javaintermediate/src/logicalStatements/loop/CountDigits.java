package logicalStatements.loop;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number:- ");
		int n=sc.nextInt();
		int flag= por(n);
		System.out.println("The Count of Digits are:-"+flag);
		 
		 sc.close();
	}
	
		
	static int por(int n) {
   

		int count=0;
		int r=0;
		while(n>0) {
			r=n%10;  //123 %10 ->3
			n=n/10;  //123 /10 ->12 
			count++;
            }
			
	   return count;
	}
	
}

