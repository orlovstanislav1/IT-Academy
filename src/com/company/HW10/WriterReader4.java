package com.company.HW10;
/*
4)	Создать объект Person3 c полями name, surname, age, password(не должно сериализоваться), статическими полем
minAllowedAge.
 Сгенерировать 10 объектов класса Person3 со случайными значениями полей соответствующего типа. С помощью сериализации
  записать их
  в файл и считать их оттуда.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterReader4 {
    public static void main(String[] args) {

        String[] personName = {"Яша", "Петя", "Макс", "Иван", "Коля", "Поля", "Оля", "Вася", "Стас", "Ян"};
        String[] personSurname = {"первый", "второй", "третий", "четвертый", "пятый", "шестой", "седьмой", "восьмой",
                "девятый", "десятый"};
        int[] personAge = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        String[] personPassword = {"1", "12", "123", "1234", "12345", "123456",
                "1234567", "12345678", "123456789", "12345678910"};

        Person4[] people = new Person4[10];
        int a;
        int ageA;
        for (int i = 0; i < 10; i++) {
            people[i] = new Person4 ( personName[a = (int) (Math.random () * 10)],
                    personSurname[a = (int) (Math.random () * 10)],
                    personAge[ageA = (int) (Math.random () * 10)],
                    personPassword[a = (int) (Math.random () * 10)] );
            if (personAge[ageA] < Person4.minAllowedAge) {
                System.out.println ( "Неподходящий возраст - " + people[i] );
                i--;
            }
        }
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream ( new FileOutputStream ( "D:/PROGRAMMING" +
                "/Progi/java - project/ORLOV-STANISLAV/src/com/company/HW10/text4.txt" ) )) {
            objectOutputStream.writeObject ( people );

        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}