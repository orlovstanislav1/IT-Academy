package com.company.HW9;

import java.util.HashMap;
import java.util.Map;


public class TriangleException extends Exception {
    private final Map<String, Double> negativeSides = new HashMap<String, Double> ();

    public TriangleException(double sideA, double sideB, double sideC) {
        if (sideA <= 0) {
            negativeSides.put ( "side A", sideA );
        }
        if (sideB <= 0) {
            negativeSides.put ( "side B", sideB );
        }
        if (sideC <= 0) {
            negativeSides.put ( "side C", sideC );
        }
    }

    @Override
    public String toString() {
        if (negativeSides.isEmpty ()) {
            return "Такой треугольник не существует =(";
        } else {
            return "Отрицательная длина сторон(-ы): " + negativeSides.toString () + " не возможна =(";
        }
    }
}
