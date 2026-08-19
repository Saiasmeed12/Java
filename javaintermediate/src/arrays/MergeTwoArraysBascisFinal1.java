package arrays;

import java.util.Arrays;

public class MergeTwoArraysBascisFinal1 {

	public static void main(String[] args) {

		int []a= {4,3,2,1,0,9};
		int []b= {4,5,6,7,8};
		int len=0;
		
		if(a.length >b.length) {
			len=a.length;
			}
		else {
			len=b.length;
		}
		
		int[] c =new int[len];
		for(int i=0;i<len;i++) {
			if(a.length<=i) {
				c[i]=b[i];
			}
			else if(b.length<=i) {
				c[i]=a[i];	
			}
			else
			{
				c[i]= a[i]+b[i];
			}
		}
		System.out.println(Arrays.toString(c));
		
}
}
