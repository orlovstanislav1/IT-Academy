package com.company.HW7;
/*
4 - Создать generic class, который хранит массив элементов любого типа,
не делать геттеры и сеттеры для массива. Добавить методы: возвращение длины
массива, получения элемента по индексу, установки значения элемента по индексу.
 */

import java.util.Scanner;

public class GenericClass<T> {
    private final T[] toArray;
    private final int getIndex;

    public GenericClass(int length, int getIndex) {
        this.getIndex = getIndex;
        this.toArray = (T[]) new Object[length];
    }

    public void getLength() {
        int arrLen = toArray.length;
        System.out.println ( "Длинна массива - " + arrLen );
    }

    public void getIndexElement() {
        if (getIndex >= 0 && getIndex < toArray.length) {
            System.out.println ( "В данный момент GenericClass [" + getIndex + "] - " + toArray[getIndex] );
        } else {
            System.out.println ( "Заданный индекс не входит в массив! =(" );
        }
    }

    public void setElementString() {
        System.out.println ( "Введите элемент массива:" );
        Scanner scan1 = new Scanner ( System.in );
        String elInd = scan1.next ();
        toArray[getIndex] = (T) elInd;
        System.out.println ( "GenericClass [" + getIndex + "] - " + toArray[getIndex] );
    }
}
