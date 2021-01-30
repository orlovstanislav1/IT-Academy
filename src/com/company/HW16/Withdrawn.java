package com.company.HW16;

public class Withdrawn implements State {

    @Override
    public void currentState() {
        System.out.println ( "Заказ на получение гранта ОТОЗВАН" );
    }
}
