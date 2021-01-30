package com.company.HW10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/*
4)	Создать объект Person3 c полями name, surname, age, password(не должно сериализоваться), статическими полем
minAllowedAge.
 Сгенерировать 10 объектов класса Person3 со случайными значениями полей соответствующего типа. С помощью сериализации
  записать их
  в файл и считать их оттуда.
 */
public class ReadObject4 {
    public static void main(String[] args) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream ( new FileInputStream ( "D:/PROGRAMMING" +
                "/Progi/java - project/ORLOV-STANISLAV/src/com/company/HW10/text4.txt" ) )) {

            Person4[] people = (Person4[]) objectInputStream.readObject ();

            System.out.println ( Arrays.toString ( people ) );

        } catch (IOException e) {
            e.printStackTrace ();
        } catch (ClassNotFoundException e) {
            e.printStackTrace ();
        }
    }
}
