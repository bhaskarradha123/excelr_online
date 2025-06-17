package map_program;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class Map_Program3 {

	public static void main(String[] args) {
		
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		map.put(1, 101);
		map.put(null, null);
		map.put(2, null);
		System.out.println(map);
		
		Map<Integer, Integer>map2=new TreeMap<Integer, Integer>();
		map2.put(1, 101);
//		map2.put(null, null);NullPointerException - when key is null
		map2.put(2, null);
		System.out.println(map2);
		
		
		Map<Integer, Integer>map3=new Hashtable<Integer, Integer>();
		map3.put(1, 101);
//		map3.put(null, null);NullPointerException - when key and values is null
//		map3.put(2, null);
		System.out.println(map3);
		
	}
}
