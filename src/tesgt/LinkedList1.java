package tesgt;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		 LinkedList l = new LinkedList();
		l.add(10);
		l.add(30);
		l.add(40);
		l.add(90);
		l.addFirst(07);
		l.addLast(100);
		System.out.println(l.getLast());
		System.out.println(l.removeFirst());
	  System.out.println(l.offer(20));
		
		System.out.println(l);
		
		

	}

}
