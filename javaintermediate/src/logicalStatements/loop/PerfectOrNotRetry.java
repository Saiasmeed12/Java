package logicalStatements.loop;

import java.util.Scanner;

public class PerfectOrNotRetry {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Perfect Number:-");
        int n=sc.nextInt();
         boolean status =perfect(n);
         
         if(status) {
        	 System.out.println("Perfect Number");
         }
         else {
        	 System.out.println("Not a Perfect Number");
         }
        sc.close();
        
	}
	static boolean perfect(int n) {
		boolean e =false;
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n %i ==0) {
				sum=sum+i;
			}
		}
		
		if(sum==n) {
		   e=true;
		}
		
		return e;
		
	}

}
