package arrays;

public class ZeroesEndTwoPointersV3Final {

	public static void main(String[] args) {

		int arr[]= {1,0,2,0,3,0};
		int index=0;
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
				index++;
			}
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
