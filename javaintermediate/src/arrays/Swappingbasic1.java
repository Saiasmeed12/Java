package arrays;

//Swap the first and last elements.

public class Swappingbasic1 {

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,40,50};
		
		int temp=0;
		for(int i=0; i< arr.length;i++) {
			temp=arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]= temp;
			System.out.println(arr[i]);
		}
		

	}
}

