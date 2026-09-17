package exceptionHandling;

//NULL POINTER EXCEPTION
public class ExceptionHandling02 {


	public static void main(String[] args) {


		
		String str="Sai Asmeed";
		System.out.println(str.length());
		
		String str2="null";
		System.out.println(str2.length());
		
		
				
		String str3="";
		System.out.println(str3.length());
		
		String str4=null;
		try{
			System.out.println(str4.length());
		}
		catch(NullPointerException e){
			e.printStackTrace();
			
		}
		
		
		System.out.println("Main Method Ended");
		
	}

}
