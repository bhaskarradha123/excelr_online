package java_8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
//  predicate example
public class Functional_Interface4 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(3);
		list.add(4);
		list.add(15);
		
		System.out.println(list);
		Predicate<Integer>p=a->a%2==0;

		list.removeIf(p);//lambda expression
		System.out.println(list);
	}
}
