package thread_program;

public class InterruptExample extends Thread {
    @Override
    public void run() {
       for(;isInterrupted();) {
    	   System.out.println("thread is running");
       }
       
       System.out.println("thread is interrupted");
    }
	
	public static void main(String[] args) {
		InterruptExample i=new InterruptExample();
		i.start();
//		i.interrupt();
	}
}
