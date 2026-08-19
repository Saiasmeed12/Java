package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScannerBasics {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of Number:-");
		int size=sc.nextInt();
		
		int[] numbers= new int[5];
		
		System.out.println("Enter your Numbers:-");
		for(int i=0;i< size; i++) {
			numbers[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers));
	
		for(int i=0;i<size;i++) {
			if(numbers[i] % 2==0) {
				System.out.println("The Even Number is:- "+numbers[i]);
			}
			else {
				System.out.println("The Odd Number is:- "+numbers[i]);
			}
		}
	}

}
