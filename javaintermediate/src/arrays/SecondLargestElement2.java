package arrays;

public class SecondLargestElement2 {

	public static void main(String[] args) {

		int []arr= {22,24,29,81,76};
		int highest=arr[0];
		int Shighest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>highest) {
				Shighest=highest;
				highest=arr[i];
			}
			else if(arr[i]>Shighest) {
				Shighest=arr[i];
			}
		}
		System.out.println("The Second Highest Number is:-"+Shighest);
	}

}
