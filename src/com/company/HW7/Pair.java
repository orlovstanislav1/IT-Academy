package com.company.HW7;
//3-я домашка
public class Pair<T, Z> {
    private T one;
    private Z two;

    public Pair(T one, Z two) {
        this.one = one;
        this.two = two;
    }

    public static void printChar(Pair<? extends CharSequence, ? extends CharSequence> pair) {
        System.out.println ( pair );
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public Z getTwo() {
        return two;
    }

    public void setTwo(Z two) {
        this.two = two;
    }

    @Override
    public String toString() {
        return one.toString () + " " + two.toString ();
    }
}