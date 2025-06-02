package method_programs;

public class Program3 {
	public static void main(String[] args) {
		System.out.println("main method starts");
		m1(10);
		m1("hello");
		System.out.println("main method ends");
	}
	public static void m1(int a) {
		System.out.println("m1 method starts");
		System.out.println(a);
		System.out.println("m1 method ends");
	}
	public static void m1(String a) {
		System.out.println("m1 method starts");
		System.out.println(a);
		System.out.println("m1 method ends");
	}

}
