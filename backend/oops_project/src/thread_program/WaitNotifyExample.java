package thread_program;

public class WaitNotifyExample {
	static Object lock = new Object();

	public static void main(String[] args) {
		Thread waiter = new Thread(() -> {
			synchronized (lock) {
				System.out.println("waitiing ....");
				try {
					lock.wait();
				} catch (InterruptedException e) {
				}
				System.out.println("notified");
			}
		});
		
		Thread notifier = new Thread(() -> {
			synchronized (lock) {
				System.out.println("notifying ....");
				lock.notify();
			}
		});

		waiter.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		notifier.start();
	}
}
