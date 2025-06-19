package java_8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Program2 {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Kiwi");
		list.add("Grapes");

		Map<String, Integer> map = list.stream()
		.collect(Collectors.toMap(fruit->fruit, fruit->fruit.length()));
	    
		System.out.println(map);
	}
}
//{Apple=5,Banana=6,Kiwi=4,Grapes=6}