package arrays;

import java.util.Arrays;

public class MergeTwoArraysBascis {

	public static void main(String[] args) {

		int []m1= {1,2,3};
		int []m2= {4,5,6};
		int []m3= new int[m1.length + m2.length];
		
		for(int i=0;i<m1.length;i++) {
			m3[i]=m1[i];
		}
		
		for(int i=0;i< m2.length;i++) {
			m3[m1.length+i]=m2[i]; // Add m2 members after m1.length+i(here +i means add the m2 value in index after
		}                          //m1.length ends so m1.length is 3 , 3+i(i value in first iteration is i=0 so 
		                           // the value of m2 will be placed at 3index.
		System.out.println(Arrays.toString(m3));
		
		
		}//public
	}//main


