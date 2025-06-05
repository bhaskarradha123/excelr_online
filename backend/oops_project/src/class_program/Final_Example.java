package class_program;

public abstract class Final_Example {
	static int a;
	final static String b="data";
//	public abstract final void m1();
	public final void m2() {   // final methods can't be override
		System.out.println("m2 in parent");
	}
	public static void main(String[] args) {
		System.out.println(a);
		a=10;
		System.out.println(a);
//		b="hello"; can't re-initlize
	}
}
final class Final_Child extends Final_Example{	
}
//class Final_Child_2 extends Final_Child {
//	  final class can't be inherited
//}
