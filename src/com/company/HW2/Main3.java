package com.company.HW2;

/*
В декартовой системе координат на плоскости заданы координаты вершин треугольника (x1,y1), (x2,y2), (х3,у3)  и еще
одной точки (x, y). Требуется написать программу, определяющую, принадлежит ли эта точка треугольнику (находится ли
точка внутри или на его сторонах).
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main3 {
    public static void main(String[] args) throws Exception {
        BufferedReader x = new BufferedReader ( new InputStreamReader ( System.in ) );

        System.out.println ( "Введите координаты (x1) точки А1 треугольника" );
        Double x1a = Double.parseDouble ( x.readLine () );
        System.out.println ( "Введите координаты (y1) точки А1 треугольника" );
        Double y1a = Double.parseDouble ( x.readLine () );

        System.out.println ( "Введите координаты (x2) точки B1 треугольника" );
        Double x2b = Double.parseDouble ( x.readLine () );
        System.out.println ( "Введите координаты (y2) точки B1 треугольника" );
        Double y2b = Double.parseDouble ( x.readLine () );

        System.out.println ( "Введите координаты (x3) точки C1 треугольника" );
        Double x3c = Double.parseDouble ( x.readLine () );
        System.out.println ( "Введите координаты (y3) точки C1 треугольника" );
        Double y3c = Double.parseDouble ( x.readLine () );

        System.out.println ( "Введите координаты (x4) точки D1 треугольника" );
        Double x4d = Double.parseDouble ( x.readLine () );
        System.out.println ( "Введите координаты (y4) точки D1 треугольника" );
        Double y4d = Double.parseDouble ( x.readLine () );

        double SquareBigTriangle = (x1a * (y3c - y2b) + x3c * (y2b - y1a) + x2b * (y1a - y3c)) / 2;

        double SquareLittle1Triangle = (x1a * (y3c - y4d) + x3c * (y4d - y1a) + x4d * (y1a - y3c)) / 2;
        double SquareLittle2Triangle = (x1a * (y4d - y2b) + x4d * (y2b - y1a) + x2b * (y1a - y4d)) / 2;
        double SquareLittle3Triangle = (x4d * (y3c - y2b) + x3c * (y2b - y4d) + x2b * (y4d - y3c)) / 2;

        if ((SquareLittle1Triangle + SquareLittle2Triangle + SquareLittle3Triangle) == SquareBigTriangle) {
            System.out.println ( "Точка D1 принадлежит заданному треугольнику" );
        } else if ((SquareLittle1Triangle + SquareLittle2Triangle + SquareLittle3Triangle) != SquareBigTriangle) {
            System.out.println ( "Точка D1 не принадлежит заданному треугольнику" );
        }
    }
}