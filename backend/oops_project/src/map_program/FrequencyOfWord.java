package map_program;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWord {

	public static void main(String[] args) {
		String sentence="hello hi bye hi bye";
		
		Map<String, Integer>map=new HashMap<String, Integer>();
		for(String word:sentence.split(" ")) {
			map.put(word, map.getOrDefault(word, 0)+1);
		}
		System.out.println(map);
	}
}
