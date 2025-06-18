package array_programs;

import java.util.Arrays;
import java.util.Collections;

public class Ascending_Descending {

	public static void main(String[] args) {
		int[]arr={10,32,12,34,56,87,45,67,89,90};
		int middle=arr.length/2;
		int []firstHalf=new int[middle]; //copying first half
		for(int i=0;i<middle;i++) {
			firstHalf[i]=arr[i];
		}
	    Arrays.sort(firstHalf);
		Integer []secondHalf=new Integer[arr.length-middle];// copying second half
		for(int i=0;i<middle;i++) {
			secondHalf[i]=arr[middle+i];
		}
		Arrays.sort(secondHalf, Collections.reverseOrder());
		int []sorted=new int[arr.length];// merging two arrays into new array
		for(int i=0;i<firstHalf.length;i++) {
			sorted[i]=firstHalf[i];
		}
		for(int i=0;i<secondHalf.length;i++) {
			sorted[middle+i]=secondHalf[i];
		}
		System.out.println(Arrays.toString(sorted));
	}
}
