package collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionsList02 {

	public static void main(String[] args) {
		
		List<String> T1= new ArrayList<>();
		
		T1.add("Head");
		T1.add("Abhi");
		T1.add("Ishan");
		T1.add("Kateramma koduku");
		
		List<String> T2= new ArrayList<>();
		
		T2.add("Virat");
		T2.add("salt");
		T2.add("dev");
		T2.add("Kunal");
		
//		List<String> T12= new ArrayList<>();
		
//		T12.addAll(T1);
//		T12.addAll(T2);
		
	//	System.out.println(T12);
		
		
		List<String> T3= new ArrayList<>();
		
		T3.add("Ruthraj");
		T3.add("sanju");
		T3.add("dube");
		T3.add("noor");
		
		List<String> TT= new ArrayList<>();
		
		TT.addAll(T1);
		TT.addAll(T2);
		TT.addAll(4, T3);
		
		System.out.println(TT);
		
		
		
	}

}
