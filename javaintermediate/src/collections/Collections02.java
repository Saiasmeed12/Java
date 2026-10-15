package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections02 {

	public static void main(String[] args) {
		
		Collection<Object> c1= new ArrayList<>();
		c1.add(10);
		c1.add(30);
		c1.add(20);
		System.out.println(c1.hashCode()); //Hashcode calculation-> 31 * 1 * 10; // 1 is default hascode value;
	//	System.out.println(c1);                                  //default value *current hashcode value*element value;
		
		
		Collection<Object> c2= new ArrayList<>();
		c2.add(10);
		c2.add(20);
		c2.add(30);
		
		System.out.println(c2.hashCode());  
	//	System.out.println(c2);
		
		
		
		System.out.println(c1.equals(c2));
		
		
	}

}
