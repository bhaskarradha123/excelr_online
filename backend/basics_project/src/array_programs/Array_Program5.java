package array_programs;

import java.util.Arrays;

public class Array_Program5 {

	public static void main(String[] args) {
		int[]arr= {1,2,3};
//		 represents in the form of rows, col in {}
		int [] arr3= {1,2};
		int [] [] arr2= {
				{1,2,3,4},
				{5,6,7,8}
				};
	
		System.out.println(Arrays.toString(arr2));//[address, address]
		System.out.println(Arrays.deepToString(arr2));
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		System.out.println(arr2[1].length);
			
		for(int i=0;i<arr2.length;i++) {
			 for (int j = 0; j < arr2[i].length; j++) {
				 System.out.print(arr2[i][j]+" ");
				
			}
			 System.out.println();
		}
	}
}
