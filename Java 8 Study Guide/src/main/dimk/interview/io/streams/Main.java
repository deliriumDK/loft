package main.dimk.interview.io.streams;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Set;

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\viioo\\Downloads\\test.txt");
        if ( file.exists() ) {
            InputStream is = null;
            try {

                is = new FileInputStream(file);
                //readAsInputStream(is);
                readAsString(is);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

 /*   private static void readAsInputStream(InputStream is) throws IOException {

        int readByte = is.read();
        while (readByte != -1) {
            System.out.println((char)readByte);
            readByte = is.read();
        }
    }*/

    private static void readAsString(InputStream is) throws IOException {
        // ������ �������������� ������ �����
        InputStream bis = new BufferedInputStream(is);
        // ����������� �������� ����� � ���������� (char)
        InputStreamReader isr = new InputStreamReader(bis);
        // ���������� box ��� ����������� ������, ������� ����� ������ ����� ������
        BufferedReader br = new BufferedReader(isr);
        // ������ ��������� ����
        String str = br.readLine();



        while (str != null) {
            System.out.println(str);
            str = br.readLine();
        }

    }

}
