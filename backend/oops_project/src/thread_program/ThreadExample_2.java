package thread_program;

public class ThreadExample_2 {
	public static void main(String[] args) {
		Thread2 thread2=new Thread2();// new state
		thread2.start();//new----->runnable state ---run()----->running state
	}

}
class Thread2 extends Thread{
	
	
	public void run(int i) {
		System.out.println("args method");
	}
}
