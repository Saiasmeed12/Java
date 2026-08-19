package arrays;

public class basicarray {

	public static void main(String[] args) {
      
		//declaration
		int []ages;
		
		//creation
		ages= new int[4];
		
	   //initialization
		 ages[0]=20;
		 ages[1]=21;
		 ages[2]=22;
		 ages[3]=23;

		
		
		 //representation
		 for(int i=0;i<ages.length;i++) {
			 System.out.println("The Ages are:-"+ages[i]);
		 }
		
	}

}
