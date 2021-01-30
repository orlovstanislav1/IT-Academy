package com.company.HW16;

public class Confirmed implements State {

    @Override
    public void currentState() {
        System.out.println ( "Заказ на получение гранта ПОДТВЕРЖДЕН" );
    }


}
