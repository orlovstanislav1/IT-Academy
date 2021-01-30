package com.company.HW4;

//4)	Создать два одномерных массива целых чисел, отсортировать их.
// Затем создать массив, который будет содержать элементы этих двух массивов в
// отсортированном порядке. Из результирующего массива удалить повторяющиеся элементы.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "создадим ПЕРВЫЙ массив из 3-х чисел чисел, введите любые три числа" );
        int a = Integer.parseInt ( reader.readLine () );
        int b = Integer.parseInt ( reader.readLine () );
        int c = Integer.parseInt ( reader.readLine () );
        int[] array1 = {a, b, c};

        System.out.println ( "создадим ВТОРОЙ массив из 3-х чисел чисел, введите любые три числа" );
        int j = Integer.parseInt ( reader.readLine () );
        int f = Integer.parseInt ( reader.readLine () );
        int g = Integer.parseInt ( reader.readLine () );
        int[] array2 = {j, f, g};

        for (int i = 0; i < array1.length; i++)
            Arrays.sort ( array1, 0, 3 );
        Arrays.sort ( array2, 0, 3 );

        System.out.println ( "отсортировали ПЕРВЫЙ массив по возрастанию " + Arrays.toString ( array1 ) );
        System.out.println ( "отсортировали ВТОРОЙ массив по возрастанию " + Arrays.toString ( array2 ) );

        int[] array3 = merge ( array1, array2 );
        System.out.println ( "теперь произвели слияние ПЕРВОГО И ВТОРОГО массивов в отсортированном порядке " + Arrays.toString ( array3 ) );

        System.out.println ( "удалим в массиве повторяющиеся элементы" );//рельно пока не допер, но сделал так
        Set<Integer> set = new HashSet<Integer> (); // вот этот абзац по удалению дцбликатов я сам не понял
        for (int num : array3) {
            set.add ( num );
        }
        System.out.println ( set );
    }

    public static int[] merge(int[] array1, int[] array2) { //https://www.youtube.com/watch?v=tAtBPxw2RRQ&t=3s
        int[] result = new int[array1.length + array2.length];
        int lengthArray1 = array1.length;// создали длинну первого массива
        int lengthArray2 = array2.length;// создали второго первого массива
        int i = 0, j = 0, k = 0;//создали поэтапный указатель, что друг за другом надо ставить, i - указывает по
        // массиву array1, j - array2, k - по финальному массиву
        while (i < lengthArray1 && j < lengthArray2) { //если счетчик первого массива меньше длинны первого массива,
            // про второй так же
            if (array1[i] <= array2[j]) { //сравниваем элементы массивов и если первый массив < второго, то
                result[k] = array1[i];//первый массив на первом месте будет стоять первый массив
                i++;
            } else {//но если это условие не выполняется, тогда на первом месте будет стоять второй массив
                result[k] = array2[j];
                j++;
            }
            k++;//когда я вышел из этих двух условий, то поменялся счетчик k
        }
        //выше цикл while будет обрабатывать два массива одинаковой длинны
        //ниже цикл while будет обрабатывать два массива разной длинны
        while (i < lengthArray1) { //если строго одно условие выполняется, то
            result[k] = array1[i]; //если первый массив еще не заканчился, а второй уже закончился
            i++;
            k++;
        }
        while (j < lengthArray2) { //если второй массив еще не заканчился, а первый уже закончился
            result[k] = array2[j];
            j++;
            k++;
        }
        return result;
    }
}

/*
Добрый день, Станислав,

Было бы хорошо во втором задании сделать для матриц разного размера, но в целом алгоритм правильный. В третьем и четвертом тоже было бы хорошо для массивов разного размера. Например, так это делается для матрицы:
System.out.println("Введите размер матрицы: n*m");
        int n  = Integer.parseInt ( reader.readLine () );
        int m  = Integer.parseInt ( reader.readLine () );
        int[][] array1 = new int[n][m];
        System.out.println ( "создадим ПЕРВУЮ двумерную матрицу из 4 чисел, введите любые ЧЕТЫРЕ чисела" );
        for(int i = 0; i< n; i++)
            for(int j = 0; j<m;j++)
                array1[i][j] = Integer.parseInt ( reader.readLine () );

Аналогично и для массива.

Все сделано верно.
 */