package arrays;

//move zeroes at end without order preserving #1 NOT SO OPTIMAL .


public class ZeroesEndTwoPointers {

	
	public static void main(String[] args) {

		int arr[]= {1,0,2,0,0,4,5,6};
		int lastindex=arr.length-1;
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				temp=arr[i];
				arr[i]=arr[lastindex];
				arr[lastindex]=temp;
				lastindex--;
				
			}
			if(arr[i]==arr[lastindex]) {
				break;
			}
		}
	
		for(int a:arr) {
			System.out.print(a+" ");
		}

}
	}		
		
