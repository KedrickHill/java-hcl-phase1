package pack1;

public class ThreadRunnableExample implements Runnable {

	public ThreadRunnableExample() {
	}
    
    public static int myCount = 0;
    
    public void run() {
        while(ThreadRunnableExample.myCount <= 10) {
            try {
                System.out.println("RUNNABLE: Expl Thread");
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.err.println("RUNNABLE: Exception in Thread: " + e.getMessage());
            }
        }
    }
}
