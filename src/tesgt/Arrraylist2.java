package tesgt;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arrraylist2 {

	public static void main(String[] args) {

		ArrayList<Integer> n = new ArrayList();

		n.add(10);
		n.add(12);
		n.add(13);
		n.add(15);
		n.add(16);
		n.add(null);
		
		// Traverse the ArrayList 

//	for (int i = 0; i < n.size(); i++) {
//		System.out.println(n.get(i));
//		
//	}

//	for (Object object : n) {
//		System.out.println(object);
//	}

//    Iterator<Integer> it = n.iterator();
//    while(it.hasNext()) {
//    	System.out.println(it.next());
//    	
//    	
//    }

		ListIterator<Integer> li = n.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		
		System.out.println("This is list iterator ");
		
		ListIterator<Integer> lt = n.listIterator(n.size());
		while (lt.hasPrevious()) {
			System.out.println(lt.previous());
		}

		
		
	}

}
