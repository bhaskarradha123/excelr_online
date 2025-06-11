package thread_program;

public class StopExample extends Thread {

	@Override
	public void run() {
		 for(int i=0;i<=100;i++) {
			 System.out.println("running ....");
		 }
	}
	public static void main(String[] args)  {
		
		StopExample s=new StopExample();
		s.start();
		try {
		Thread.sleep(1000);
		s.stop();
		}
		catch (Exception e) {
//			System.out.println(e.getMessage());
		}
		System.out.println("thread stoped forcefully");
	}
}
