package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsList01 {

	public static void main(String[] args) {
		
		List<Integer> l1= new ArrayList<>();
		
		l1.add(10);
		l1.add(20);
		l1.add(1,30);
		l1.add(2,40);
		l1.add(0,50);
		l1.add(3,60);
	//	l1.add(9,100); //IndexOutOfBoundsException
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
		
	}

}
