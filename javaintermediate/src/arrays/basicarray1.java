package arrays;

public class basicarray1 {

	public static void main(String[] args) {
		
		int[] cars;
		cars=new int[10];
		
		cars[0]=1998;
		cars[1]=2003;
		cars[2]=2016;
		cars[3]=2056;
		cars[4]=2099;
		
		for(int i=0;i< cars.length;i++) {
			if(cars[i] >= 2056) {
				System.out.println(cars[i]);
			}
		}

	}

}
