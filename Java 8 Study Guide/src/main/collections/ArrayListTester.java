package main.collections;

import main.arrays.PlainArraysTester;

import java.util.ArrayList;

/**
 *
 */
public class ArrayListTester <T>  {
    private PlainArraysTester tester;


    public static void main(String[] args) {
        ArrayList arL = new ArrayList();
        arL.add("hawk");
        arL.add(true);
        arL.add(10);
        //arL.add(5, "can I?"); // IndexOutOfBoundsException
        System.out.println(arL);
        System.out.println(arL.toString());
        System.out.println(arL.contains(10));


        ArrayList<Integer> arInt = new ArrayList<>();
        for (int el : arInt) {
            System.out.println(el);
        }
    }

}
