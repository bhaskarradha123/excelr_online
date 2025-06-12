package thread_program;

public class DaemonThreadExample {

	public static void main(String[] args) {
		Thread daemonThread=new Thread(()->{
			while(true) {
				System.out.println("daemonThread running ......");
			}
		});
		
	    daemonThread.setDaemon(true);
		daemonThread.start();
		
		System.out.println("main thread ");
		
	}
}
