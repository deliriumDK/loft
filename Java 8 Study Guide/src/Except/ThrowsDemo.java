package Except;

/**
 * Created by viioo on 07.01.2016.
 */
public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("throw the test");
        throw new IllegalAccessException("test");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Catch the " +e.getMessage());
        }
    }
}
