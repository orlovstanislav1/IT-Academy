package com.company.HW11;

/*
3)	Создать emails матрицы случайных чисел размера 5*5, вывести их на консоль. Создать 5 потоков,
 каждый поток складывает соответствующие строки матрицы. В конце в main вывести результат
  сложения матриц.
 */

import java.io.IOException;
import java.util.Arrays;

public class Matrix3 extends Thread {
    private final int[] matrix1;
    private final int[] matrix2;
    private int[] sum;

    public Matrix3(int[] matrix1, int[] matrix2) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
    }

    public static void main(String[] args) throws IOException {
        int[][] matrix1 = new int[5][5];
        int[][] matrix2 = new int[5][5];
        int[][] sum;

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = (int) (Math.random () * 10);
            }
        }
        System.out.println ( "Первая матрица: " + Arrays.deepToString ( matrix1 ) );

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix2[i][j] = (int) (Math.random () * 10);
            }
        }
        System.out.println ( "Вторая матрица: " + Arrays.deepToString ( matrix2 ) );
        Matrix3[] sumMatrices = new Matrix3[5];

        for (int i = 0; i < sumMatrices.length; i++) {
            sumMatrices[i] = new Matrix3 ( matrix1[i], matrix2[i] );
        }

        for (Matrix3 sumMatrixThread : sumMatrices) {
            sumMatrixThread.start ();
        }

        for (Matrix3 sumMatrixThread : sumMatrices) {
            try {
                sumMatrixThread.join ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        sum = new int[5][5];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = sumMatrices[i].getSum ();
        }
        System.out.println ( "Новая матрица: " + Arrays.deepToString ( sum ) );
    }

    @Override
    public void run() {
        sum = new int[matrix1.length];
        for (int i = 0; i < matrix1.length; i++) {
            sum[i] = matrix1[i] + matrix2[i];
        }
        System.out.println ( currentThread ().getName () +
                Arrays.toString ( sum ) );
    }

    public int[] getSum() {
        return sum;
    }
}

