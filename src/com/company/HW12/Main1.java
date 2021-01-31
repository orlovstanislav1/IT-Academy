package com.company.HW12;
/*
1)	Создать 3 потока, каждый из которых в цикле с 5 итерациями осуществляет на каждой итерации
●	сначала запись в один и тот же файл текста, который был передан в конструктор данного потока,
●	спит 1 секунду,
●	затем читает из одного и того-же файла с выводом на консоль прочитанного и имени потока.
Синхронизировать потоки c помощью synchronized..

 */
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 extends Thread {
    final File file;
    String text;

    public Main1(File file, String text) {
        this.text = text;
        this.file = file;
    }

    public static void main(String[] args) {
        File file = new File ( "D:/PROGRAMMING/Progi/java - project/ORLOV-STANISLAV/src/com/company/HW12/text1.txt" );

        Thread thread1 = new Main1 ( file, "1" );
        thread1.start ();
        Thread thread2 = new Main1 ( file, "2" );
        thread2.start ();
        Thread thread3 = new Main1 ( file, "3" );
        thread3.start ();
    }

    void myMethod() {
        synchronized (file) {
            for (int i = 0; i < 5; i++) {
                try {
                    FileWriter fileWriter = new FileWriter ( file, true );
                    fileWriter.write ( text );
                    fileWriter.close ();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
            try {
                sleep ( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }

            for (int i = 0; i < 5; i++) {
                try {
                    FileReader fileReader = new FileReader ( file );
                    Scanner scanner = new Scanner ( fileReader );
                    System.out.println ( scanner.nextLine () + " поток " + getName () );
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        }
    }

    @Override
    public void run() {
        myMethod ();
    }
}
/*
В 1 задании лучше было бы сделать 2 synchronized блока с одинаковым монитором, один для чтения, другой для записи, чтобы не
тратить время синхронизации еще и на сон между чтением и записью(спать можно параллельно).
 */