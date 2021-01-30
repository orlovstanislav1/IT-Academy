package com.company.HW6.EX_2_Interface;

public class Newspaper implements MassMedia {
    private int age;

    public Newspaper(int profession) {
        this.age = age;
    }

    public void ageForNews() {
        if (age > 50) {
            System.out.println ( "выписываем газету - работа для Вас" );
        } else {
            System.out.println ( "Войти в айти" );
        }
    }


    @Override
    public void frequencyOfNewsRelease() {
        System.out.println ( "раз в неделю выходит новая газета" );
    }

    @Override
    public void numberOfSubscribers() {
        System.out.println ( "количество подписчиков - 2500" );
    }
}

