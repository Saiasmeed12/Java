package arrays;

class GradeCalculator {

	public static void main(String[] args) {

		int[] grade= {92,47,86,89,73,56,67};
		
		int total_marks=0;
		int avg=0;
		int min=grade[0];
		int max=grade[0];
		for(int g:grade) {
			if(min>g)
			{
				min=g;
			}
			else if(max<g) {
				max=g;
			}
			
			total_marks=total_marks+g;
		}
		System.out.println("Total Acummulated Marks are:-"+total_marks);
		System.out.println("The Mininum Value is:-"+min);
		System.out.println("The Maximum Value is:-"+max);

		
		avg=total_marks/grade.length;
		System.out.println("Average Score Of Grade is:-"+avg);
		
	}

}
