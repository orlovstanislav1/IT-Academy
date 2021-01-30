package com.company.HW16;

/*
1)	Паттерн Composite. Разработать структуру данных для хранения информации о государствах,
их административных частях и городах.
С использованием паттерна Facade создать класс, с методами "добавить город в административную
часть", "добавить административную часть в государство", которые используют методы разработанных
ранее классов.
 */
public class Composite {
    public static void main(String[] args) {
        com.company.HW16.Country belarus = new com.company.HW16.Country ( "Беларусия" );

        com.company.HW16.AdminPart brestRegion = new com.company.HW16.AdminPart ( "Брестская область" );
        com.company.HW16.AdminPart grodnoRegion = new com.company.HW16.AdminPart ( "Гродненская область" );
        com.company.HW16.AdminPart minskRegion = new com.company.HW16.AdminPart ( "Минская область" );

        com.company.HW16.AdminPart baranovichiDistrict = new com.company.HW16.AdminPart ( "Барановичский район" );
        com.company.HW16.AdminPart pinskDistrict = new com.company.HW16.AdminPart ( "Пинский район" );
        com.company.HW16.AdminPart lidaDistrict = new com.company.HW16.AdminPart ( "Лидский район" );
        com.company.HW16.AdminPart kleckDistrict = new com.company.HW16.AdminPart ( "Клецкий район" );
        com.company.HW16.AdminPart minskDistrict = new com.company.HW16.AdminPart ( "Минский район" );

        com.company.HW16.Community minsk = new com.company.HW16.Community ( "Минск", 1_000_000 );
        com.company.HW16.Community baranovichi = new com.company.HW16.Community ( "Барановичи", 175_000 );
        com.company.HW16.Community pinsk = new com.company.HW16.Community ( "Пинск", 46_000 );
        com.company.HW16.Community grodno = new com.company.HW16.Community ( "Гродно", 356_900 );
        com.company.HW16.Community kleck = new com.company.HW16.Community ( "Клецк", 26_900 );

        belarus.add ( brestRegion );
        belarus.add ( grodnoRegion );
        belarus.add ( minskRegion );
        belarus.add ( minsk );

        brestRegion.add ( baranovichiDistrict );
        brestRegion.add ( pinskDistrict );

        minskRegion.add ( kleckDistrict );
        minskRegion.add ( minskDistrict );

        grodnoRegion.add ( lidaDistrict );
        grodnoRegion.add ( grodno );

        baranovichiDistrict.add ( baranovichi );
        pinskDistrict.add ( pinsk );
        kleckDistrict.add ( kleck );

        System.out.println ( belarus.name + " - " + belarus.countPopulation () );
        System.out.println ( brestRegion.name + " - " + brestRegion.countPopulation () );
    }
}
