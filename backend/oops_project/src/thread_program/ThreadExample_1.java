package thread_program;

public class ThreadExample_1 {

	public static void main(String[] args) {
		Thread1 one=new Thread1();
		Thread1 two =new Thread1();
		Thread1 three=new Thread1();
		one.setName("first thread");
		two.setName("second thread");
		three.setName("third thread");
		
		one.setPriority(Thread.MIN_PRIORITY);//1
		two.setPriority(Thread.NORM_PRIORITY);//5
		three.setPriority(Thread.MAX_PRIORITY);//10
		
		
		one.start();
	    two.start();
	    three.start();
	}
}

class Thread1 extends Thread{
	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName()+" is running");
	}
	
	
}
