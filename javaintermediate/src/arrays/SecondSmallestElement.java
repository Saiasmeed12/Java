package arrays;

public class SecondSmallestElement {

	public static void main(String[] args) {

		int[]s= {29,1,5,89,4,49};
		int Smallest=s[0];
		int SecondSmallest=s[0];
		
		for(int i=0; i<s.length;i++) {
			if(Smallest>s[i]) {
				SecondSmallest=Smallest;
				Smallest=s[i];
			}
			else if(SecondSmallest > s[i]){
				SecondSmallest=s[i];
			}
		}
		System.out.println("The Second Smallest Element is:- "+SecondSmallest);
	}

}
