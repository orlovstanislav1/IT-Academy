package com.company.HW6.EX_2_Interface;

public class Magazine implements MassMedia {
    private final int numberOfSubscribers; //количество подписчиков
    private int specialEdition; //дополнительный номер журнала

    public Magazine(int numberOfSubscribers) {
        this.numberOfSubscribers = numberOfSubscribers;
    }

    public void specialEditionVIP() {
        if (numberOfSubscribers <= 100) {
            specialEdition = 1;
            System.out.println ( specialEdition + " выпускаем один дополнительный VIP номер" );
        } else {
            System.out.println ( specialEdition + "выпускаем сто дополнительных VIP номеров" );
        }
    }

    @Override
    public void frequencyOfNewsRelease() {
        System.out.println ( "раз в месяц выходит новый журнал" );
    }

    @Override
    public void numberOfSubscribers() {
        System.out.println ( "количество подписчиков - 1000" );
    }
}
