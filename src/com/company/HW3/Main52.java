package com.company.HW3;

//Самостоятельно реализовать одну из сортировок массива.
//Сортировка слиянием

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main52 {
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


    }
}
