package com.company.HW15;
/*
1)	Выполнить следующие пункты с DateTime API:
●	Получить текущую дату, вывести дату следующего дня.
●	Получить текущую дату, вывести дату, которая будет через 5 недель.
●	Получить текущую дату, вывести дату, которая была emails месяца назад.
●	Получить текущее время, вывести время, которое будет через 12 часов.
●	Получить последний день текущего месяца.
●	Найти сколько дней осталось в этом году.
●	Вывести дату в формате January 15 2021.
●	Вывести дату в формате 15 Jan 2021.
●	Вывести дату в формате 15.01.21.
●	Вывести время в формате 15.01.21 20:00.
●	Вывести время в формате 1-15-2021 20:00:00.000.
●	Вывести время в формате 15.01.2021 20-00-00.

 */

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeAPI {
    public static void main(String args[]) {

        Calendar calendar = Calendar.getInstance ();

        System.out.println ( "Получить текущую дату, вывести дату следующего дня." );

        Date currentDate = new Date ();  // Текущая дата
        System.out.println ( currentDate );
        calendar.roll ( Calendar.DAY_OF_MONTH, 1 );
        System.out.println ( "Дата следующего дня. " + calendar.get ( Calendar.DAY_OF_MONTH ) );
/*
        System.out.println ( "Можно и так получить текущую дату, вывести дату следующего дня." );
        Calendar calendar1 = new GregorianCalendar ();
        Date date = calendar1.getTime ();
        System.out.println ( date );
        calendar.roll ( Calendar.DAY_OF_MONTH, +1 );
        System.out.println ( "Дата следующего дня. " + calendar.get ( Calendar.DAY_OF_MONTH ) );

        System.out.println ( "--------------------------------------------------------------" );
        System.out.println ( "Получить текущую дату, вывести дату, которая будет через 5 недель." );
        Date currentDate2 = new Date ();  // Текущая дата
        System.out.println ( currentDate2 );
        calendar.roll ( Calendar.DAY_OF_MONTH, 14 );
        System.out.println ( "Дата следующего дня. " + calendar.get ( Calendar.DAY_OF_MONTH ) );
*/
        System.out.println ( "--------------------------------------------------------------" );
        System.out.println ( "Получить текущую дату, вывести дату, которая будет через 5 недель." );
        Calendar c = new GregorianCalendar ();
        c.setTimeInMillis ( System.currentTimeMillis () );
        c.add ( Calendar.WEEK_OF_MONTH, 5 );
        Date date = c.getTime ();
        System.out.println ( date );

        System.out.println ( "--------------------------------------------------------------" );
        System.out.println ( "Получить текущую дату, вывести дату, которая была 1 месяца назад." );
        Calendar c1 = new GregorianCalendar ();
        c.setTimeInMillis ( System.currentTimeMillis () );
        c.add ( Calendar.MONTH, -1 );
        Date date1 = c1.getTime ();
        System.out.println ( date1 );

        System.out.println ( "--------------------------------------------------------------" );
        System.out.println ( "Получить текущее время, вывести время, которое будет через 12 часов." );
        Calendar c2 = new GregorianCalendar ();
        c.setTimeInMillis ( System.currentTimeMillis () );
        c.add ( Calendar.HOUR_OF_DAY, 12 );
        Date date2 = c2.getTime ();
        System.out.println ( date2 );

        System.out.println ( "--------------------------------------------------------------" );
        System.out.println ( "Получить последний день текущего месяца." );
        Calendar cal = Calendar.getInstance ();
        cal.set ( Calendar.DATE, cal.getActualMaximum ( Calendar.DATE ) );
        Date endDay = cal.getTime ();
        System.out.println ( endDay.toString () );

        System.out.println ( "--------------------------------------------------------------" );
        System.out.println ( "Найти сколько дней осталось в этом году." );
        Date yearStartTime = new Date ();
        yearStartTime.setHours ( 24 );
        yearStartTime.setMinutes ( 1440 );
        yearStartTime.setSeconds ( 86400 );
        yearStartTime.setDate ( 31 );      // первое число
        yearStartTime.setMonth ( 12 );     // месяц январь, нумерация для месяцев 0-11
        Date currentTime = new Date ();
        long msTimeDistance = yearStartTime.getTime () - currentTime.getTime ();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках
        int dayCount = (int) (msTimeDistance / msDay); //количество целых дней
        System.out.println (  "Days from start of year: " + dayCount );
    }
}
