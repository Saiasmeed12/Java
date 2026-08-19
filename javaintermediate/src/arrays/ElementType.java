package arrays;
//Count positive, negative and zero elements.
public class ElementType {

	public static void main(String[] args) {
 
		int[]n= {2,-1,0,34,-2,56,0,0,-5};
		
		int Zerocount=0;
		int PositiveCount=0;
		int negativeCount=0;
		
		for(int i=0;i<n.length;i++) {
			if(n[i]==0) {
				Zerocount++;
			}
			else if(n[i]>0) {
				PositiveCount++;
			}
			else {
				negativeCount++;
			}
		}
		
		System.out.println("The Zero Count is:-"+Zerocount);
		System.out.println("The Positive Count is:-"+PositiveCount);
		System.out.println("The Negative Count is:-"+negativeCount);
	}

}
