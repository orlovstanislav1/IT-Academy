package com.company.HW6.EX_1;

/*
1) Создать класс Дом, который содержит список помещений, а именно квартир и офисов, в нем, информацию о владельце, годе постройки и количестве этажей.
●	Помещения реализуют интерфейс Rentable с методами rent (сдать в аренду) и receiveRentalPayment (получить арендную плату)
●	Класс Квартира содержит список комнат в квартире(bathroom, living room),  количество жильцов, номер помещения, номер этажа, номер подъезда, стоимость аренды квартиры в месяц. Комнаты заданы с помощью enum.
●	Класс Офис содержит название фирмы, владелец фирмы, номер помещения, номер этажа, номер подъезда, количество работников, стоимость аренды офиса в месяц.
●	Написать метод для подсчета отдельно квартир и офисов в доме.
●	Написать метод, подсчитывающий, сколько воды в день тратит данный дом в среднем, если считать, что жилец тратит 200 л воды, а работник 10 л воды в день.
●	Написать метод, подсчитывающий доход со всех помещений в месяц.

 */

public class Main {
    public static void main(String[] args) {
        Room[] rooms = {Room.BATHROOM, Room.KITCHEN, Room.LIVING_ROOM};
        Apartment apartment = new Apartment ( 1, 2, 3, 4, 5,rooms );
        Office office = new Office ( 6, 7, 8, 9, 10, "трэвэлбай", "убегай" );
        office.rent ();
        Premises[] premises = {apartment, office};
        Home home = new Home ( premises, "рбк", 11, 12 );
        apartment.rent ();
        System.out.println ( home.getCountOffices () + " офисов" );
        System.out.println ( home.getCountApartmets () + " квартир" );
        System.out.println ( "Доход составит " + home.getTotalCostForRent ()+ " руб. ");
        System.out.println ( home.getAllWaterHouse () + " литров воды (в среднем) в день тратит данный дом " );
    }
}