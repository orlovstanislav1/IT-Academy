package com.company.HW13;
/*
2)	Создать пул из 3 потоков. Ввести текст с клавиатуры. Для каждого слова текста создать и
запустить Callable, который будет возвращать это слово, повторенное столько раз, сколько букв
в этом слове. Сохранить в список все Future для этих Callable. Получить результаты Future и
вывести их на консоль.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main3 {
    static int[] firstArray = new int[10];
    static int[] secondArray = new int[10];

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool ( 3 );

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = new Random ().nextInt ( 100 ) + 1;
        }

        System.out.println ( Arrays.toString ( firstArray ) );

        for (int i = 0; i < firstArray.length; i++) {
            service.execute ( new MyRunnable ( i ) );
        }
        service.execute ( () -> System.out.println ( Arrays.toString ( secondArray ) ) );
        service.shutdown ();
    }

    public static class MyRunnable implements Runnable {
        private final int x;

        public MyRunnable(int x) {
            this.x = x;
        }

        @Override
        public void run() {
            int result = 0;
            for (int i = 0; i <= x; i++) {
                result += firstArray[i];
            }
            secondArray[x] = result;
        }
    }
}
