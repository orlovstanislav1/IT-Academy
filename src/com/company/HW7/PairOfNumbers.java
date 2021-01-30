package com.company.HW7;
//3-я задача
public class PairOfNumbers<T extends Number> extends Pair<T, T> {
    T object1 = getOne ();
    T object2 = getTwo ();

    public PairOfNumbers(T one, T two) {
        super ( one, two );
    }

    public double sum() {
        return object1.doubleValue () + object2.doubleValue ();
    }

    public T largerItem() {
        if (object1.doubleValue () > object2.doubleValue ())
            return object1;
        else
            return object2;
    }
}
