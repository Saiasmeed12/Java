package logicalStatements.loop;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter Factorial Number:-");
        int n=sc.nextInt();
      int n1= recursion(n);
      System.out.println("The Factorial Of Number is:-" +n1);

        sc.close();
	}
	
	static int recursion(int n) {
		if(n==0 || n==1)
		{
			return 1;
		}
		
		return n*recursion(n-1);	
	
	}
}
