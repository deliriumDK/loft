package main.arrays;

import java.util.Arrays;

/**
 *
 */
public class PlainArraysTester {

    public static void main(String[] args) {

        int vars  []   []   [   ];

        int ids[], types;
        ids = new int[3];
        ids = new int[]    {1, 2, 3};
        types = 3;
        System.out.println(Arrays.toString(ids));
        System.out.println(types);

        int[] ids2, types2;
        ids2 = new int[4];
        types2 = new int[4];
        System.out.println(Arrays.toString(ids2));
        System.out.println(Arrays.toString(types2));

        String[] strs = new String[4];
        System.out.println(Arrays.toString(strs));

        int[][] ar = new int[0][8];
        ar[0][0] = 2;
        System.out.println(Arrays.toString(ar));

        int java = 4;
    }
}
