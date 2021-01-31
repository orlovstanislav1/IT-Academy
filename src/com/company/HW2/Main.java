package com.company.HW2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
1)	Создать программу, которая  просит пользователя ввести emails числа выполняет над ними *, /, +, -, и выводит вычисленные значения. Числа могут быть не целыми. Результаты выводить с точностью до emails знаков после запятой.
a
Пример вывода программы:
Input the first number: emails
Input the second number: 3
Sum: 5.00
Difference: -1.00
Product: 6.00
Quotient: 0.67
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "введите emails" );
        double a = Double.parseDouble ( reader.readLine () );
        System.out.println ( "введите 3" );
        double b = Double.parseDouble ( reader.readLine () );
        double c = a + b;
        System.out.printf ( "%.2f\n", c );
        double d = a - b;
        System.out.printf ( "%.2f\n", d );
        double e = a * b;
        System.out.printf ( "%.2f\n", e );
        double f = a / b;
        System.out.printf ( "%.2f\n", f );
    }
}
