package com.company.HW14;

/*
1.	Создать функциональный интерфейс с методом, который принимает Integer и String,
возвращает String. Создать экземпляр этого интерфейса с помощью лямбда-выражения, которое
добавляет в конец переданной строки пробел и переданный Integer.
 */
public class Main1 {
    public static void main(String[] args) {
        test ( 1, "String", (x, s) -> s + " " + x );
    }

    public static void test(int x, String s, MyFunction function) {
        System.out.println ( function.apply ( x, s ) );
    }

    @FunctionalInterface
    public interface MyFunction {
        String apply(Integer i, String s);
    }
}
