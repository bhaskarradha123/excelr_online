package thread_program;

public class CountableMain {

	public static void main(String[] args) throws InterruptedException  {
		Counter counter = new Counter();
		System.out.println("total count : " + counter.getCount());
		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 100; i++) {
				counter.increment();
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 100; i++) {
				counter.increment();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("total count : " + counter.getCount());


	}
}

class Counter {
	private int count;

	public int getCount() {
		return this.count;
	}

	public synchronized void increment() {
		count++;
	}
}