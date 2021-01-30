package com.company.HW2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
2)	Имеется прямоугольное отверстие a*b, определить, можно ли его закрыть круглой картонкой радиуса r. a, b, r вводятся с клавиатуры, ответ выводится на клавиатуру.
Альтернативная формулировка задачи: Можно ли вписать прямоугольник a*b в окружность радиуса  r.
 */

public class Main1 {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.printf ( "введите длинну рямоугольника " );
        Double a = Double.parseDouble ( x.readLine () );
        System.out.printf ( "введите ширину прямоугольника " );
        Double b = Double.parseDouble ( x.readLine () );
        double c = Math.sqrt ( a * a + b * b );
        System.out.printf ( "диагональ куба " );
        System.out.printf ( "%.2f\n", +c );
        System.out.println ( "теперь нам надо узнать - можно ли данный прямоугольник закрыть круглой картонкой " +
                "заданного радиуса" );
        System.out.println ( "введите радиус круглой картонки " );
        Double d = Double.parseDouble ( x.readLine () );
        if (d >= c / 2) {
            System.out.println ( "при введенном значении радиуса круглой картонки " + d + " прямоугольник полностью " +
                    "закроется" );
        } else if (d < c / 2) {
            System.out.println ( "при введенном значении радиуса круглой картонки " + d + " прямоугольник не " +
                    "полностью закроется" );
            System.out.println ( "однако при нижеуказанном введенном значении радиуса круглой картонки прямоугольник " +
                    "полностью " +
                    "закроется" );
            System.out.printf ( "%.2f\n", +c / 2 );
        }
    }
}

/*
Во второй задаче не надо писать else if (d < c / 2)  , достаточно else.
 */