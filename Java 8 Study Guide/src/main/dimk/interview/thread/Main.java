package main.dimk.interview.thread;

import java.text.RuleBasedCollator;

/**
 * Created by dima on 14.01.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("START OF MAIN");
        Runnable printer = new PrintRunnable        (" |````````````|", 1000, 0);
        Runnable printer1 = new PrintRunnable(" |            |", 1001, 1);
        Runnable printer2 = new PrintRunnable                     (" |  (x)   (x) |",1002, 2);
        Runnable printer3 = new PrintRunnable(" |      L     |", 1003, 3);
        Runnable printer4 = new PrintRunnable         (" |    _____   |", 1004, 4);
        Runnable printer5 = new PrintRunnable(" |   |_____|  |", 1005, 5);
        Runnable printer6 = new PrintRunnableLast              (" |____________|", 1006);
        Thread thread = new Thread(printer);
        Thread thread1 = new Thread(printer1);
        Thread thread2 = new Thread(printer2);
        Thread thread3 = new Thread(printer3);
        Thread thread4 = new Thread(printer4);
        Thread thread5 = new Thread(printer5);
        Thread thread6 = new Thread(printer6);
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        System.out.println("END OF MAIN");


    }

}
