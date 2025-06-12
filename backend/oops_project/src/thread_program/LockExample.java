package thread_program;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

	static Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		Runnable task = () -> {
			lock.lock();// acquires lock behavior
			System.out.println(Thread.currentThread().getName()+" got locked");
			
			lock.unlock();
			System.out.println(Thread.currentThread().getName()+" released the locked");
		};
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.start();
		t2.start();
	}
}
