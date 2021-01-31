package com.company.HW2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
3)	Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
НЕ РАБОТАЕТ
 */

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "укажите сегодняшнюю дату " );
        int a = Integer.parseInt ( x.readLine () );
        System.out.println ( "укажите сегодняшний месяц " );
        int b = Integer.parseInt ( x.readLine () );
        System.out.println ( "укажите сегодняшний год " );
        int c = Integer.parseInt ( x.readLine () );

        if (a == 28 && b == 2 && c % 4 == 0 && c % 100 != 0 || c % 400 == 0) {
            System.out.println ( "завтра будет дата 29 месяц 2 год " + c );
        } else if (a >= 1 && a <= 27) {
            System.out.print ( "завтра будет дата " + (a = a + 1) + " месяц " + b + " год " + c );
        } else if (a == 31 && b == 12) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 1 + " год " + (c = c + 1) );
        } else if (a == 31 && b == 1) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 2 + " год " + c );
        } else if (a == 28 && b == 2) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 3 + " год " + c );
        } else if (a == 31 && b == 3) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 4 + " год " + c );
        } else if (a == 30 && b == 4) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 5 + " год " + c );
        } else if (a == 31 && b == 5) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 6 + " год " + c );
        } else if (a == 30 && b == 6) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 7 + " год " + c );
        } else if (a == 31 && b == 7) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 8 + " год " + c );
        } else if (a == 31 && b == 8) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 9 + " год " + c );
        } else if (a == 30 && b == 9) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 10 + " год " + c );
        } else if (a == 31 && b == 10) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 11 + " год " + c );
        } else if (a == 30 && b == 11) {
            System.out.print ( "завтра будет дата " + 1 + " месяц " + 12 + " год " + c );
        }
    }
}


/*
По поводу 3 задачи:
В первом if должно быть такое условие со скобками a == 28 && b == emails && (c % 4 == 0 && c % 100 != 0 || c % 400 == 0)
Скобки нужны в связи с приоритетом операций, && выполняется первее, чем ||. Получается, что то условие которое указано в коде сейчас верно всегда, когда c % 400 == 0. А это значит, что для года, например, 2000 всегда будет срабатывать первый if.

29.02 високосного года не обрабатывается. Также не обрабатываются в каждом месяце числа 28, 29, 30, если они не являются последними. Например, 30.01.**** ничего не выведет.

Сделай, пожалуйста, чтобы третья задача работала для всех дней и пришли ее мне еще раз.
 */