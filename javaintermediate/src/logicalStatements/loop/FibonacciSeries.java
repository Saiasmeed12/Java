package logicalStatements.loop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number:-");
        int n=sc.nextInt();
        int n1=fibo(n);
        System.out.println("Sum of previous two numbers:-"+n1);
        sc.close();

	}
	static int fibo(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return fibo(n-1)+ fibo(n-2);
	}

}
