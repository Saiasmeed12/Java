package logicalStatements.loop;

import java.util.Scanner;

//factorial 5! = 5*4*3*2*1 = 120
public class FactorialLoops {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Factorial Number:-");
        int n=sc.nextInt();
        
        int n1= findfactorial(n);
        System.out.println("The Factorial of Given Number is:-"+n1);
	 
	    sc.close();
	}
	
	static int findfactorial(int n) {
		int fact =1;
		for(int i=n;i>=1;i--) {
			fact= i *fact;                    
			
		}
		return fact;
			
		
		
	}

	}


