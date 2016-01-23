package main.dimk.interview.io.streams;

import java.io.*;

/**
 * Created by viioo on 08.01.2016.
 */
public class TestMyIOmain {
    public static void main(String[] args) {
        File testFile = new File("C:\\Users\\viioo\\Downloads\\test.txt");
        File test2File = new File("C:\\Users\\viioo\\Downloads\\test2file.txt");
        try {
            test2File.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            OutputStream out = new FileOutputStream(testFile);
            writeFile(out);
            InputStream is = new FileInputStream(testFile);
            readFile(is);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    public static void readFile(InputStream is) {
        try {
           int x = is.read();
            while (x != -1){

                System.out.print(x);
                x = is.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeFile(OutputStream out){
        OutputStream outB = new BufferedOutputStream(out);
        try {
            String str = "Tets is OK";
            outB.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}