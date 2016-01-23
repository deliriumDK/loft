package data.processing;

import org.huldra.math.BigInt;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;


public class MathSumParser {

    public static void process(String sourceXml) throws IOException, SAXException, ParserConfigurationException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

        DefaultHandler handler = new DefaultHandler() {

            /**
             * BigInt is a mutable implementation of BigInteger which makes it much faster.
             */
            private BigInt sum = new BigInt(0);

            @Override
            public void endDocument() throws SAXException {
                super.endDocument();
                System.out.println(sum);
            }

            @Override
            public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
                if (qName.equals("entry") && atts != null) {
                    sum.add(Integer.parseInt(atts.getValue(0)));
                }
            }
        };
        saxParser.parse(sourceXml, handler);
    }
}
