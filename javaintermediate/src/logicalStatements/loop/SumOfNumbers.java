package logicalStatements.loop;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n value ");
		int n=sc.nextInt();
		
		 int n1=sumnumbers(n);
		 System.out.println(n1);
		sc.close();
	}
    static int sumnumbers(int n) {
    	int sum=0;
        for(int i=1;i<=n;i++) {         
			sum=sum+i;
		}
		return sum;
      
  
    	
    }
}

/** 2.write a java program to Find the sum of numbers from 1 to 100.Output: 5050 **/