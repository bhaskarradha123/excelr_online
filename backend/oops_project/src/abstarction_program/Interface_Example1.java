package abstarction_program;

public interface Interface_Example1 {
	public static final int a = 10;
	String b = "hello";

	public abstract void m1();

	int m2();
// added from java 8
	static void m3() {
		System.out.println("m3 static method");
	}
	
	default void m4() {
		System.out.println("m4 static method");
	}
}
