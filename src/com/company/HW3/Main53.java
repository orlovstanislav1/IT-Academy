package com.company.HW3;

//Самостоятельно реализовать одну из сортировок массива.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main53 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "создадим ПЕРВЫЙ массив из 5 чисел, введите любые ПЯТЬ чисел" );
        int a = Integer.parseInt ( reader.readLine () );
        int b = Integer.parseInt ( reader.readLine () );
        int c = Integer.parseInt ( reader.readLine () );
        int d = Integer.parseInt ( reader.readLine () );
        int e = Integer.parseInt ( reader.readLine () );
        Integer [] array1 = {a, b, c, d, e};
        int l = array1.length;
        System.out.println ( "длинна ПЕРВОГО массива " + l );
        System.out.println ( Arrays.toString ( array1 ) );

        System.out.println ( "создадим ВТОРОЙ массив из 3 чисел, введите любые ТРИ числа" );
        int f = Integer.parseInt ( reader.readLine () );
        int g = Integer.parseInt ( reader.readLine () );
        int h = Integer.parseInt ( reader.readLine () );
        Integer [] array2 = {f, g, h};
        int k = array2.length;
        System.out.println ( "длинна ВТОРОГО массива " + k );
        System.out.println ( Arrays.toString ( array2 ) );

    }
}
