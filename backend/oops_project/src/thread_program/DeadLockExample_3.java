package thread_program;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample_3 {
	public static void main(String[] args) {
		ThreadA_ a = new ThreadA_();
		ThreadB_ b = new ThreadB_();
		Thread t1 = new Thread(() -> a.methodA(b));
		Thread t2 = new Thread(() -> b.methodB(a));
		t1.start();
		t2.start();
	}
}

class ThreadA_ {
	Lock lockA = new ReentrantLock();

	void methodA(ThreadB_ b) {
		if (lockA.tryLock()) {
			System.out.println("thread A is loacked");
			try {
				if (b.lockB.tryLock()) {
					try {
						b.common();
					} finally {
						b.lockB.unlock();
					}
				} else {
					System.out.println("thread could not lock B");
				}
			} finally {
				lockA.unlock();
			}
		} else {
			System.out.println("Thread could not lock A");
		}}

	void common() {
		System.out.println("Thread A could not lock B");
	}
}

class ThreadB_ {
	Lock lockB = new ReentrantLock();

	 void methodB(ThreadA_ a){
		 
	 }

	void common() {
		System.out.println("Thread B could not lock A");
	}
}
