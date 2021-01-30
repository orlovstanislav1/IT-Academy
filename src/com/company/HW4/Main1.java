package com.company.HW4;

//1)	Создать массив строк и перевернуть его.
//Пример: Если был массив {“Hello” , “world”, “!” }, то должен получиться {“!”, “world”, “Hello”}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "Создать массив строк и перевернуть его." );
        String a = reader.readLine ();
        String b = reader.readLine ();
        String c = reader.readLine ();

        String[] array1 = {a, b, c};

        Collections.reverse ( Arrays.asList ( array1 ) );
        System.out.println ( "Перевернули : " + Arrays.toString ( array1 ) );

        System.out.println ( "теперь напишем каждое слова задом на перед" );
        StringBuffer buffer = new StringBuffer ( Arrays.toString ( array1 ) );
        buffer.reverse ();
        System.out.println ( buffer );
    }
}
