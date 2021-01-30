package com.company.HW13;
/*
2)	Создать пул из 3 потоков. Ввести текст с клавиатуры. Для каждого слова текста создать и
запустить Callable, который будет возвращать это слово, повторенное столько раз, сколько букв
в этом слове. Сохранить в список все Future для этих Callable. Получить результаты Future и
вывести их на консоль.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {

    public static void main(String[] args) {
        Solution solution = new Solution ();
        solution.inputText ();
        solution.processing ();
        solution.print ();
    }

    public static class Solution {
        private final ExecutorService service = Executors.newFixedThreadPool ( 3 );
        private final ArrayList<Future<String>> list = new ArrayList<> ();
        String[] strings;

        public void inputText() {
            try (BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) )) {
                strings = reader.readLine ().trim ().split ( " " );
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

        public void processing() {
            for (String x : strings) {
                int cont = x.length ();
                for (int i = 0; i < cont; i++) {
                    list.add ( service.submit ( () -> x ) );
                }
            }
            service.shutdown ();
        }

        public void print() {
            for (Future<String> future : list) {
                try {
                    System.out.println ( future.get () );
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace ();
                }
            }
        }
    }
}