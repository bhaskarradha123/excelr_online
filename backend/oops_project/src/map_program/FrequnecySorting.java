package map_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequnecySorting {

	public static void main(String[] args) {
		int[]arr={10,20,10,30,30,10};
//		 finding freq
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int num:arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
//		converting array to list  -- to work on sorting technique
		List<Integer>list=new ArrayList<Integer>();
         for(int num:arr) {
        	 list.add(num);
         }
         
         
		System.out.println(map);  //{20=1, 10=3, 30=2}
		System.out.println(list);//[10, 20, 10, 30, 30, 10]
//		 custom comparison by using lambda expression
		Collections.sort(list, (a,b)->{
			 int freqA=map.get(a);
			 int freqB=map.get(b);
			 if(freqA!=freqB)
				 return freqB-freqA;
			 else
				 return a-b;
		});
		
		
		System.out.println(list);
	}
}
