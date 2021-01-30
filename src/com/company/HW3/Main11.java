package com.company.HW3;

//1.	Напишите программу, которая сначала выводит все числа от 0 до 20, затем выводит их в обратном(убывающем)
// порядке, затем выводит все четные числа от 0 до 20 по возрастанию, затем выводит все нечетные числа от 20 до 0
// по убыванию.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main11 {
    public static void main(String[] args) throws Exception {
        System.out.println ( "создадим массив из чисел от 0 до 20 " );
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        String[] a = new String[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = reader.readLine ();
        }
        System.out.println ( "выводим массив " );
        for (int i = 0; i < a.length; i++) {
            System.out.println ( a[i] );
        }
        System.out.println ( "выводим массив в обратном порядке " );
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println ( a[i] );
        }
        System.out.println ( "выводим все четные числа по возрастанию " );
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0)
                System.out.println ( i + "" );

        }
        System.out.println ( "выводим все нечетные числа по убыванию " );
        for (int i = a.length; i > 0; i--) {
            if (i % 2 != 0 && i != 0)
                System.out.println ( i + "" );
        }
    }
}

/*
Не стоило создавать массив в 1 задании, но суть задания выполнена.
 */