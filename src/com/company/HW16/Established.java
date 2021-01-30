package com.company.HW16;

public class Established implements State {

    @Override
    public void currentState() {
        System.out.println ( "Заказ на получение гранта СОЗДАН " );
    }
}

