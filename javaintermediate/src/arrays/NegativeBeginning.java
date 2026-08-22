package arrays;

//Move all negative numbers to the beginning without two pointers.
public class NegativeBeginning {

	public static void main(String[] args) {

		int[]arr= {1,-2,3,-4,5,-6};
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				for(int j=i;j>0;j--) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
	}
			
	}
}



