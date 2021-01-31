package com.company.HW14;

/*
emails.	Создать generic статический метод applyOperation, который принимает два объекта типа T и
BinaryOperator<T> и возвращает результат этой операции над этими объектами.
Протестировать его для:
●	сложения двух Integer;
●	вычитания двух Integer;
●	умножения двух Integer;
●	вычисления суммы квадратов двух Integer;
●	вычисления суммы квадратных корней из двух Double;
●	получения из двух строк одной с and(или "и") посередине: A, B => A and B;
 */

import java.util.function.BinaryOperator;

public class Main2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println ( "Сложения двух Integer: " + applyOperation ( x, y, Integer::sum ) );
        System.out.println ( "Вычитания двух Integer: " + applyOperation ( x, y, (i, s) -> i - s ) );
        System.out.println ( "Умножения двух Integer: " + applyOperation ( x, y, (i, s) -> i * s ) );
        System.out.println ( "Вычисления суммы квадратов двух Integer: " + applyOperation ( x, y,
                (i, s) -> i * i + s * s ) );
        System.out.println ( "Вычисления  суммы квадратных корней из двух Double: "
                + applyOperation ( 1.1, 2.2, (i, s) -> Math.sqrt ( i ) + Math.sqrt ( y ) ) );
        System.out.println ( "Получения из двух строк одной с and посередине: "
                + applyOperation ( "A", "B", (i, s) -> i + " and " + s ) );
    }

    public static <T> T applyOperation(T o1, T o2, BinaryOperator<T> operator) {
        return operator.apply ( o1, o2 );
    }
}
