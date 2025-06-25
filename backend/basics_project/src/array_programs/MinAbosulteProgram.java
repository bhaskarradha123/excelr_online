package array_programs;

import java.util.Arrays;

public class MinAbosulteProgram {

	public static void main(String[] args) {
		int []arr= {3,2,1,4};
		int sum=minAbsoultDifference(arr);
		System.out.println(sum);
		
//		mean 
//		mode 
//		medium
		
	}
	public static int minAbsoultDifference(int[]arr) {
		Arrays.sort(arr); //1,2,3,4
		int medium=arr[arr.length/2];
		int sum=0;
		
		for(int num:arr) {
			sum+=Math.abs(num-medium);
		}
		return sum;
		
	}
}
