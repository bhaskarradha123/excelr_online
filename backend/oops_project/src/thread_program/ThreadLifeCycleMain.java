package thread_program;

public class ThreadLifeCycleMain {

	public static void main(String[] args) {
		 ThreadLifeCycle cycle=new ThreadLifeCycle();
	       cycle.setName("Thread 1");
	       System.out.println(cycle.getName()+"- new state"); // new state
	       
	       cycle.start();    
	}
}
// user defined thread
class ThreadLifeCycle extends Thread {
	
	@Override
	public void run() {
		System.out.println(getName()+ "- running state");
		try {
		Thread.sleep(5000);// thread is in waiting phase
		System.out.println(getName()+"- woke up from sleeping");
//		wait();
//		System.out.println("moved from waiting state");
		}
		catch (Exception e) {
			
		}
		
		System.out.println(getName()+" is terminated");
	}

}
