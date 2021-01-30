package com.company.HW3;

//Самостоятельно реализовать одну из сортировок массива.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main51 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "создадим массив из 5 чисел чисел, введите любые пять чисел" );
        int a = Integer.parseInt ( reader.readLine () );
        int b = Integer.parseInt ( reader.readLine () );
        int c = Integer.parseInt ( reader.readLine () );
        int d = Integer.parseInt ( reader.readLine () );
        int e = Integer.parseInt ( reader.readLine () );
        Integer[] array = {a, b, c, d, e};
        int l = array.length;
        System.out.println ( "длинна массива " + l );
        System.out.println ( Arrays.toString ( array ) );
        for (int i = 0; i < array.length; i++)
            Arrays.sort ( array, 0, 5 );
        System.out.println ( "отсортировали массив по возрастанию " + Arrays.toString ( array ) );
    }
}