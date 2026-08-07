package logicalStatements.loop;

import java.util.Scanner;

public class Factors {
// 4-- 1,2,4
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n=sc.nextInt();
        for(int i=1;i<=n/2;i++) {
        	if(n% i == 0) {
        		System.out.print("Factors are:-"+i+" ");
        	}
        }
		sc.close();
	}

}
