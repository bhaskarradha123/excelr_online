package java_8_features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Program4 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>
		(Arrays.asList(20,12,34,25,56,78,89,34,25,20));
		System.out.println(list);
		
		list.stream()
		.distinct()
		.sorted()
		.forEach((a)->System.out.print(a+","));
		
		
	}
}
