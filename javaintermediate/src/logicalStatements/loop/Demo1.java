package logicalStatements.loop;

import java.util.Scanner;

public class Demo1 {
	
	static void Multiple(int num) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Table Number:-");
		int num=sc.nextInt();
		Multiple(num);

		sc.close();
	}

}

/**Today Task 
Java
1.Print the Multiplication Table of a Number
Question:
Write a Java program to print the multiplication table of a given number from 1 to 10.
**/