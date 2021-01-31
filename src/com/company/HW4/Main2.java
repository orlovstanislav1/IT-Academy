package com.company.HW4;

//emails. Создать две двумерные матрицы и сложить их.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "создадим ПЕРВУЮ двумерную матрицу из 4 чисел, введите любые ЧЕТЫРЕ чисела" );
        int a = Integer.parseInt ( reader.readLine () );
        int b = Integer.parseInt ( reader.readLine () );
        int c = Integer.parseInt ( reader.readLine () );
        int d = Integer.parseInt ( reader.readLine () );

        System.out.println ( "создадим ВТОРУЮ двумерную матрицу из 4 чисел, введите любые ЧЕТЫРЕ чисела" );
        int e = Integer.parseInt ( reader.readLine () );
        int f = Integer.parseInt ( reader.readLine () );
        int g = Integer.parseInt ( reader.readLine () );
        int h = Integer.parseInt ( reader.readLine () );

        Integer[][] array1 = {{a, b}, {c, d}};
        Integer[][] array2 = {{e, f}, {h, g}};
        int[][] array3 = new int[2][2];

        System.out.println ( "созднанная ПЕРВАЯ двумерная матрица будет иметь вид" );

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print ( array1[i][j] + "\t" );
            }
            System.out.println ();
        }

        System.out.println ( "созднанная ВТОРАЯ двумерная матрица будет иметь вид" );

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {

                System.out.print ( array2[i][j] + "\t" );
            }
            System.out.println ();
        }

        System.out.println ( "сложили ДВЕ матрицы, получилось: " );

        int s = 0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++)
                array3[i][j] = array1[i][j] + array2[i][j];
        }
        System.out.println ();

        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                System.out.print ( array3[i][j] + " " );
            }
            System.out.println ();
        }
    }
}


    



