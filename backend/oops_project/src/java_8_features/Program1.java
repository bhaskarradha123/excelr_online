package java_8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 1-10 -- find even numbers
 *      -- square of even numbers
 *      -- stored in another collection -out
 * 
 * 1  2  3  4  5  6  7  8   9  10  --input
 *    
 *    2     4     6     8       10 -- filter() --intermediate func
 *    
 *    4     16    36   64       100-- map() --intermediate 
 *    
 *    storing ---collect terminal func
 * 
 * 
 * */
public class Program1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			list.add(i);
		System.out.println(list);
		
		List<Integer> out = list.stream() // list converting into stream
				            .filter((a) -> a % 2 == 0) //filtering
				            .map((a) -> a * a)//processing /mapping
				            .collect(Collectors.toList());//collecting into list
		System.out.println(out);

	}
}
