package com.company.HW14;

/*
3.	Создайте класс Person3 с полями name, surname, age. Сгенерируйте группу из человек в
возрасте от 15 до 30. Напишите ОДНУ НЕПРЕРЫВНУЮ цепочку вызовов, которая:
●	выбирает объекты, возраст которых меньше 21;
●	распечатывает их на экран;
●	сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
●	берет 4 первых объекта;
●	формирует коллекцию из фамилий объектов.
 */

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {

        List<Person3> person3s = new LinkedList<> ();

        for (int i = 0; i <= 20; i++) {
            person3s.add ( new Person3 ( "Name" + i, "Surname" + i + 1, new Random ().nextInt ( 15 ) + 15 ) );
        }

        List<String> newList = person3s.stream ()
                .filter ( e -> e.getAge () < 21 )
                .peek ( System.out::println )
                .sorted ( Comparator.comparing ( Person3::getSurname ) )
                .sorted ( Comparator.comparing ( Person3::getName ) )
                .limit ( 4 )
                .map ( Person3::getSurname )
                .collect ( Collectors.toList () );

        System.out.println ();
        System.out.println ( newList );
    }
}
