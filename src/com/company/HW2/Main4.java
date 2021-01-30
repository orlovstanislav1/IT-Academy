package com.company.HW2;

/*
4)	Сделать программу, которая выполняет побитовую операцию  исключающее или (^) над двумя числами типа int
через операции И (&) и ИЛИ (|), т.е. оператор ^ не используется.
 */

public class Main4 {
    public static void main(String[] args) {
        int x = 277;//100010101
        int y = 432; //110110000
        System.out.println ( (~x & y) | (x & ~y) );
    }
}
