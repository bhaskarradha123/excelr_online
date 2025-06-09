package exception_program;

public class Exception_2 {

	int a=10;
	public static void main(String[] args) {
		Exception_2 ex=new Exception_2();
		System.out.println(ex.a);
		
		Exception_2 e=null;
		try {
			System.out.println(e.a);//null pointer exception 
		}catch (Exception exception) {
			System.out.println("exception handled ");
		}
		finally {
			System.out.println("finally block");
		}
	}
}

