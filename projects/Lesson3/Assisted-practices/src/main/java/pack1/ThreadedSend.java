package pack1;

public class ThreadedSend extends Thread {

    private String msg;
    ThreadSender sender;

    public ThreadedSend(String msg, ThreadSender sender) {
        this.msg = msg;
        this.sender = sender;
    }
    
    public void run() {
        synchronized (sender) {
            sender.send(msg);
        }
    }
}
