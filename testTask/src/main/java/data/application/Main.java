package data.application;

import data.converter.Converter;
import data.processing.MathSumParser;
import data.processing.XmlProcessor;
import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        /*
        1 - N,
        2 - URL, "jdbc:mysql://localhost:3306/test_schema"
        3 - username, "root"
        4 - password "root"
         */

        if (args.length < 4){
            System.out.println("You have to provide N, URL, username, password");
            throw new RuntimeException("Not enough arguments");
        }

        int N;
        try {
            N = Integer.parseInt(args[0]);
        } catch (NumberFormatException ex){
            throw new RuntimeException("N must be an integer");
        }

        try( Converter converter = new Converter(N, args[1], args[2], args[3], "com.mysql.jdbc.Driver")) {

            // Initializing table
            long startTime = System.currentTimeMillis();
            converter.initBD();
            long stopTime = System.currentTimeMillis();
            log.info("InitBD execution time: " + (stopTime - startTime));

            // Downloading database into xml file
            startTime = System.currentTimeMillis();
            converter.readData();
            stopTime = System.currentTimeMillis();
            log.info("readData execution time: " + (stopTime - startTime));

            // XSLT transformation
            XmlProcessor xmlProcessor = new XmlProcessor("1.xml", "2.xml");
            startTime = System.currentTimeMillis();
            xmlProcessor.transformSAX();
            stopTime = System.currentTimeMillis();
            log.info("XSLT transformation execution time: " + (stopTime - startTime));

            // Calculating sum of fields data
            startTime = System.currentTimeMillis();
            MathSumParser.process("2.xml");
            stopTime = System.currentTimeMillis();
            log.info("MathSumParser execution time: " + (stopTime - startTime));

        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}