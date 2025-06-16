package collection_program;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class List_Program4 {

	public static void main(String[] args) {
		List<String>l=new  ArrayList<String>();
		l.add("Orange");  
		l.add("Yellow");
		l.add("Pink");
		l.add("Green");
		l.add("Blue");
		
		Spliterator<String> si = l.spliterator();
//		split into two 
		Spliterator<String> two = si.trySplit();
		
		System.out.println("----half----");
		si.forEachRemaining(a->System.out.println(a));
		System.out.println("----half----");
		two.forEachRemaining(a->System.out.println(a));


		
	}
}
