package com.company.HW6.EX_2_Interface;

/*
1 - Создать интерфейс MassMedia и от него иерархию средств массовой информации:
газет, журналов, телеканалов, блогов, новостных сайтов...
Например, включить в иерархию абстрактный класс Website и конкретные классы блог,
видеоблог, новости. Создать поля и методы специфические для каждого класса.
 */

public class Main {
    public static void main(String[] args) {
        Magazine magazine1 = new Magazine ( 1000 );
        magazine1.specialEditionVIP ();

        Newspaper newspaper1 = new Newspaper ( 40 );
        newspaper1.ageForNews ();

        AgencyOfNews video1 = new AgencyOfNews ( 100, 10000 );
        video1.Release ();
        video1.numberOfSubscribers ();

        Blog blog1 = new Blog ( 2, 200 );
        blog1.Hosting ();
        blog1.TextBlog ();
    }
}
