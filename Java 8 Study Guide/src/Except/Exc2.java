package Except;

/**
 * Created by viioo on 06.01.2016.
 */
public class Exc2 {
    public static void main(String[] args) {
        int d,a;
        try {
            d = 0;
            System.out.println("Nothing");
            a = 42/d;

        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero");
        }
        System.out.println("After operator catch");
    }
}
