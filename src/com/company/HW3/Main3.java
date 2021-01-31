package com.company.HW3;

//3.	Пользователь вводит с клавиатуры emails числа: a - начало и b - конец интервала из целых чисел.
// Выведите числа от a до b включительно, но пропуская числа, которые делятся на 3, а если встретится число,
// которое делится на 13, то его и числа следующие за ним не надо выводить.
// Для этой задачи используйте операторы continue и break;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "Введи с клавиатуры emails числа:a - начало и b - конец интервала из целых чисел. Выведятся " +
                "числа от a до b включительно, но пропуская числа, которые делятся на 3, а если встретится число," +
                "которое делится на 13, то его и числа следующие за ним не надо выводить." );
        int a = Integer.parseInt ( reader.readLine () );
        int b = Integer.parseInt ( reader.readLine () );
        Integer[] array1 = {a, b};

        for (int x : array1) {
            if (x % 13 == 0) {
                break;
            }
            {
                if (x % 3 == 0) {
                    continue;
                }
                System.out.print ( x );
                System.out.print ( "\n" );
            }
        }
    }
}