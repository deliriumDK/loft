package main.dom;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

public class ParserDomWriter {
    public static void main(String[] args) {


        ParseDB parseDB = new ParseDB();

        try {
            parseDB.readDb();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        Object sd = new Object();


        /*try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root element
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("company");
            doc.appendChild(rootElement);

            // staff element
            Element staff = doc.createElement("AdminStuff");
            rootElement.appendChild(staff);
            // staff attr
            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            staff.setAttributeNode(attr);
            // shorten way
            //staff.setAttribute("id", "1");

            // firstname elements staff
            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("you"));
            staff.appendChild(firstname);
            // lastname elements staff
            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createTextNode("tube"));
            staff.appendChild(lastname);
            // nickname elements staff
            Element nickname = doc.createElement("nickname");
            nickname.appendChild(doc.createTextNode("video"));
            staff.appendChild(nickname);
            // salary elements staff
            Element salary = doc.createElement("salary");
            salary.appendChild(doc.createTextNode("50000"));
            staff.appendChild(salary);

            // staff2 element
            Element staff2 = doc.createElement("AdminStuff");
            rootElement.appendChild(staff2);
            //staff2 attr
            Attr attr1 = doc.createAttribute("id");
            attr1.setValue("2");
            staff2.setAttributeNode(attr1);

            // firstname staff2
            Element firstname1 = doc.createElement("firstname");
            firstname1.appendChild(doc.createTextNode("yong"));
            staff2.appendChild(firstname1);
            // lastname elements staff2
            Element lastname1 = doc.createElement("lastname");
            lastname1.appendChild(doc.createTextNode("mook kin"));
            staff2.appendChild(lastname1);
            // nickname elements staff2
            Element nickname1 = doc.createElement("nickname");
            nickname1.appendChild(doc.createTextNode("mkyong"));
            staff2.appendChild(nickname1);
            // salary elements staff2
            Element salary1 = doc.createElement("salary");
            salary1.appendChild(doc.createTextNode("100000"));
            staff2.appendChild(salary1);

            // prodstuff element child company
            Element prodStaff = doc.createElement("ProductStuff");
            rootElement.appendChild(prodStaff);
            // prodstuff attr
            Attr prodAtt = doc.createAttribute("id");
            prodAtt.setValue("1");
            prodStaff.setAttributeNode(prodAtt);

            // firstname staff2
            Element firstname2 = doc.createElement("firstname");
            firstname2.appendChild(doc.createTextNode("git"));
            prodStaff.appendChild(firstname2);
            // lastname elements staff2
            Element lastname2 = doc.createElement("lastname");
            lastname2.appendChild(doc.createTextNode("hub"));
            prodStaff.appendChild(lastname2);
            // nickname elements staff2
            Element nickname2 = doc.createElement("nickname");
            nickname2.appendChild(doc.createTextNode("githubber"));
            prodStaff.appendChild(nickname2);
            // salary elements staff2
            Element salary2 = doc.createElement("salary");
            salary2.appendChild(doc.createTextNode("130000"));
            prodStaff.appendChild(salary2);

            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("C:\\Users\\viioo\\Downloads\\programm\\Java 8 Study Guide\\file.xml"));

            transformer.transform(source, result);

            System.out.println("File saved!");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        ParserDomReader read = new ParserDomReader();*/
       // read.domRead();
    }
}
