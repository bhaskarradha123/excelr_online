package method_programs;

public class RecursionFactorial {

	public static void main(String[] args) {
		int num=5;
		int result=factorail(num);
		System.out.println(result);
	}

	public static int factorail(int num) {
		if(num==0||num==1)
			return 1;
		return num*factorail(num-1);	
	}
}
