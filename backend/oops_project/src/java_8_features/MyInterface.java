package java_8_features;

 public interface MyInterface {

	void m1();
	
	default void defaultMethod() {
		System.out.println("default implementation in interface");
	}
	
}

class Mychild  implements MyInterface{
	@Override
	public void m1() {
		System.out.println("m1 method overridden in child class");
		
	}
	
}


