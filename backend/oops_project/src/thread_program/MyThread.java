package thread_program;

public class MyThread extends Thread {
     
	
	
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
		
		MyThread myThread2=new MyThread();
		myThread2.start();
		
	}
	
}
