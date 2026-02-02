package tesgt;

import java.util.ArrayList;
import java.util.List;

public class array3con {
	public static void main(String[] args) {
		List<String> tech1 =  List.of("Java", "Spring", "AWS");
		  List<Integer> tech2 = List.of(10,20,39,39);
		  
		  ArrayList<Object> arrayList1 = new ArrayList<>(tech1);
		  ArrayList<Object> arrayList2 = new ArrayList<>(tech2);
		  
		  arrayList1.add(arrayList2);
		  System.out.println(arrayList1);
		  
		  
		  
		  
		  
	}

}
