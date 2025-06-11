package thread_program;

public class DeadLockExample {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		Thread t1 = new Thread(() -> a.methodA(b));
		Thread t2 = new Thread(() -> b.methodB(a));
		t1.start();
		t2.start();
	}
}
/**
 * expected output :
 *      Thread A  locked
 *      Thread B locked
 *      inside A
 *      inside B
 *  
 *actual output:(reason- dead lock one thread is waiting for other thread to complete first)
 *      Thread A  locked
 *      Thread B locked
 *  
 */

class ThreadA {
	synchronized void methodA(ThreadB b) {
		System.out.println("Thread A locked ");
		b.common();
	}

	synchronized void common() {
		System.out.println("inside A");
	}
}

class ThreadB {
	synchronized void methodB(ThreadA a) {
		System.out.println("Thread B locked");
		a.common();
	}

	synchronized void common() {
		System.out.println("inside B");
	}
}
