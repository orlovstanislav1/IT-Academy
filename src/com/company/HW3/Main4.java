package com.company.HW3;

/*Выведите на консоль таблицу умножения для чисел от 2 до 9. Пример вывода:
4 6 8 10 12 14 16 18
6 9 12 15 18 21 24 27
8 12 16 20 24 28 32 36
10 15 20 25 30 35 40 45
12 18 24 30 36 42 48 54
14 21 28 35 42 49 56 63
16 24 32 40 48 56 64 72
18 27 36 45 54 63 72 81
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "Выведите на консоль таблицу умножения для двух чисел " );
        System.out.println ( "Видите размер таблицы по вертикали " );
        int a = Integer.parseInt ( reader.readLine () );
        System.out.println ( "Видите размер таблицы по горизонтали " );
        int b = Integer.parseInt ( reader.readLine () );

        for (int i = 2; i < a + 1; i++) {
            for (int k = 2; k < b + 1; k++) {
                System.out.printf ( "%4d", (k * i) );
            }
            System.out.println ();
        }
    }
}
