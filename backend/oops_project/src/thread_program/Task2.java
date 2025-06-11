package thread_program;

public class Task2 {
// constructor overloading 
	public static void main(String[] args) {
		 Thread t1=new Thread();
		 System.out.println(t1);
		 
		 Runnable r1=new Thread(); //upCasting
		 System.out.println(r1);
		 
		 Thread t2=new Thread("ThreadA");
		 System.out.println(t2);
		 
		 Thread t3=new Thread(r1);
		 System.out.println(t3);
		 
		 Thread t4=new Thread(r1,"Thread B");
		 System.out.println(t4);
		 
		 Thread t5=new Thread(()->{
			System.out.println("creating with lamdba expression"); 
		 });
		 System.out.println(t5);
	}
}
