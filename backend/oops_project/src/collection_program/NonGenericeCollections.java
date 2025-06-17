package collection_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NonGenericeCollections {

	public static void main(String[] args) {
		
		List list=new ArrayList();//non generic
		list.add(10);
		list.add("demo");
		list.add(7899998765l);
		
		for(Object o:list) {
//			 DownCasting /narrow casting/non primitive casting
			Integer i=(Integer)o; //RTE 
			System.out.println(i);
		}
	}
}
