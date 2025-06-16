package map_program;

import java.util.HashMap;
import java.util.Map;

public class FrequncyOfElement {
  public static void main(String[] args) {
	
	  int[]arr= {10,23,34,23,10,10,23,45,34};
	  
	  Map<Integer, Integer>map=new HashMap<Integer, Integer>();
	  for(int value:arr) {
		  map.put(value, map.getOrDefault(value, 0)+1);
	  }
	  System.out.println(map);
}
}
