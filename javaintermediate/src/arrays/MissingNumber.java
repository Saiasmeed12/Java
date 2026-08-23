package arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int[]arr= {1,3,4,4,10,15};
		for(int i=0;i< arr.length-1;i++){
			int start=arr[i];
			int end=arr[i+1];
			if(start==end) {
				continue;
			}
			for(int j=start+1;j<end;j++) {
				System.out.print(j+" ");
			}
			
		}
		
		
	}

}

