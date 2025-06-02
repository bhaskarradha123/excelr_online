package array_programs;

public class FindSecondLargest {

	public static void main(String[] args) {
		int []arr= {10,34,67,43,76,19};
		int firstLargest=Integer.MIN_VALUE;//-2146786 //10
		int secondLargest=Integer.MIN_VALUE;
		
		for(int num:arr) {
			if(num>firstLargest) {
				secondLargest=firstLargest;
				firstLargest=num;
			}
			else if(num>secondLargest&&num!=firstLargest) {
				secondLargest=num;
			}
		}
		
		System.out.println(secondLargest);
		
	}
}

//1 ---10 -largest
//2 ---10(second) , 34 (largest)
//3----10,34(second),67(largest)
//4----10,34,67(largest),43(second)
//5----10,34,67(second),43,76(largest)
//6----10,34,67(second),43,76(largest),19
