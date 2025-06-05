package constructor_program;

public class Chaining_1 {
	int a;
	String b;
	long c;
	double d;

	public Chaining_1(int a, String b, long c, double d) {
		this(a, b, c);// this call statement - used to call another const in same class
		this.d = d;
	}
	public Chaining_1(int a, String b, long c) {
		this(a, b);
		this.c = c;
	}
	public Chaining_1(int a, String b) {
		this(a);
		this.b = b;
	}
	public Chaining_1(int a) {
		this.a = a;
	}

}
