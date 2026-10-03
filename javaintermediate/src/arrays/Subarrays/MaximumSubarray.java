package arrays.Subarrays;

public class MaximumSubarray {

	public static void main(String[] args) {

		int[]arr= {3,-4,5,4,-1,7,-8};
		
		int currentsum=0;
		int maxsum=0;
		
		for(int i=0;i<arr.length;i++) {
			currentsum+=arr[i];
			maxsum=Math.max(maxsum, currentsum);
			
			if(currentsum < 0) {
				currentsum=0;
			}
		}
	   System.out.println(maxsum);
		
	}
	 

}
