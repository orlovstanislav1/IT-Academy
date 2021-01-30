package com.company.HW4;

//3. Реализовать самостоятельно(т.е. не используя Arrays.binarySearch) алгоритм двоичного поиска
// для отсортированного массива . Для предварительной сортировки использовать Arrays.sort.

public class Main333 {
    public static void main(String[] args) {
        System.out.println ( binarySearch ( new int[]{1, 5, 8, 10, 20, 35, 40}, 35 ) );
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

