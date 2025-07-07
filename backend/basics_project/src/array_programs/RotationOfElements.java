package array_programs;

import java.util.Arrays;

public class RotationOfElements {

	public static void main(String[] args) {
		int []arr= {10,20,30,40,50};
		int k=2;
		leftRotation(arr,k);
		System.out.println(Arrays.toString(arr));
	}
	private static void leftRotation(int[] arr, int k) {
		int n=arr.length; //5
		k=k%n;//2
		int []temp=new int[n];//[0,0,0,0,0]
		for(int i=0;i<k;i++) {
			temp[i]=arr[i];
		}//[10,20,0,0,0]
		for(int i=0;i<n-k;i++) { // 3 iterations
			arr[i]=arr[i+k];
		}//[30,40,50,40,50]
		for(int i=0;i<k;i++) {
			arr[n-k+i]=temp[i];
		}//[30,40,50,10,20]
		
	}
}
