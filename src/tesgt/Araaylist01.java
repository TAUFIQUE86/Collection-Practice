package tesgt;

import java.util.ArrayList;

public class Araaylist01 {

	public static void main(String[] args) {

		ArrayList b = new ArrayList();
		b.add(23);
		b.add(27);
		b.add(29);
		b.add(31);
		b.add(33);
		b.add(37);
		System.out.println(b.remove(0));
		System.out.println(b.contains(23));
      System.out.println(b.indexOf(27));
		System.out.println(b);
		System.out.println( b.isEmpty());
		
//		System.err.println(b.get(3));
		
		System.out.println(b.get(3));
		
		System.out.println();
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
        a.add(null);
		a.add(23);
		a.add(60);
		a.addAll(b);
		a.add(2, 27);
		
//		
		
		a.set(3, 105);
		
		
		a.removeAll(a);
		System.out.println("This is retaiin ");

		a.retainAll(b);
		a.trimToSize();
		System.out.println(a);

	}

}
