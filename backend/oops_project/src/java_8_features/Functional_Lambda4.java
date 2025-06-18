package java_8_features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Functional_Lambda4 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Bob");
		list.add("Alice");
		list.add("Jullie");
		System.out.println(list);
		
		
		Comparator<String>c=( a, b)->a.compareTo(b);
		Collections.sort(list, c);
		
		System.out.println(list);
	}
}
