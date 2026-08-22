package arrays;

//Print array elements at even and odd indices.
public class EvenIndices {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50,60};
		for(int i=0;i< arr.length;i++) {
			if(i % 2==0) {
				System.out.println("Even Indices:-"+arr[i]);
			}
			else {
				System.out.println("Odd Indices:-"+arr[i]);
			}
		}
		
	}

}
