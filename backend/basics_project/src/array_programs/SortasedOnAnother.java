package array_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortasedOnAnother {

	public static void main(String[] args) {
		int []arr1={10,20,10,30,40,20,10,50};
		int[]arr2= {10,20};
		sortArray(arr1,arr2);
		System.out.println(Arrays.toString(arr1));
	}

	private static void sortArray(int[] arr1, int[] arr2) {
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int num :arr1) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}        	
		int index=0;
		for(int num:arr2) {
			if(map.containsKey(num)) {
				int count=map.get(num);
				for(int i=0;i<count;i++) {
					arr1[index++]=num; 
				}
				map.remove(num);
			}}
		List<Integer>remaining=new ArrayList<Integer>();
		for(int key:map.keySet()) {
			int count=map.get(key);
			for(int i=0;i<count;i++) {
				remaining.add(key);
			}}	
		Collections.sort(remaining);
		for(int num:remaining) {
			arr1[index++]=num; 
		}}
}
