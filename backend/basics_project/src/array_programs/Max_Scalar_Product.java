package array_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Max_Scalar_Product {

	/**
	 * maximum scalar- both arrays need to be in ascending order
	 * minimum scalar- one array in ascending and other in descending order
	 * 
	 */
	public static void main(String[] args) {
		int []arr1= {1,2,-4,5,2,6,8};
		Integer []arr2= {4,5,2,9,7,5,4};
		
		if(arr1.length==arr2.length) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			int max=0;
			for(int i=0;i<arr1.length;i++) {
				max+=arr1[i]*arr2[i];
			}
			
			System.out.println("minimum scalar product is "+max);
			
		}else {
			System.out.println("can't find min sclar bcoz both the arrays are not in same size");
		}
	}
}
