package com.company.HW9;

/*
1)	Взять домашнее задание 5.emails про треугольник.
●	Создать для него исключения, соответствующие ситуациям: такого треугольника не существует, отрицательная длина стороны не возможна.
В исключении про отрицательную длину стороны хранить список отрицательных сторон.
●	Сделать в main ввод трех сторон треугольника с клавиатуры.
●	При обработке этих исключений выводить соответствующее сообщение и предлагать заново ввести стороны треугольника.
●	Использовать logger для исключений и в начале каждого метода (выводить имя метода и параметры, с которыми он был вызван).

 */

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HW_9_1 {
    public static void main(String[] args) {

        boolean x = true;
        while (x) {
            x = false;
            System.out.println ( "Создадим треугольник." );

            try {

                Scanner scanner = new Scanner ( System.in );
                System.out.println ( "Введите сторону A:" );
                double sideA = scanner.nextInt ();
                System.out.println ( "Введите сторону B:" );
                double sideB = scanner.nextInt ();
                System.out.println ( "Введите сторону C:" );
                double sideC = scanner.nextInt ();

                Triangle triangle1 = new Triangle ( sideA, sideB, sideC );
                triangle1.perimeter ();
                triangle1.square ();
                triangle1.equilateral ();
                triangle1.isosceles ();
                triangle1.rectangular ();

            } catch (TriangleException e) {
                System.err.println ( e.toString () );
                x = true;
            }
        }
    }
}

class Triangle {
    private static final Logger logger =
            Logger.getLogger ( Triangle.class.getName () );

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double sideA, double sideB, double sideC) throws TriangleException {
        logger.log ( Level.INFO, "Вызов конструктора 'Triangle' с параметрами сторона А = " + sideA + ", сторона В = "
                + sideB + " сторона С = " + sideC );
        if ((sideA < 0 || sideB < 0 || sideC < 0) ||
                (sideA + sideB < sideC || sideC + sideB < sideA || sideA + sideC < sideB)) {
            logger.log ( Level.SEVERE, "Ошибка! Введены не коректные данные." );
            throw new TriangleException ( sideA, sideB, sideC );

        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    void perimeter() {
        logger.log ( Level.INFO,
                "Вызов метода 'perimeter' с параметрами сторона А = " + sideA + ", сторона В = " + sideB + " сторона " +
                        "С = " + sideC );
        double p = sideA + sideB + sideC;
        System.out.println ( "Периметр треугольника: " + p );
    }

    void square() {
        logger.log ( Level.INFO,
                "Вызов метода 'square' с параметрами сторона А = " + sideA + ", сторона В = " + sideB + " сторона С =" +
                        " " + sideC );
        double pp = (sideA + sideB + sideC) / 2;
        double s = Math.sqrt ( pp * (pp - sideA) * (pp - sideB) * (pp - sideC) );
        System.out.printf ( "Площадь треугольника: %.1f \n", s );
    }

    void equilateral() {
        logger.log ( Level.INFO,
                "Вызов метода 'equilateral' с параметрами сторона А = " + sideA + ", сторона В = " + sideB + " " +
                        "сторона С = " + sideC );
        if (sideA == sideB && sideB == sideC) {
            System.out.println ( "Треугольник равносторонний" );
        } else {
            System.out.println ( "Треугольник не равносторонний" );
        }
    }

    void isosceles() {
        logger.log ( Level.INFO,
                "Вызов метода 'isosceles' с параметрами сторона А = " + sideA + ", сторона В = " + sideB + " сторона " +
                        "С = " + sideC );
        if ((sideA == sideB && sideB == sideC) || (sideA == sideB || sideA == sideC || sideB == sideC)) {
            System.out.println ( "Треугольник равнобедренный" );
        } else {
            System.out.println ( "Треугольник не равнобедренный" );
        }
    }

    void rectangular() {
        logger.log ( Level.INFO,
                "Вызов метода 'rectangular' с параметрами сторона А = " + sideA + ", сторона В = " + sideB + " " +
                        "сторона С = " + sideC );
        if (((sideA * sideA) + (sideB * sideB) == sideC * sideC) ||
                ((sideC * sideC) + (sideB * sideB) == sideA * sideA) ||
                ((sideC * sideC) + (sideA * sideA) == sideB * sideB)) {
            System.out.println ( "Треугольник прямоугольный" );
        } else {
            System.out.println ( "Треугольник не прямоугольный" );
        }
    }
}