package thread_program;

public class DaemonThreadExample {

	public static void main(String[] args) {
		 Thread t=new  Thread(()->{
            while(true){
                try {
                System.out.println("deamon thread is running");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t.setDaemon(true);
        t.start();
       
        Thread user=new  Thread(()->{
            System.out.println("user thread is running");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("user thread is completed");
        });
        user.start();
        user.join();
		
	}
}
