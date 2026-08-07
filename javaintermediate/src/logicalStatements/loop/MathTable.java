package logicalStatements.loop;

import java.util.Scanner;

public class MathTable {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Table Number:-");
        int n=sc.nextInt();
        System.out.print("Enter N2 Value :-");
        int n2=sc.nextInt();
        
        for(int i=1;i<=n2;i++) {
        	System.out.println(n+ " X "+ i+ "="+ (n*i));
        }
        sc.close();

	}

}
