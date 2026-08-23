package arrays;

public class MissingNumberSumFormula {

	public static void main(String[] args) {

		int[]arr= {1,2,4,5,6};
		
		int n= arr.length+1;
		int exceptedvalue=n *(n+1)/2;
		int actualvalue=0;
		int missingnumber=0;

		for(int i=0;i< arr.length;i++) {
			actualvalue=actualvalue+arr[i];
		}
		missingnumber= exceptedvalue-actualvalue;
		System.out.println("The Missing Number is:- "+missingnumber);

		
	}

}
