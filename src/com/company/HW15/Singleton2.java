package com.company.HW15;

/*
2.Создайте простейший сервис с методом, который выводит на экран текущую дату.
Сделайте его Singleton2 и используйте в основном теле программы.
*/

import java.time.LocalDate;

public class Singleton2 {
    private static Singleton2 singleton2;
    private final LocalDate date;

    public Singleton2() {
        this.date = LocalDate.now ();
    }

    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2 ();
        }
        return singleton2;
    }

    public static void main(String[] args) {
        Singleton2 date = Singleton2.getInstance ();
        date.getDate ();
    }

    public void getDate() {
        System.out.println ( date );
    }
}
