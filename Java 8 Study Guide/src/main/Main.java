package main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 */
public class Main {

    public void Main() {
        System.out.println("regular method, not a constructor!!");
    }

    public static void main(String[] args) {

        System.out.println("Hello World!");
        AnyClass cla = new AnyClass();

        Class cl = AnyClass.class;

        Random r = new Random();
        int x = r.nextInt(10);

        Scanner sc = new Scanner(System.in);
        sc.nextDouble();

        Math.pow(2, 3);


    }


    /* it has the same signature as the static one so its not allowed
    public void main(String[] args) {

    }
    */

    public void checkLabels() {

        SOME_LABEL: {
            int x = 0;
            break SOME_LABEL;
            // everything from now on is unreachable
            //x = 10;
            //System.out.println(x);
        }

        LABEL_2 : if (true) {
            int y = 0;
            //continue LABEL_2; // error - not in a loop
            break LABEL_2;
        }
    }
}
