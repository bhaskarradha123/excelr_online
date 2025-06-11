package thread_program;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("first thread");
		 Thread t1=new Thread();
		 System.out.println(t1);
		 System.out.println("ID : "+t1.getId());
		 System.out.println("Name : "+t1.getName());
		 System.out.println("Priority :"+t1.getPriority());
		 System.out.println("Status : "+t1.getState());
		 
		 
		 System.out.println("second thread");
		 Thread t2=new Thread();
		 System.out.println(t2);
		 t2.setName("ThreadA");
		 t2.setPriority(10);
		 System.out.println("ID : "+t2.getId());
		 System.out.println("Name : "+t2.getName());
		 System.out.println("Priority :"+t2.getPriority());
		 System.out.println("Status : "+t2.getState());
	}
}
