package com.company.HW12;

import java.util.concurrent.Semaphore;

/*
3)	Семафор предназначен для управления въездом в туннель с односторонним движением. Каждый поток
 обозначает движение машины по тоннелю, проезд машины по которому длится от 1 до 3 секунд
 (случайное число от 1 до 3). В тоннеле может находиться до 3 машин одновременно.
Пример работы с Semaphore в пакете com.company.syncexamples.semaphore в проекте threads.
 */
public class Main3 {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore ( 3 );
        for (int i = 1; i <= 10; i++) {
            new Car ( semaphore, i ).start ();
        }
    }
}

class Car extends Thread {
    Semaphore semaphore;
    int id;

    Car(Semaphore semaphore, int id) {
        this.semaphore = semaphore;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire ();
            System.out.println ( "Машина " + id + " въехала в тоннель." );
            int passage = ((int) (Math.random () * (3 - 1 + 1) + 1)) * 1000; // машина проезжает по тоннелю random
            // 1-3 сек
            sleep ( passage );
            System.out.println ( "Машина " + id + " выехала из тоннеля за " + passage / 1000 + " сек." );
            semaphore.release ();
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    }
}
