package java_8_features;

public class Functional_Interface3  {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<=5;i++) {
				System.out.println("running ...");
			}
		};
		Thread thread3=new Thread(r);// arg const with runnable task	
		thread3.start();;// start method will invoke run method implicitly
	}

	
}
 // we avoid inheriting
//  we avoid overriding