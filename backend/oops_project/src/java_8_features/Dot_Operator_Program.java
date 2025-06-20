package java_8_features;

import java.util.ArrayList;
import java.util.List;

public class Dot_Operator_Program {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("White");
		list.add("Green");
		list.add("Blue");
//		 lambda expression
		list.stream().forEach(a->System.out.println(a));
//		method reference
		list.stream().forEach(System.out::println);
	}
}
