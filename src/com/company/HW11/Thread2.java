package com.company.HW11;
/*
2)	Создать класс поток, который спит 3 секунды и затем заполняет файл 10-ю целыми числами.
 Создать другой класс поток, который читает числа из файла и находит их среднее арифметическое.
  Запустить оба потока в main.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Thread2 extends Thread {
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread thread = new Thread2 ();
        sleep ( 3000 );
        thread.start ();

        Thread2_2 thread22 = new Thread2_2 ();
        thread22.start ();
    }

    @Override
    public void run() {
        try {
            FileWriter fileWriter = new FileWriter ( "text2.txt" );
            for (int i = 0; i < 10; i++) {
                int j = (int) (Math.random () * 10);
                fileWriter.write ( j + "\n" );
            }
            fileWriter.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}

class Thread2_2 extends Thread {
    @Override
    public void run() {
        try {
            FileReader fileReader = new FileReader ( "text2.txt" );
            Scanner scanner = new Scanner ( fileReader );
            int i = 0;
            double sum = 0;
            double average;
            while (scanner.hasNextLine ()) {
                int j = Integer.parseInt ( scanner.nextLine () );
                sum += j;
                i++;
                if (i == 10) {
                    average = sum / i;
                    System.out.println ( "Среднее арифметическое: " + average );
                    break;
                }
            }
            fileReader.close ();
            scanner.close ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}
