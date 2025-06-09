package exception_program;

public class Example_4 {
// larger ---smaller - narrownig
	// child ---parent -

	public static void main(String[] args) {
//		Exception e=new ArithmeticException();
		System.out.println("first line");
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("second line");
		String s = "ahcb123";
		try {
			int b = Integer.parseInt(s);
		} catch (Exception e) {

		}
		System.out.println("third line");
	}
}
