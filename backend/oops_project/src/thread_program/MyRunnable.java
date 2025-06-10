package thread_program;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
     System.out.println("running");	
     System.out.println(Thread.currentThread());
	}
	
	public static void main(String[] args) {
		MyRunnable r1=new MyRunnable();
		r1.run();
		Thread t1=new Thread(new MyRunnable());
		t1.start();
		Thread t2=new Thread(new MyRunnable());
		t2.start();
		
	}

	
	
	
	
}
