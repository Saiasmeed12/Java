package logicalStatements.loop;

import java.util.Scanner;

public class CountEvenOrOddDigits {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        int n=sc.nextInt();
      
        int flag=ERO(n); //1 2 3 4 5 6
        if(flag %2==0) {
        	System.out.println("Even Digits:-"+flag);
        }
        else {
        	System.out.println("Odd Digits:-"+flag);
        }
        sc.close();
	}
	
	static int ERO(int n) {
		int count=0;
		int r=0;
		while(n>0) {
			r=n%10;  //123 %10 ->3
			n=n/10;  //123 /10 ->12 
			r=count++; // 1 2 3
			
			
		}
		return count;
		
	}

}

/**Count the number of even and odd digits in a number.
Example: 123456 → Even = 3, Odd = 3 **/