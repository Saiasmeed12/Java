package arrays;

public class SecondLargestElement {

	public static void main(String[] args) {

		int[]n = {20,14,2,67,23};
		
		int highest=n[0];
		int Shighest=n[0];
		for(int i=0;i<n.length;i++) {
			if(highest < n[i]) {
				Shighest=highest;
				highest=n[i];
			}
			else if(n[i]> Shighest){
				
				Shighest=n[i];
				
			}
		}
		System.out.println("The Second Highest Number is:- "+Shighest);
	}

}
