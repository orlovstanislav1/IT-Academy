package com.company.HW18;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * С помощью DOM считать список email-ов, создать список соответствующих
 * объектов Java и вывести его на консоль. Файл emails.xml
 * https://drive.google.com/file/d/1r3-W1_AeVGt-oAGsYb-HGCB5RUFMlcR5/view?usp=sharing
 */
public class Main1 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        List<Email> emails = new ArrayList<> ();
        File file = new File ( "D:\\JAVA\\JAVA\\src\\com\\itacademy\\javacore\\homeWork\\homeWork18\\task2\\emails" +
                ".xml" );
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance ();
        DocumentBuilder builder = factory.newDocumentBuilder ();
        Document document = builder.parse ( file );

        NodeList emailElements = document.getElementsByTagName ( "email" );

        for (int i = 0; i < emailElements.getLength (); i++) {
            Element email = (Element) emailElements.item ( i );
            emails.add ( new Email (
                    Integer.parseInt ( email.getElementsByTagName ( "id" ).item ( 0 ).getTextContent () )
                    , email.getElementsByTagName ( "to" ).item ( 0 ).getTextContent ()
                    , email.getElementsByTagName ( "from" ).item ( 0 ).getTextContent ()
                    , email.getElementsByTagName ( "heading" ).item ( 0 ).getTextContent ()
                    , email.getElementsByTagName ( "body" ).item ( 0 ).getTextContent () ) );
        }

        for (Email email : emails) {
            System.out.println ( email );
        }
    }
}
