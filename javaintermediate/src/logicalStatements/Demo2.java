package logicalStatements;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String y;
		do {
		System.out.println("Enter A value :-");
		int a=sc.nextInt();
		
		System.out.println("Enter B value :-");
		int b=sc.nextInt();
		
		
		System.out.println("Enter the Symbol:-");
		String s= sc.next();
			
		switch(s) {
		case "+" -> System.out.println(a+b);
		case "-" -> System.out.println(a-b);
		case "*" -> System.out.println(a*b);
		case "%" -> System.out.println(a%b);
		default ->System.out.println("Unknown operation");
			
		}//switch
		System.out.println("Do you wanna Continue? Y/N");
		 y = sc.next();
		}//do
         while(y.equalsIgnoreCase("Y"));
		 System.out.println("EXIT");
		 
		 sc.close();
	}

}
