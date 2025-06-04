package abstarction_program;

public abstract class Abstarction_Rules {
	int a;
	static int b;
	public Abstarction_Rules() {
		// for reinitilize
	}
	public static void m1() {
		System.out.println("static method");
	}
	public void m2() {
		System.out.println("non static method");
	}
	public abstract void m3(); 
//	public static abstract void m4(); --abstract is not applicable for static
//	public final abstract void m5();  --final method can't be  override , so we cant provide 
//	                                    implementation
	public static void main(String[] args) {
//		Abstarction_Rules r=new Abstarction_Rules(); -- can't create object for abstract class
	}
}
