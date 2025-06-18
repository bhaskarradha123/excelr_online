package java_8_features;

@FunctionalInterface
public interface FunctionalInterface1 {
     
	void m1();
	
//	void m2();CTE 
	
	default void m3() {
		
	}
	
	static void m4() {
		
	}
}
