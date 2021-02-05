package com.company.HW19.one;
/*
1)	Создать собственную аннотацию @SignCode c методами type(значения PACKAGE, METHOD, FIELD, LOCAL_VARIABLE, CLASS,
PARAMETER, CONSTRUCTOR) и id(уникальное целое число).
Создать класс Person1 c полями фамилия, имя, год рождения, методом toString и конструктором, принимающим фамилию, имя,
год рождения, статическим методом, который выводит значения аннотации @SignCode для всех проаннотированных элементов
c с помощью рефлексии.
Проаннотировать аннотацией @SignCode все возможные элементы: пакет, класс, поля, методы(включая конструктор), параметры
методов(в конструкторе).
Пакет можно получить так: M.class.getPackage()
 */

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String fileName = "E:\\PROGRAMMING\\Progi\\java-project\\IT-Academy\\src\\com\\company\\HW19\\one\\emails.xml";
        try {
            List<Email> emails = parseStAX(fileName);
            for (Email email : emails) {
                System.out.println(email);
            }

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }

    public static List<Email> parseStAX(String fileName) throws FileNotFoundException, XMLStreamException {
        List<Email> emails = null;
        Email email = null;
        boolean isEmails = false;
        boolean isEmail = false;
        boolean isId = false;
        boolean isTo = false;
        boolean isHeading = false;
        boolean isFrom = false;
        boolean isBody = false;
        XMLInputFactory factory = XMLInputFactory.newInstance();
        InputStream stream = new FileInputStream(fileName);
        XMLStreamReader reader = factory.createXMLStreamReader(stream);
        while (reader.hasNext()) {
            int res = reader.next();
            if (res == reader.START_ELEMENT) {
                switch (reader.getLocalName()) {
                    case "emails":
                        isEmails = true;
                        break;
                    case "email":
                        isEmail = true;
                        break;
                    case "id":
                        isId = true;
                        break;
                    case "from":
                        isFrom = true;
                        break;
                    case "to":
                        isTo = true;
                        break;
                    case "heading":
                        isHeading = true;
                        break;
                    case "body":
                        isBody = true;
                        break;
                }
            } else if (res == reader.CHARACTERS) {
                if (isEmails) {
                    emails = new ArrayList<>();
                    isEmails = false;
                } else if (isEmail) {
                    email = new Email();
                    isEmail = false;
                } else if (isId) {
                    assert email != null;
                    email.setId(Integer.parseInt(reader.getText()));
                    isId = false;
                } else if (isTo) {
                    assert email != null;
                    email.setTo(reader.getText());
                    isTo = false;
                } else if (isHeading) {
                    assert email != null;
                    email.setHeading(reader.getText());
                    isHeading = false;
                } else if (isFrom) {
                    assert email != null;
                    email.setFrom(reader.getText());
                    isFrom = false;
                } else if (isBody) {
                    assert email != null;
                    email.setBody(reader.getText());
                    isBody = false;
                }
            } else if (res == reader.END_ELEMENT) {
                if (reader.getLocalName().equals("email")) {
                    assert emails != null;
                    emails.add(email);
                }
            }
        }
        return emails;
    }
}
