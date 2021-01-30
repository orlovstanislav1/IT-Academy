package com.company.HW7;

/*
4 - Создать generic class, который хранит массив элементов любого типа,
не делать геттеры и сеттеры для массива. Добавить методы: возвращение длины
массива, получения элемента по индексу, установки значения элемента по индексу.
 */
public class Main4 {

    public static void main(String[] args) {
        GenericClass genericClass1 = new GenericClass ( 10, 1 );

        genericClass1.getLength ();
        genericClass1.getIndexElement ();
        genericClass1.setElementString ();
    }
}
