package exception_program;

public class Exception_3 {

	public static void main(String[] args) {
//		              0  1   2  3 4 
		int[] arr = { 1, 2, 3, 4, 5 }; // length=5

		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println(arr[i]);// AIOBE
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException");
			} catch (NullPointerException e) {
				System.out.println("null pointer exception");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("array index exception");
			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}
}
