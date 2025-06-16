package map_program;

import java.util.HashMap;
import java.util.Map;

public class Map_Program2 {

	public static void main(String[] args) {
		Map<Integer, String>map=new HashMap<Integer, String>();
		map.put(1, "Orange");
		map.put(2, "Blue");
		map.put(3, "Purple");
		map.put(4, "White");
		map.put(5, "Black");
		
		System.out.println(map);
		//replace
		map.replace(1, "Pink");
		System.out.println(map);
		
		map.replace(2, "Blue","Green");
		System.out.println(map);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.entrySet());
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key+" "+val);
			
		}
		
		
	}
}
