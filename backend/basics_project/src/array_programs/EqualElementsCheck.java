package array_programs;

public class EqualElementsCheck {

	public static void main(String[] args) {
		int[]arr= {2,2,2};
		String check= equalsCheck(arr)?"yes elements are same":"no elements are different";
		System.out.println(check);
		
	}
	public static boolean equalsCheck(int[]arr) {
		int first=arr[0];
		for(int num: arr) {
			if(first!=num) {
				return false;
			}
		}
		return true;
	}
}
