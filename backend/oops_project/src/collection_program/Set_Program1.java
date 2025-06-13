package collection_program;

import java.util.HashSet;
import java.util.Set;

public class Set_Program1 {

	
	/**
	 * Iterable -i
	 *  |   extends
	 *  |
	 * Collection --i 
	 *  | extends
	 *  |
	 * Set -i           Set             Set
	 *  | implements     |               |
	 *  |                |               |
	 * HashSet --c    LinkedHashSet--c   TreeSet-c
	 *
	 */
	public static void main(String[] args) {
		
		Set<String>s=new HashSet<String>();
		s.add("ONE");
		s.add("TWO");
		s.add("THREE");
		s.add("ONE");
		System.out.println(s.size());//3
		System.out.println(s);//[ONE, TWO, THREE]
		s.remove("ONE");
		System.out.println(s);//[ TWO, THREE]
	}
}
