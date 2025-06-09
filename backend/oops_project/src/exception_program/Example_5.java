package exception_program;


public class Example_5 {
/**
 *   Throwable
 *     |
 *   Exception
 *     |
 *   RunTimeException
 *     |
 *   ArthmeticException
 *      */
	public static void main(String[] args) {
		 try {
//			 int a=10/0; //ArthmeticException
			 int a=Integer.parseInt("absa");//NumberformatException
		 }
		 catch (Throwable e) { //collects all child exceptions // upCasting
			System.out.println(e.getMessage());
		}
	}
}

