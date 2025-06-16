package collection_program;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Program1 {

	/**
	 * Iterable -i
	 *  |   extends
	 *  |
	 * Collection --i 
	 *  | extends
	 *  |
	 * List --i         List            List
	 *  | implements     |               |
	 *  |                |               |
	 * ArrayList --c    LinkedList--c   Vector-c
	 *
	 */
	public static void main(String[] args) {
		List<Character> l=new ArrayList<Character>();
//		List<Character>l=new LinkedList<Character>();
//		List<Character>l=new Vector<Character>();
	
//		 inheriting methods from Collection interface
//		l.add(null)
//		l.addAll(l)
//		l.remove(0);
//		l.removeAll(l)
//		l.contains(l)
//		l.containsAll(l)
//		l.clear();
//		l.size();
//		l.equals(l)
//		l.toString();
//		l.retainAll(l)
//		l.removeIf(null)
		
		
		
		for(char c='A';c<='E';c++) {
			l.add(c);
		}
		
		System.out.println(l); //[A, B, C, D, E]-5
		l.add(4, 'F');
		System.out.println(l);//[A, B, C, D, F, E]-6
		l.add(6,'N');
		System.out.println(l);//[A, B, C, D, F, E, N]-7
//		l.add(8,'M');
//		System.out.println(l);//AIOBE
//		l.addLast('X');
//		l.addFirst('Z');  since 21 
		
		
//		l.remove(indexposition);
		l.removeFirst();
		l.removeLast();
		
		
		System.out.println(l.get(0));
//		System.out.println(l.get(11)); IOBE
//		System.out.println(l.getFirst());
//		System.out.println(l.getLast());
		
		l.add('A');
		System.out.println(l); //[A, B, C, D, F, E, N, A]
		System.out.println(l.indexOf('A'));
		System.out.println(l.lastIndexOf('A'));//7
		
//		l.reversed();
		
		
		l.set(0, 'Z'); // update
		System.out.println(l);
		
		System.out.println(l.subList(0, 5));//start-inclusive   end-exclusive
		
		
	}
}
