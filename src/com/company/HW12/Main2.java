package com.company.HW12;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
emails)	Запустить 4 потока, каждый из которых добавляет свое имя к результирующей строке и выводит ее
 в синхронизированном с помощью ReentrantLock коде. Сделать так, чтобы потоки выполнялись по
 очереди в порядке возрастания номера потока при помощи Condition этого Lock (создать массив
 Condition по одному для каждого потока, каждый поток будет ждать свое условие, а предыдущий по
 номеру поток будет сигнализировать об условии).
Пример работы с Lock и Condition SynchBankTestLock.java в проекте threads.
 */
public class Main2 {
    public static void main(String[] args) {
        PrintNameThread printNameThread = new PrintNameThread ( 4 );
        printNameThread.startThread ();
        printNameThread.joinThread ();

        System.out.println ( printNameThread.getBuilder ().toString () );
    }

    public static class PrintNameThread {
        private final int count;
        private final Lock lock;
        private final StringBuilder builder;
        private Condition[] conditions;
        private Thread[] threads;
        private int count2 = 0;

        public PrintNameThread(int count) {
            this.count = count;
            builder = new StringBuilder ();
            lock = new ReentrantLock ();
            createCondition ( count );
            createThread ();
        }

        public void createCondition(int count) {
            conditions = new Condition[count];
            for (int i = 0; i < conditions.length; i++) {
                conditions[i] = lock.newCondition ();
            }
        }

        private void createThread() {
            threads = new Thread[count];
            for (int i = 0; i < threads.length; i++)
                threads[i] = new Thread ( () -> {
                    try {
                        writeNameThread ();
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }, "" + i );
        }

        public void writeNameThread() throws InterruptedException {
            lock.lock ();
            int numberThread = Integer.parseInt ( Thread.currentThread ().getName () );
            try {
                while (numberThread != count2) {
                    conditions[numberThread].await ();
                }
                builder.append ( "Thread - " ).append ( Thread.currentThread ().getName () ).append ( "\n" );
                if (count2 != count - 1) {
                    count2++;
                    conditions[count2].signal ();
                }
            } finally {
                lock.unlock ();
            }
        }

        public void startThread() {
            for (Thread thread : threads)
                thread.start ();
        }

        public void joinThread() {
            for (Thread thread : threads) {
                try {
                    thread.join ();
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        }

        public StringBuilder getBuilder() {
            return builder;
        }
    }
}