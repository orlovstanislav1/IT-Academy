package com.company.HW4;

//3. Реализовать самостоятельно(т.е. не используя Arrays.binarySearch) алгоритм двоичного поиска
// для отсортированного массива . Для предварительной сортировки использовать Arrays.sort.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "создадим массив из 5 чисел чисел, введите любые пять чисел" );
        int a = Integer.parseInt ( reader.readLine () );
        int b = Integer.parseInt ( reader.readLine () );
        int c = Integer.parseInt ( reader.readLine () );
        int d = Integer.parseInt ( reader.readLine () );
        int e = Integer.parseInt ( reader.readLine () );
        int[] array = {a, b, c, d, e};
        int l = array.length;
        System.out.println ( "длинна массива " + l );
        System.out.println ( Arrays.toString ( array ) );
        for (int i = 0; i < array.length; i++)
            Arrays.sort ( array, 0, 5 );
        System.out.println ( "отсортировали массив по возрастанию " + Arrays.toString ( array ) );

        System.out.println ( "сейчас выполним двоичный поиск числа, напиши какое число хочешь найти" );
        int x = Integer.parseInt ( reader.readLine () );
        System.out.println (binarySearch (array, x ));
    }

    public static int binarySearch(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (x < array[middle]) {
                high = middle - 1;
            } else if (x > array[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}

