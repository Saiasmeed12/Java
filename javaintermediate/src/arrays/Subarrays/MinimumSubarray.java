package arrays.Subarrays;

public class MinimumSubarray {

	public static void main(String[] args) {
		
		int[]arr= {3,-4,5,4,-1,7,-8};
		
		int currentsum=0;
		int minsum=0;
		
		for(int i=0;i<arr.length;i++) {
			currentsum+=arr[i];
			minsum=Math.min(minsum,currentsum);
			
			if(currentsum>0) {
				currentsum=0;
			}
		}
		
		System.out.println("Minimum Subarray Sum is:- "+minsum);
	}

}
