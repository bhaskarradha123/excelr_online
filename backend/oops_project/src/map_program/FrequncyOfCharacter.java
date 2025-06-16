package map_program;

import java.util.HashMap;
import java.util.Map;

public class FrequncyOfCharacter {

	public static void main(String[] args) {
		String s="hello";
		
		Map<Character, Integer>map=new HashMap<Character, Integer>();
		System.out.println(map.size());
		for(char c:s.toCharArray()) {
			
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		System.out.println(map);
	}
}
