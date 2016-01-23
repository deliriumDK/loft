package Except;

import java.util.Random;

/**
 * Created by viioo on 06.01.2016.
 */
public class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i <12; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Exc is: " +e);
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }
}
