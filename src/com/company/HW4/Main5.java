package com.company.HW4;

//5)	Посчитать факториал числа, введенного с клавиатуры, с помощью рекурсии.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "посчитаем факториал числа " );
        int a = Integer.parseInt ( reader.readLine () );

        System.out.println ( "факториал числа " + a + " равен " + factorial ( a ) );
    }

    public static int factorial(int n) {
        if (n == 1)
            return 1;
        return n * factorial ( n - 1 );
    }
}

