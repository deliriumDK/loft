package main.dimk.interview.thread;

/**
 * Created by dima on 14.01.2016.
 */
public class PrintRunnableLast implements Runnable {
    private String msg;
    private long sleepMillis;

    public PrintRunnableLast(String msg, long sleepMillis){
        this.msg = msg;
        this.sleepMillis = sleepMillis;
    }

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            try {
                Thread.sleep(sleepMillis);
            }catch (InterruptedException ex){
                throw new RuntimeException();
            }
            System.out.println(msg);
            System.out.println("  FATAL ERROR!");
            System.out.println("TOO MUCH THREADS");
        }
    }
}