package arrays;

import java.util.Arrays;

public class MergeTwoArraysBascisFinal2 {

	public static void main(String[] args) {

		int[]s1= {2,3,4,5,1};
		int[]s2= {4,3,2,1,1,5,7};
		int len=0;
		
		if(s1.length > s2.length) {
			len=s1.length; //len=5
		}
		else {
			len=s2.length; //len=7
		}
		
		int [] s= new int[len];
		
		for(int i=0;i<len;i++) { //len=7
			if(s1.length<=i) {
				s[i]=s2[i];
			}
			else if(s2.length<=i) {
				s[i]=s1[i];
			}
			else {
				s[i]=s1[i]+s2[i];
			}
			
		}
		
		System.out.println(Arrays.toString(s));
		
		
		
	}//public

}//main
