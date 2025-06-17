package collection_program;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_Program5 {

	public static void main(String[] args) {
		
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.ensureCapacity(10);
		System.out.println(al);
		
		LinkedList<Integer>li=new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.addFirst(40);
		System.out.println(li);
//		li.ensure
	}
}
