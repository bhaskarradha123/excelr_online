package array_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankingArray {
	public static void main(String[] args) {
		int[] arr = { 70, 20, 10, 10, 40 };
		System.out.println(Arrays.toString(arr));
		int rankedArray[] = ranking(arr);
		System.out.println(Arrays.toString(rankedArray));
	}

	public static int[] ranking(int[] arr) { // 70,20,10,10,40
		int[] clone = arr.clone(); // 70,20,10,10,40
		Arrays.sort(clone); // clone- 10 ,10,20,40,70
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int rank = 1;
		for (int value : clone) {
			if (!map.containsKey(value))// for same elements it won't execute so rank  won't increase
				map.put(value, rank++);
		}
//   clone- 10 ,10,20,40,70
//     map - 10-1  , 20-2 ,40-3, 70-4
		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = map.get(arr[i]);
		}
		return result;
	}
}
