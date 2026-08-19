package arrays;

import java.util.Scanner;

//Find the frequency of a given element.
public class FrequencyElement {

	public static void main(String[] args) {

		int[]arr= {1,1,1,2,2,3};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n=sc.nextInt();
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				count++;
			}
		}
		
		System.out.println(" The Count of "+n+" is:- "+count);
		sc.close();
	}

}
