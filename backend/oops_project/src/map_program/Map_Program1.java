package map_program;

import java.util.HashMap;
import java.util.Map;

public class Map_Program1 {

	public static void main(String[] args) {
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
//		keys must be unique and values can be duplicate
		map.put(1, 101);
		map.put(1, 101);
		map.put(2, 101);

		System.out.println(map);
		
		map.putIfAbsent(2, 102);
		System.out.println(map);
		
		map.putIfAbsent(3, 103);
		System.out.println(map);
		
//		getting elements
		
		System.out.println(map.get(1));//101
		System.out.println(map.get(10));//null
		
		System.out.println(map.getOrDefault(1, 1001));//101
		System.out.println(map.getOrDefault(10, 1001));//1001
		
		
		System.out.println(map.containsKey(1));//true
		System.out.println(map.containsValue(101));//true
		
		map.remove(1);
		System.out.println(map);
		map.remove(2, 101);
		System.out.println(map);

		
	}
}
