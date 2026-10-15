package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Collections03 {

	public static void main(String[] args) {


		Collection<String> fruits= new ArrayList<>();
		
		fruits.add("BANANA1");
		fruits.add("BANANA2");
		
		if(fruits.isEmpty()) {
			fruits.add("ORANGE1");
			fruits.add("ORANGE2");
			fruits.add("ORANGE3");
			fruits.add("ORANGE4");
			
		}
		System.out.println(fruits);
		System.out.println(fruits.size());
		
		//converting collections to array
		
		Object[] objArr= fruits.toArray();
		
		for(Object obj:objArr) {
			System.out.println(obj);
		}
		

		//converting array to Collections
		String[] array = {"Apple", "Banana", "Cherry"};
		List<String> list = Arrays.asList(array);
		
		System.out.println(list);
		
	}

}
