package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections01 {

	public static void main(String[] args) {
		
		Collection<Object> c = new ArrayList<>();   //auto-boxing Integer<->hello
//		Collection<String> c = new ArrayList<>();
		
		c.add(100);
		c.add(200);
		c.add(300);
		c.add(400);
		
		
		Collection<String> n = new ArrayList<>();
		
		n.add("A");
		n.add("B");
		n.add("C");
		n.add("D");
		n.add("E");
		
		Collection<Object> adding= new ArrayList<>();
		
		adding.addAll(c);
		adding.addAll(n);
		
		adding.remove(100);
		adding.removeAll(c);
		
		System.out.println(adding.contains("G"));
		System.out.println(adding.containsAll(n));
		
		System.out.println(adding);
		
	}

}
