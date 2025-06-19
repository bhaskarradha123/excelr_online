package java_8_features;

import thread_program.MyThread;

//class MyThread implements Runnable{
//	@Override
//	public void run() {
//		System.out.println("running the current thred");	
//	}
//	
//}
public class InnerAnnonymous2 {

	public static void main(String[] args) {
//		Runnable r=new MyThread();
//	  creating object for Runnable by using anonymous inner class	
		Runnable r=new Runnable() {	
			@Override
			public void run() {
				System.out.println("running the current thread");		
			}
		};
		
		
		r.run();
		
	}
}
