package arrays;

//move zeroes at end without order preserving.

public class ZeroesEndTwoPointersV2 {

	public static void main(String[] args) {
		
		int arr[]= {1,0,2,0,0,4,5,6};
		int i=arr[0];
		int lastindex=arr.length-1;
		int temp;
		
		while(i<lastindex) {
			if(arr[i]==0) {
				temp=arr[i];
				arr[i]=arr[lastindex];
				arr[lastindex]=temp;
				lastindex--;
				
			}
			else {
				i++;
			}
			
		}
		for(int a:arr) {
			System.out.print(a+" ");
		}
		
	}

}
