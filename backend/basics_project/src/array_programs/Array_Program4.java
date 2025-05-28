package array_programs;

import java.util.Arrays;
import java.util.Collections;
//import java.lang.*;
public class Array_Program4 {

	public static void main(String[] args) {
		
		
		
		
		int []arr= {10,20,30,40,50};
		System.out.println(arr);//address
		System.out.println(Arrays.toString(arr));//[10, 20, 30, 40, 50]
		
		
		int []arr2= {35,23,67,12,8,0,12};
		Arrays.sort(arr2);// sort elements in ascending order
		System.out.println(Arrays.toString(arr2));
		
//primitive dt-	    byte short int long double float char boolean
//Wrapper class		Byte Short Integer Long Double Float Character Boolean
		
		Integer [] arr3={35,23,67,12,8,0,12};
		Arrays.sort(arr3,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr3));
		
		
		
		int arr4[]= {1,2,3,4,7};
		int arr5[]= {1,2,3,4,5};
		
		System.out.println(arr4 +" "+arr5);
		boolean res = Arrays.equals(arr4, arr5);
		System.out.println(res);

		

		
		
		
//	 	              0  1  2  3 4  5
		int []arr6= {56,34,45,56,34,67};
//	                       existing array	  starting Index    ending index(exclusive)
		int[] newArr = Arrays.copyOfRange(arr6,     1,                  5);
		System.out.println(Arrays.toString(newArr));
		
		
		
//		             0 1 2 3 4
//		int arr7[]= {1,2,3,4,7};
//		int arr8[]= {1,2,3,4,5};
//		int mismatchValue=Arrays.mismatch(arr7, arr8); // added from 9th version
//		System.out.println(mismatchValue);
		
		
		
		int arr9[]= {34,23,56,67,68};
		Arrays.sort(arr9);
		System.out.println(Arrays.toString(arr9));
		int searchIndex=Arrays.binarySearch(arr9, 372);
		System.out.println(searchIndex);
		
		
		
	}
}
