package exceptionHandling;

public class ExceptionHandling03 {

	public static void main(String[] args) {

		System.out.println("Main Method Started!!");
		int[]arr= new int[2]; 
		
		try {
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		}
			
		
		catch(Exception e) {
			System.out.println("E");
			e.printStackTrace();
		}

		
//		catch(ArrayIndexOutOfBoundsException e) {  //Unreachable catch block for ArrayIndexOutOfBoundsException. 
//												  //It is already handled by the catch block for Exception
//			System.out.println("AIOBE");
//			e.printStackTrace();
//		}
		
				
		
		for(int i=0;i< arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println("Main Method Ended!!");
	}

}
