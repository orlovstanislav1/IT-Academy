package com.company.HW5;
/*
3)	Создать класс описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя свойствами:
секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте, сравнения двух объектов
(метод должен работать аналогично compareTo в строках, т. е. возвращать отрицательное значение, если объект меньше
объекта, с которым сравнивается, положительное, если больше, 0, если объекты равны.). Создать два конструктора:
• получающий общее количество секунд
• получающий часы, минуты и секунды по отдельности.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Time { //характеристики класса
    int Seconds;
    int Minutes;
    int Hours;
    int Result;

    public Time(int FirstSeconds1, int FirstMinutes1, int FirstHours1) { //создадим конструктор который получает время
        this.Seconds = FirstSeconds1;
        this.Minutes = FirstMinutes1;
        this.Hours = FirstHours1;
        this.Result = Seconds ();
    }

    public Time(int Result) {
        TimeT ( this.Result = Result ); //создадим конструктор
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "Введите временя в формате - секунды, минуты, часы" );
        int FirstSeconds1 = Integer.parseInt ( reader.readLine () );
        int FirstMinutes1 = Integer.parseInt ( reader.readLine () );
        int FirstHours1 = Integer.parseInt ( reader.readLine () );

        Time time1 = new Time ( FirstSeconds1, FirstMinutes1, FirstHours1 );
        System.out.println ( "Количество секунд = " + time1.Seconds () );

        Time time2 = new Time ( 10000 );
        System.out.println ( "Итого compareTo: " + time1.compareTo ( time2 ) );
        System.out.println ( "Общее количество секунд: " + time1.totalTime ( time2 ) );
        time2.timeTotal2 ();
    }

    public void TimeT(int Result) { //создадим конструктор
        this.Hours = Result / 3600;
        this.Minutes = (Result % 3600) / 60;
        this.Seconds = Result % 60;
    }

    void timeTotal2() {
        System.out.println ( "По отдельности: " + Hours + ":" + Minutes + ":" + Seconds );
    }

    public int Seconds() { // метод кол-во секунд
        return this.Seconds + (this.Minutes * 60) + (this.Hours * 3600);
    }

    public int compareTo(Time x) {
        return this.Result - x.Result;
    }

    public int totalTime(Time x) {
        return this.Result + x.Result;
    }
}
/*
3) В задании 3 лучше делать поля private, чтобы соблюдать принцип инкапсуляции.
Переменные и параметры в методах, имена методов должны начинаться с маленькой буквы.
Лучше хранить информацию в одном виде: либо только result, либо только hours, minutes,
seconds (в условии предлагалось хранить  hours, minutes, seconds, а количество секунд
вычисляется, когда оно необходимо), потому что хранение одного и того же в нескольких
местах может привести к несогласованности данных. Кстати такая несогласованность уже
возникает, если вызывать конструктор Time(int Result), потому что result хранит
реальное количество секунд, а остальные поля пустые, надо было и их заполнить в
этом конструкторе.
 */