package collection_program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Program2 {

	public static void main(String[] args) {
		Set<String>set1=new HashSet<String>();
		set1.add("Orange");
		set1.add("Apple");
		set1.add("Banana");
		set1.add("Grapes");
		set1.add("Kiwi");
		set1.add("Guava");
		set1.add(null);
		System.out.println(set1);
		
		
		Set<String>set2=new LinkedHashSet<String>();
		set2.add("Orange");
		set2.add("Apple");
		set2.add("Banana");
		set2.add("Grapes");
		set2.add("Kiwi");
		set2.add("Guava");
		set2.add(null);
		System.out.println(set2);
		
		
		Set<String>set3=new TreeSet<String>();
		set3.add("Orange");
		set3.add("Apple");
		set3.add("Banana");
		set3.add("Grapes");
		set3.add("Kiwi");
		set3.add("Guava");
//		set3.add(null);
		System.out.println(set3);
	}
}
