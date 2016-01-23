package main.crossover.test;

import java.io.CharArrayReader;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        String object = "abcdefgh";
        char[] c = new char[object.length()];
        object.getChars(0, object.length(), c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c,1, 4);

        System.out.println(lonelyInteger(new int[]{1}));

        System.out.println(lonelyInteger(new int[]{1, 1, 2}));


    }

    public static int lonelyInteger(int[] arr) {

        final int SIZE = 101;
        int N = arr.length;
        int[] temp = new int[SIZE];
        for (int i = 0; i < N; temp[arr[i++]]++){}
        for (int i = 0; i < SIZE; i++){
            if (temp[i] == 1){
                return i;
            }
        }
        return -1;
    }
    

}
