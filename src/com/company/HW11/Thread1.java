package com.company.HW11;
/*
1)	Создать класс поток, который генерирует массив случайных целых чисел из 10 элементов, затем
находит максимальный элемент, в этом массиве, и выводит на экран в формате имя потока, максимальный
элемент. Запустить 10 потоков.
 */
import java.util.Arrays;

public class Thread1 extends Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread1 ();
            thread.start ();
        }
    }

    @Override
    public void run() {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random () * 10);
        }
        Arrays.sort ( mas );
        System.out.print ( "Имя потока: " + getName () + "\nмаксимальный элемент массива " + mas[mas.length - 1] + "\n" );
    }
}
