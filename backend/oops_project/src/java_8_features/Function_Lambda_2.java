package java_8_features;

@FunctionalInterface
interface F_L2 {
	void m1();
}
// with lambda expression
public class Function_Lambda_2 {

	public static void main(String[] args) {
		
		F_L2 fl=()->{
			System.out.println("single abstarct method");
		};
		
		fl.m1();
		
	}
}
