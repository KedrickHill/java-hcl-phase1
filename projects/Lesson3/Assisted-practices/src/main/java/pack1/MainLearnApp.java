package pack1;

/**
 * Hello world!
 *
 */
public class MainLearnApp 
{
    public static void main( String[] args )
    {

        System.out.println("----------------------------------\n" +
                            "Threads\n----------------------------------");

        ThreadExample myThread = new ThreadExample();
        myThread.start();

        System.out.println("Starting Runnable Thread ... ");
        ThreadRunnableExample mrt = new ThreadRunnableExample();
        Thread t = new Thread(mrt);
        t.start();

        while(ThreadRunnableExample.myCount <= 10) {
            try {
                System.out.println("MAIN: Main Thread : " + (++ThreadRunnableExample.myCount));
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.err.println("RUNNABLE: Exception in thread " + e.getMessage());
            }
        }
        System.out.println("MAIN: End of Main Thread ... ");

        try{
            Thread.sleep(1000);
            ThreadSleepWait.RunSleepWait();
        }
        catch (InterruptedException e) {
            System.err.println("MAIN: Exception in Thread ... ");
        }


        System.out.println("----------------------------------\n" +
        "Threads Sender\n----------------------------------");

        ThreadSender snd = new ThreadSender();
        ThreadedSend s1 = new ThreadedSend("hi", snd);
        ThreadedSend s2 = new ThreadedSend("Bye", snd);
        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        }
        catch (Exception e) {
            System.err.println("Interrupted " + e.getMessage());
        }



    }
}
