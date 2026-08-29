package arrays;

import java.util.Arrays;

public class DuplicateElementsOptimal {

	public static void main(String[] args) {

		int[] arr= {1,2,1,3,3};
		
		Arrays.sort(arr);
		
		int i=0;
		int j=1;
		
		while(j<arr.length) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
			}
			i++;
			j++;
		}
	
		
		
		
		
		
		
		
		
		
		
	}

}
