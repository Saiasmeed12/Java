package arrays;
import java.util.Scanner;

public class GradeCalculatorScanner {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size:-");
		int size=sc.nextInt();
		
		int[] numbers=new int[5];
		
		for(int i=0;i<size;i++) {
	      numbers[i]=sc.nextInt();
		}
		
		int total_marks=0;
		int avg=0;
		int min=numbers[0];
		int max=numbers[0];
		for(int g:numbers) {
			if(min>g) {
				min=g;
			}
			if(max<g) {
				max=g;
			}
			total_marks=total_marks+g;
			
		}
		System.out.println("The Total Marks Are:- "+total_marks);
		System.out.println("The Maximum Marks Are:-"+max);
		System.out.println("The Minimum Marks Are:-"+min);
		
		avg=total_marks/numbers.length;
		System.out.println("The Avg Marks Are:-"+avg);
	}//public

}//class
