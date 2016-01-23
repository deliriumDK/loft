package main.strings;

/**
 *
 */
public class StringBuilderTester {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");
        System.out.println(sb.toString());
        sb.insert(10, "xxx"); // throws StringOutOfBoundsException
        System.out.println(sb.toString());
    }
}
