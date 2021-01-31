package com.company.HW5;
/*
emails)	Создать класс Triangle, хранящий три стороны треугольника. Сделать конструктор,
        ●	который получает в качестве параметра 3 стороны.
        ●	который получает одно число и строит равносторонний треугольник с такой стороной.
        ●	по умолчанию(без параметров), который создает равносторонний треугольник со стороной 1.
        Создать методы, позволяющие рассчитать периметр и площадь треугольников. Создать методы, определяющие,
        является ли треугольник равносторонним, равнобедренным, прямоугольным.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Triangle3 { //характеристики класса
    int oneSide;
    int twoSide;
    int threeSide;

    public Triangle3(int oneSide1, int twoSide1, int threeSide1) { //создадим конструктор который получает три стороны и
        // проинициализируем поля
        this.oneSide = oneSide1;
        this.twoSide = twoSide1;
        this.threeSide = threeSide1;
    }

    public Triangle3(int oneSide2) { //создадим конструктор который получает одно число и строит
        this ( oneSide2, oneSide2, oneSide2 ); // равносторонний треугольник, с заданной стороной
    }

    public Triangle3() { //создадим конструктор который получает одно число и строит
        // равносторонний треугольник, со стороной = 1
        this ( 1 );// равносторонний треугольник, с такой же стороной
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "Введите длинны ТРЕХ сторон ПЕРВОГО треугольника" );
        int oneSide1 = Integer.parseInt ( reader.readLine () );
        int twoSide1 = Integer.parseInt ( reader.readLine () );
        int threeSide1 = Integer.parseInt ( reader.readLine () );
        Triangle3 triangle3 = new Triangle3 ( oneSide1, twoSide1, threeSide1 );
        System.out.println ( "его периметр = " + triangle3.perimetr () );
        System.out.println ( "его площадь " + triangle3.geroneSquare ()); // площадь треугольника
        System.out.println ( "равносторонний " + triangle3.equilateral () ); // является ли треугольник равносторонним
        System.out.println ( "равнобедренный " + triangle3.isosceles () ); // является ли треугольник равнобедренным
        System.out.println ( "прямоугольный " + triangle3.rectangular () );// является ли треугольник прямоугольным

        System.out.println ( "Введите длинны ОДНОЙ стороны ВТОРОГО треугольника" );
        int oneSide2 = Integer.parseInt ( reader.readLine () );
        Triangle3 triangleTwo = new Triangle3 ( oneSide2 );
        System.out.println ( "его периметр = " + triangleTwo.perimetr () );
        System.out.println ( "его площадь " + triangleTwo.geroneSquare ()); //площадь треугольника
        System.out.println ( "равносторонний " + triangleTwo.equilateral () ); // является ли треугольник равносторонним
        System.out.println ( "равнобедренный " + triangleTwo.isosceles () ); // является ли треугольник равнобедренным
        System.out.println ( "прямоугольный " + triangleTwo.rectangular () );// является ли треугольник прямоугольным

        System.out.println ( "Дан ТРЕТИЙ треугольник со сторонами 1" );
        Triangle3 triangleThree = new Triangle3 ( 1, 1, 1 );
        System.out.println ( "его периметр = " + triangleThree.perimetr () );
        System.out.println ( "его площадь " + triangleThree.geroneSquare ()); // площадь треугольника
        System.out.println ( "равносторонний " + triangleThree.equilateral () ); // является ли треугольник
        // равносторонним
        System.out.println ( "равнобедренный " + triangleThree.isosceles () ); // является ли треугольник
        // равнобедренным
        System.out.println ( "прямоугольный " + triangleThree.rectangular () );// является ли треугольник прямоугольным

    }

    public boolean rectangular() { // является ли треугольник прямоугольным
        return ((threeSide * threeSide == oneSide * oneSide + twoSide * twoSide) || (twoSide * twoSide == oneSide * oneSide + threeSide * threeSide) || (oneSide * oneSide == twoSide * twoSide + threeSide * threeSide));
    }

    public boolean isosceles() { // является ли треугольник равнобедренным
        return oneSide == twoSide || twoSide == threeSide || oneSide == threeSide;
    }

    public boolean equilateral() { // является ли треугольник равносторонним
        return oneSide == twoSide && twoSide == threeSide;
    }

    public int perimetr() { // расчет периметра треугольника
        return (oneSide + twoSide + threeSide);
    }

    public double geroneSquare() { // расчет площади треугольника
        // (формула Герона)
        return Math.sqrt ( oneSide * oneSide + twoSide * twoSide + threeSide * threeSide );
    }
}



/*
emails) В задании emails лучше делать поля private, чтобы соблюдать принцип инкапсуляции. А конструкторы можно было бы
реализовать через другие конструкторы этого же класса:
public Triangle3(int oneSide1, int twoSide1, int threeSide1) { //создадим конструктор который получает три стороны и
        // проинициализируем поля
        this.oneSide = oneSide1;
        this.twoSide = twoSide1;
        this.threeSide = threeSide1;
    }

    public Triangle3(int oneSide2) { //создадим конструктор который получает одно число и строит
        this(oneSide2, oneSide2, oneSide2);
    }

    public Triangle3() { //создадим конструктор который получает одно число и строит
        this(1);
    }

Третий конструктор просто вызывает второй, а второй вызывает первый с нужными параметрами.
 */