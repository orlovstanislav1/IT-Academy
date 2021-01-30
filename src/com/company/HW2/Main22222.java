package com.company.HW2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
3)	Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
 */

public class Main22222 {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("укажите сегодняшнюю дату ");
        int a = Integer.parseInt(x.readLine());
        System.out.println("укажите сегодняшний месяц ");
        int b = Integer.parseInt(x.readLine());
        System.out.println("укажите сегодняшний год ");
        int c = Integer.parseInt(x.readLine());

        if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10) {
            if (!(1 > a) && !(a > 30)) {
                System.out.println(c + "." + b + "." + (a = a + 1));
            } else if (a == 31) {
                System.out.println(c + "." + (b = b + 1) + "." + 1);
            }
        } else if (b == 2) {
            if (!(0 > c) && !(c > 3000))
                if (c % 400 == 0) {
                    if (!(1 > a) && !(a > 28)) {
                        System.out.println(c + "." + b + "." + (a = a + 1));
                    } else if (a == 29) {
                        System.out.println(c + "." + (b = b + 1) + "." + 1);
                    }
                } else if (c % 4 == 0 && c % 100 != 0) {
                    if (!(1 > a) && !(a > 28)) {
                        System.out.println(c + "." + b + "." + (a = a + 1));
                    } else if (a == 29) {
                        System.out.println(c + "." + (b = b + 1) + "." + 1);
                    }
                } else {
                    if (!(1 > a) && !(a > 27)) {
                        System.out.println(c + "." + b + "." + (a = a + 1));
                    } else if (a == 28) {
                        System.out.println(c + "." + (b = b + 1) + "." + 1);
                    }
                }
        } else if (b == 4 || b == 6 || b == 9 || b == 11) {
            if (!(1 > a) && !(a > 29)) {
                System.out.println(c + "." + b + "." + (a = a + 1));
            } else if (a == 30) {
                System.out.println(c + "." + (b = b + 1) + "." + 1);
            }
        } else if (b == 12) {
            if (!(1 > a) && !(a > 30)) {
                System.out.println(c + "." + b + "." + (a = a + 1));
            } else if (a == 31) {
                System.out.println((c = c + 1) + "." + 1 + "." + 1);
            }
        }
    }
}