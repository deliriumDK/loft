package main;

/**
 *
 */
public class PracticalTests {

    public static void main(String[] args) {

        int i = 0;
        i = i;
        i++;
        System.out.println(i);
    }

    private static void checkLabelsAndBreak() {

        int x = 0;
        LABEL_1: {
            x++;
            System.out.println(x);
            break LABEL_1;
            //System.out.println(x);
        }

        final char a = 'A', b = 'B'; // b is also final here
        char grade = 'D';
        switch (grade) {
            default:
            case b: break;
            case a: break;
        }
    }

    private static void doWhileScope() {
        /*
        do {
            int y = 1;
        } while (y < 10); // cannot resolve symbol y
        */
    }

    private static void arithmeticTest() {
        long x = 10;
        int y = 5;

        y *= x; // OK!

        //y = y * x; // compile error - incompatible types
    }
}
