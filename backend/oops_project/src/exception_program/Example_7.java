package exception_program;

public class Example_7 {

	public static void m1() throws Exception {
		int a=11;
		if(a%2==0) {
			System.out.println("even number");
		}
		else
		{
			throw new CustomExceptionExample();
		}
	}
	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
