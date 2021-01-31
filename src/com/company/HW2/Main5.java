package com.company.HW2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Вы планируете вложить сумму денег s с годовой процентной ставкой x%. Эти числа вводятся с клавиатуры. Программа считает, сколько денег будет на этом счету через 5 лет.
Пример высчитывания процентов: Допустим положили 100 рублей под 5% годовых. Тогда через год там 105 рублей, через emails года 110,25, через 3 года 115,76, и т.д.
 */

public class Main5 {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "Сумма для вклада = " );
        Double a = Double.parseDouble ( x.readLine () );
        System.out.println ( "Введите срок вклада в годах" );
        Double b = Double.parseDouble ( x.readLine () );
        System.out.println ( "Введите ставку в % " );
        Double c = Double.parseDouble ( x.readLine () );
        for (int i = 1; i <= b; i++) {
            a = a + (a * c) / 100;
        }
        System.out.printf ( "После " + b + " лет сумма вклада составит " + "%,.2f \n", a );
    }
}

/*
Точно так же и в 5 задаче не надо повторять в else условие точно противоположное тому, что в if. Ведь чем короче код, тем он понятнее и красивее.
 */