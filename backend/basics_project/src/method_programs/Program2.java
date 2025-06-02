package method_programs;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("main method starts");
		m1();
		System.out.println("main method ends");
	}
	public static void m1() {
		System.out.println("m1 method");
		m1(10);
	}
	public static void m1(int a) {
		System.out.println("m1 method"+ a);
		m1("hello",19);
	}
	public static void m1(String a , int b) {
		System.out.println("m1 method"+a+b);
		m1("bye bye ");
	}
	public static void m1(String a) {
		System.out.println("m1 method"+ a);
	}
}
