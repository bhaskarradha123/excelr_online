package thread_program;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadGroup group = new ThreadGroup("Excelr Group");
		// lambda expression is a child of runnable interface
		Runnable task = () -> {
			System.out.println(Thread.currentThread().getName());
		};
		Thread thread1 = new Thread(group,task);
		Thread thread2 = new Thread(group,task);
		Thread thread3 = new Thread(group,task);

		thread1.start();
		thread2.start();
		thread3.start();
		
		group.list();

	}
}
