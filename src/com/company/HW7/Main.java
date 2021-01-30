package com.company.HW7;
/*
3) Создать generic класс Pair, который может хранить 2 объекта любых двух разных типов, имеет геттеры и сеттеры для них.
●	Унаследовать от этого класса класс PairOfNumbers, который хранит 2 объекта одного числового типа(в Java от Number унаследованы все числа:Integer, Double...).
●	В нем добавить методы double sum(), который складывает значения 2 чисел, и метод T largerItem(), который возвращает элемент с большим значением. (При сравнении и сложении можно использовать Number.doubleValue()).
●	Создать статический метод, который принимает Pair из двух объектов, которые реализуют интерфейс CharSequence (к ним относятся String, StringBuilder, StringBuffer) и выводит их на консоль.
●	В main проверить работу этих классов и создать анонимный класс от Pair, хранящий 2 объекта Boolean, в нем добавить метод and, который будет выполнять операцию && над объектами, и сразу вызвать его и вывести полученное значение.
Пример вызова сразу:
int perimeterValue = new Shape(){
          public int perimeter(){
              return 3;
          }
        }.perimeter();

 */

public class Main {

    public static void main(String[] args) {

        com.company.HW7.PairOfNumbers<Double> pairOfNumbers = new PairOfNumbers<Double> ( 10.0, 20.0 );

        System.out.println ( pairOfNumbers.largerItem () );

        System.out.println ( pairOfNumbers.sum () );

        com.company.HW7.Pair.printChar ( new com.company.HW7.Pair<> ( "один", "два" ) );

        boolean a = new Pair<Boolean, Boolean> ( true, false ) {
            public boolean and() {
                return getOne () && getTwo ();
            }
        }.and ();
        System.out.println ( a );
    }
}
