package arrays.Rotation;

//Rotate an array using the reversal algorithm.

public class ReversalAlgorithm {
	
	static void reverse(int []arr, int start,int end) {
		
		while(start<end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		start++;
		end--;
	}
	}
	
	static void rotate(int[]arr,int k) {
		k=k%arr.length;
		
		if(k<0) {
			k=k+arr.length;
		}
		
		reverse(arr, 0, k-1);
		reverse(arr,k,arr.length-1);           // FOR LEFT ROTATE REVERSAL
		reverse(arr,0,arr.length-1);
		
		
//	    reverse(arr,0,arr.length-1);
//	    reverse(arr, 0, k-1);              FOR RIGHT ROTATE REVERSAL
//	    reverse(arr,k,arr.length-1);

	}

	public static void main(String[] args) {

		int[]arr= {1,2,3,4,5};
		
		System.out.println("Orginal Array:- ");
		for(int a:arr ) {
			System.out.print(a+" ");
		}
		
		System.out.println( );
		
		rotate(arr,-1);
		
		System.out.println("Reversal Array:- ");
		for(int a:arr ) {
			System.out.print(a+" ");
		}
	}
	
	

}
