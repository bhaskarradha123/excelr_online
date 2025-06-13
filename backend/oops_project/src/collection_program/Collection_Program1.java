package collection_program;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Collection_Program1 {

	/**
	 * Iterable -i
	 *  |   extends
	 *  |
	 * Collection --i 
	 *  | extends
	 *  |
	 * List --i 
	 *  | implements
	 *  |
	 * ArrayList --c
	 *
	 */
	public static void main(String[] args) {

//		Collection<int>c;
//       upCasting/implicit casting/autoCasting/Non primitive typeCasting
		Collection<Integer> c = new ArrayList<Integer>();
//		c.add(10);
//		c.add("demo");
//		c.add(20);

		for (int i = 11; i <= 20; i++)
			c.add(i); // adding element into collection
		
		System.out.println(c);
		System.out.println("the size of collection is "+c.size());
		
		boolean remove = c.remove(18);
		System.out.println(remove); //deleting element
		System.out.println(c);
		System.out.println("the size of collection is "+c.size());
		
		
		boolean contain = c.contains(11); // used to check 
		System.out.println(contain);
		
		System.out.println(c+" before clearing");
		c.clear();
		System.out.println(c+" after clearing");
		
		boolean check = c.isEmpty();
		System.out.println(check);
		

	}

}
