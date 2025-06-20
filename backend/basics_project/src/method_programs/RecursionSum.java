package method_programs;

public class RecursionSum {

	public static void main(String[] args) {
		int num=1456;
		int sum=sumOfDigit(num);
		System.out.println(sum);
		
	}
	private static int sumOfDigit(int num) {
		if(num==0)
			return 0;
		return num%10+sumOfDigit(num/10);
	}
}
