package logicalStatements.loop;

import java.util.Scanner;

public class PerfectOrNot {
    
//	1,2,3,6 --> 1+2+3 =6
	public void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number:-");
        int n=sc.nextInt();
       boolean status= pn(n);
       
       if(status) {
    	   System.out.println("Perfect Number");
       }
       else {
    	   System.out.println("Not a Perfect Number");
       }
        
       sc.close();

	}
	
	static boolean pn(int n) {
	int sum=0;
	boolean flag=false;
	for(int i=1;i<=n/2;i++) {
	    if(n% i == 0) 
	    {
	     sum=sum+i;}
	}
	if(sum==n) 
	     {flag =true;}
	        	
		return flag;
		
		
		 }
	}


		
	
	 
		
	


