package Except;

import javafx.scene.media.MediaException;

/**
 * Created by dima on 13.01.2016.
 */
public class TestExeptiron {

    public static void main(String[] args) {
        try {
            TestExeptiron.myTest(null);
        }catch (MyOwnExeption moe){
            System.out.println("Inside catch block: " + moe.getMessage());
        }
    }

    static void myTest(String str) throws MyOwnExeption{
        if (str==null){
            throw new MyOwnExeption("String val is null");
        }
    }
}
