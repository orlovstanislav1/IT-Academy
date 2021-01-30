package com.company.HW2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
3)	Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
НЕ РАБОТАЕТ
 */

public class Main22 {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("укажите сегодняшнюю дату ");
        int a = Integer.parseInt(x.readLine());
        System.out.println("укажите сегодняшний месяц ");
        int b = Integer.parseInt(x.readLine());
        System.out.println("укажите сегодняшний год ");
        int c = Integer.parseInt(x.readLine());

        if ((a == 28) && b == 2 && c % 4 == 0 && c % 400 == 0 && c % 100 != 0) {
            a = 1;
            b++;
            System.out.println("завтра будет: - дата: " + a + ", месяц " + b + ", год " + c);
        } else if (a == 29 && b == 2 && !(c % 4 == 0 && c % 400 == 0 && c % 100 != 0)) {
            a = 1;
            b++;
            System.out.println("завтра будет: - дата: " + a + ", месяц " + b + ", год " + c);
        } else if ((a == 31) && (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10)) {
            a = 1;
            b++;
            System.out.println("завтра будет: - дата: " + a + ", месяц " + b + ", год " + c);
        } else if ((a == 30) && (b == 4 || b == 6 || b == 9 || b == 11)) {
            a = 1;
            b++;
            System.out.println("завтра будет: - дата: " + a + ", месяц " + b + ", год " + c);
        } else if ((a == 31) && b == 12) {
            a = 1;
            b = 1;
            c++;
            System.out.println("завтра будет: - дата: " + a + ", месяц " + b + ", год " + c);
        } else {
            a++;
            System.out.println("завтра будет: - дата: " + a + ", месяц " + b + ", год " + c);
        }
    }
}