package data.processing;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.stax.StAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileInputStream;
import java.io.IOException;


public class XmlProcessor {

    private String sourceFileName;
    private String resultFileName;
    private String xsltFileName = "transform.xsl";

    public XmlProcessor(String sourceFileName, String resultFileName) {
        this.sourceFileName = sourceFileName;
        this.resultFileName = resultFileName;
    }

    public void transformSAX() throws ParserConfigurationException, SAXException, IOException, TransformerException {
        // Create a SAXSource from the xml
        SAXSource saxSource = new SAXSource(new InputSource(new FileInputStream(sourceFileName)));
        // Object to hold the result
        StreamResult result = new StreamResult(resultFileName);
        // the factory that provides the transformer
        TransformerFactory factory = SAXTransformerFactory.newInstance();
        // the transformer that does the transformation
        Transformer transformer = factory.newTransformer(new StreamSource(xsltFileName));
        // the actual transformation
        transformer.transform(saxSource, result);
    }

    public void transformStAX() throws Exception {
        // obtain the StAX Source
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLEventReader reader = factory.createXMLEventReader(new FileInputStream(sourceFileName));
        StAXSource staxSource = new StAXSource(reader);

        // The factory that produces the transformer
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer(new StreamSource(xsltFileName));
        // An object to hold the results.
        StreamResult result = new StreamResult(resultFileName);
        // the transformation
        transformer.transform(staxSource, result);
    }

}
