package collection_program;

import java.util.*; // importing all classes and interfaces from java.util
import java.util.function.IntFunction;

public class Collection_program2 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();
		System.out.println("size is " + c1.size() + "      empty:  " + c1.isEmpty());

		Collection<Integer> c2 = new ArrayList<Integer>();

		for (int i = 11; i <= 20; i++) {
			c1.add(i);
		}

		for (int i = 41; i <= 50; i++) {
			c2.add(i);
		}

		System.out.println("size of c1 : " + c1.size() + "  size of c2: " + c2.size());

		c1.addAll(c2);
		System.out.println("size of c1 : " + c1.size() + "  size of c2: " + c2.size());

		boolean contain = c1.containsAll(c2);
		System.out.println(contain);

		boolean remove = c1.removeAll(c2);
		System.out.println("size of c1 : " + c1.size() + "  size of c2: " + c2.size());

		boolean contain2 = c1.containsAll(c2);
		System.out.println(contain2);

		System.out.println(c1);
		
		c1.removeIf(a->a%2==0); // delete based on condition
		System.out.println(c1);
		
		
		Collection<Integer>c3=new ArrayList<Integer>();
		for(int i=11;i<=20;i++) {
			c3.add(i);
		}
		
		System.out.println(c3);
		
		boolean retain = c3.retainAll(c1); // store common elements and removes different element
		System.out.println(retain);
		System.out.println(c3);
		
		
		System.out.println(c1.equals(c3)); //compares two collections values
		System.out.println(c1.equals(c2));
		
		String s = c1.toString();// converts collection into string
		System.out.println(s);
		
		Object[] arr = c1.toArray();
		System.out.println(Arrays.toString(arr)+"converts to array type");

		
		

	}
}
