package thread_program;

public class JoinExample extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread "+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		JoinExample j=new JoinExample();
		System.out.println(j);
		
		j.start();
		j.join();// it is waiting j to finish
		System.out.println("waits for completion");
	}
}
