package com.company.HW15;
/*
1)	Выполнить следующие пункты с DateTime API:
●	Получить текущую дату, вывести дату следующего дня.
●	Получить текущую дату, вывести дату, которая будет через 5 недель.
●	Получить текущую дату, вывести дату, которая была 2 месяца назад.
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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class DateTimeAPI_1 {
    public static void main(String[] args) {
        LocalDate nowData = LocalDate.now ();
        LocalTime nowTime = LocalTime.now ();
        LocalDateTime nowDataTime = LocalDateTime.now ();

        LocalDate plus1Day = nowData.plusDays ( 1 );
        System.out.println ( "Дата следующего дня: " + plus1Day );

        LocalDate plus5Weeks = nowData.plusWeeks ( 5 );
        System.out.println ( "Дата через 5 недель: " + plus5Weeks );

        LocalDate minus2Months = nowData.minusMonths ( 2 );
        System.out.println ( "Дата 2 месяца назад: " + minus2Months );

        LocalTime plus12Hours = nowTime.plusHours ( 12 );
        System.out.println ( "Время через 12 часов: " + plus12Hours );

        TemporalAdjuster lastDayOfMonth = TemporalAdjusters.lastDayOfMonth ();
        System.out.println ( "Последний день текущего месяца: " + nowData.with ( lastDayOfMonth ) );

        TemporalAdjuster lastDayOfYear = TemporalAdjusters.lastDayOfYear ();
        Period period = Period.between ( nowData, nowData.with ( lastDayOfYear ) ).normalized ();
        int days = period.getDays ();
        LocalDate plus = nowData.plus ( period );
        System.out.println ( "До конца года осталось: " + days + " дней и " + period.getMonths () + " месяцев" );
        System.out.println ( "Последний день в этом году: " + plus );

        System.out.println ( nowData.format ( DateTimeFormatter.ofPattern ( "MMMM dd yyyy", Locale.ENGLISH ) ) );

        System.out.println ( nowData.format ( DateTimeFormatter.ofPattern ( "dd MMM yyyy", Locale.ENGLISH ) ) );

        System.out.println ( nowData.format ( DateTimeFormatter.ofPattern ( "dd.MM.yyyy" ) ) );

        System.out.println ( nowDataTime.format ( DateTimeFormatter.ofPattern ( "dd.MM.yyyy HH:mm" ) ) );

        System.out.println ( nowDataTime.format ( DateTimeFormatter.ofPattern ( "M-dd-yyyy HH:mm:ss.SSS" ) ) );

        System.out.println ( nowDataTime.format ( DateTimeFormatter.ofPattern ( "dd.MM.yyyy HH-mm-ss" ) ) );
    }
}

