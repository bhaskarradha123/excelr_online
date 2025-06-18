package java_8_features;

public class Functional_Interface3 {

	public static void main(String[] args) {
		
		Thread thread=new Thread();
		System.out.println(thread);
		
		Thread thread2=new Thread("A");
		System.out.println(thread2);
		
		Runnable r=()->{
			for(int i=0;i<=5;i++) {
				System.out.println("running ...");
			}
		};
		
		Thread thread3=new Thread(r);// arg const with runnable task
		System.out.println(thread3);
		
		thread3.start();// start method will invoke run method implicitly
	}
}
