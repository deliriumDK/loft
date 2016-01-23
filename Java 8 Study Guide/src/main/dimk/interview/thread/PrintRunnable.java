package main.dimk.interview.thread;

public class PrintRunnable implements Runnable {
    private String msg;
    private long sleepMillis;
    private int step;

    public PrintRunnable(String msg, long sleepMillis, int step){
        this.msg = msg;
        this.sleepMillis = sleepMillis;
        this.step = step;

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
        }
    }
}
