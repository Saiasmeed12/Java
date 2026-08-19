package arrays;

public class basicarray2 {

	public static void main(String[] args) {
		
		int[] ac;
		ac=new int[10];
		
		ac[0]=18;
		ac[1]=17;
		ac[2]=22;
		ac[3]=77;
		ac[4]=101;
		ac[5]=220;
		
		
		for(int i=0;i< ac.length;i++) {
			if( ac[i] > 18 && ac[i]<= 100) {
				System.out.println("Eligible:-"+ac[i]);
				
			}
			else if( ac[i] > 100 && ac[i]<=150) {
				System.out.println("Bro apply for ac(Aadhar card):-"+ac[i]);
			}
			else if(ac[i] >200) {
				System.out.println("Bro seriously!!!!"+ac[i]);
			}
			
			else {
				System.out.println("Not Eligible"+ac[i]);
			}
		
	}
		

}
}
