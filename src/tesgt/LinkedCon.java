package tesgt;

import java.util.LinkedList;
import java.util.List;

public class LinkedCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> tech1 =  List.of("Java", "Spring", "AWS");
		  List<Integer> tech2 = List.of(10,20,39,39);
		  
		 LinkedList<Object> linkedList1 = new LinkedList<>(tech1);
		  
		 LinkedList<Object> linkedList2 = new LinkedList<>(tech2);
		 
		 linkedList1.add(linkedList2);
		 System.out.println(linkedList1);
		 
		 

	}

}
