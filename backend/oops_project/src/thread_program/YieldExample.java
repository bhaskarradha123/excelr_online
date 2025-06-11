package thread_program;

public class YieldExample extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread()+" "+i);
			Thread.yield();
		}
	}
	public static void main(String[] args) {
		
		YieldExample y1=new YieldExample();
		YieldExample y2=new YieldExample();
		System.out.println(y1);
		System.out.println(y2);
		
		y1.start();
		y2.start();
	}
}
