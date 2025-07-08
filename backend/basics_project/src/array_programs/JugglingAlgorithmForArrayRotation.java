package array_programs;

import java.util.Arrays;

public class JugglingAlgorithmForArrayRotation {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int target = 2;
		System.out.println(Arrays.toString(arr));
		jugglingAlgorithm(arr, target);
		System.out.println(Arrays.toString(arr));

	}

	private static void jugglingAlgorithm(int[] arr, int target) {
		int n = arr.length;
		target = target % n;
		int g=gcd(n,target);
		for(int i=0;i<g;i++) {
			int temp=arr[i];
			int j=i;
			while(true) {
				int k=(j+target)%n;
				if(k==i)break;
				arr[j]=arr[k];
				j=k;
			}
			arr[j]=temp;
		}}
	private static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
