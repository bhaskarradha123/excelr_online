package thread_program;

public class DeadLockExample_2 {
	public static void main(String[] args) {
		Thread_A a = new Thread_A();
		Thread_B b = new Thread_B();
		Thread t1 = new Thread(() -> a.methodA(b));
		Thread t2 = new Thread(() -> b.methodB(a));
		t1.start();
		t2.start();
	}
}

class Thread_A {
	void methodA(Thread_B b) {
		synchronized (Thread_A.class) {
			System.out.println("Thread 1 : locked A");
			synchronized (Thread_B.class) {
				b.common();
			}
		}
	}

	void common() {
		System.out.println("inside A");
	}
}

class Thread_B {
	void methodB(Thread_A a) {
		synchronized (Thread_A.class) {
			System.out.println("Thread 2 : locked B");
			synchronized (Thread_B.class) {
				a.common();
			}
		}
	}

	void common() {
		System.out.println("inside B");
	}
}
