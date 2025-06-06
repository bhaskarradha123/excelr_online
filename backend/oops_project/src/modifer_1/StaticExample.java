package modifer_1;

public class StaticExample {
	static int a;
	String b;
	public void m1() {
		System.out.println(StaticExample.a);
//		System.out.println(StaticExample.b);
		System.out.println(a);
		System.out.println(b);
		m2();
	}
	public static void m2() {
		System.out.println(a);
//		System.out.println(b);
//		m1();
		StaticExample example=new StaticExample();
		System.out.println(example.b);
		example.m1();
	}
}
