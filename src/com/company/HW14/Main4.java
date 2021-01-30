package com.company.HW14;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
4.	Создать стрим из 50 случайных чисел со значениями от 0 до 20 (используя Stream.generate), вывести его  и сохранить
 его в переменную.
Затем подсчитать и вывести сумму элементов в стриме, количество элементов в стриме, минимальный и максимальный элементы.
Далее в одной непрерывной строчке:
●	Удалить из него дубликаты.
●	Отсортировать по убыванию.
●	Оставить в стриме только числа, которые не делятся на 3.
●	Сохранить стрим в список.
Вывести этот список.
 */
public class Main4 {
    public static void main(String[] args) {

        List<Integer> list = Stream.generate ( () -> new Random ().nextInt ( 20 ) )
                .limit ( 50 )
                .peek ( i -> System.out.print ( i + " " ) )
                .collect ( Collectors.toCollection ( LinkedList::new ) );
        System.out.println ();
        System.out.println ( "Сумма элементов: " + list.stream ().reduce ( 0, Integer::sum ) );
        System.out.println ( "Количество элементов: " + list.stream ().count () );
        System.out.println ( "Максимальный элемент: " + list.stream ().max ( Integer::compareTo ).get () );
        System.out.println ( "Минимальный элемент:  " + list.stream ().min ( Integer::compareTo ).get () );

        list.stream ()
                .distinct ()
                .sorted ( (a, b) -> b - a )
                .filter ( i -> i % 3 != 0 )
                .collect ( Collectors.toList () )
                .forEach ( i -> System.out.print ( i + " " ) );
    }
}
