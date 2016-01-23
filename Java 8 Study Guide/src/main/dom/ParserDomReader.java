package main.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
 class Und{
    public static void main(String[] args) {

    }
}
public class ParserDomReader {

    public void domRead(){

        File inputFile = new File("file.xml");


        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("AdminStuff");
            System.out.println("----------------------------------");

            for (int temp = 0; temp < nodeList.getLength() ; temp++) {
                Node node = nodeList.item(temp);
                System.out.println("\n Curent Element : " + node.getNodeName());

                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("AdminStuff id : " + element.getAttribute("id"));
                    System.out.println("First Name : " + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name : " + element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Nickname : " + element.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Salary : " + element.getElementsByTagName("salary").item(0).getTextContent());
                }
            }

            NodeList nodeList1 = doc.getElementsByTagName("ProductStuff");
            System.out.println("------------------------------------");

            for (int i = 0; i < nodeList1.getLength() ; i++) {
                Node node = nodeList1.item(i);
                System.out.println("\n Curent Element : " + node.getNodeName());

                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("ProductStuff id :" + element.getAttribute("id"));
                    System.out.println("First Name : " + element.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name : " + element.getElementsByTagName("lastname").item(0).getTextContent());
                    System.out.println("Nickname : " + element.getElementsByTagName("nickname").item(0).getTextContent());
                    System.out.println("Salary : " + element.getElementsByTagName("salary").item(0).getTextContent());
                }
            }
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
