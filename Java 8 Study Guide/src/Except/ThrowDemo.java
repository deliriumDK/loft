package Except;

import java.nio.file.FileAlreadyExistsException;

/**
 * Created by viioo on 07.01.2016.
 */
public class ThrowDemo {
    static void demoproc(){

        try {
            throw new FileAlreadyExistsException("dome");

        }catch (Exception e){
            System.out.println("Catch inside demoproc");
            System.out.println(e.getMessage());
      //      throw e;
            throw new RuntimeException ("Happy",e);
            
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch ( RuntimeException e){
           System.out.println("Second catch "+e.getMessage());
      //      e.printStackTrace();

        }
       /* try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("sad");
    }
}
