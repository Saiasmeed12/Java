package arrays;

public class basicarraydouble {

	public static void main(String[] args) {
		
		double [] height;
		
		height= new double[10];
		
		height[0]=122.5;
		height[1]=134.5;
		height[2]=154;
		height[3]=165.4;
		height[4]=177.5;
		height[5]=180;
		height[6]=157;
		height[7]=158.8;

		
		for(int i=0;i < height.length;i++) {
			if(height[i] >165){
			System.out.println("Eligible for Army:- "+height[i]);
			}
			else if(height[i]<= 160 && height[i] >= 155) {
				System.out.println("Eligible for Special Quota:-"+height[i]);
			}
			else {
				System.out.println("Not Eligible for Army:-"+height[i]);
			}
	}
	}
}
