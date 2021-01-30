package com.company.HW4;

//6)	Строка вводится с клавиатуры. Проверить, является ли она палиндромом.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "введите слово полиндром, например шалаш" );
        String a = reader.readLine ();
        Polindrom ( a );
    }

    public static void Polindrom(String a) {
        String reverse = "";// Переварачиваем строку, берем символы исходной строки с конца строки до начала
        // и добавляем ее в начала строки-результата (переменная b)
        for (int i = a.length () - 1; i >= 0; i--) {
            reverse += a.charAt ( i );
        }
        if (a.equals ( reverse ))
            System.out.println ( "Entered string is a palindrome." );
        else
            System.out.println ( "Entered string is NOT a palindrome." );
    }
}