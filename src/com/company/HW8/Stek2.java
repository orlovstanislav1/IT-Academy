package com.company.HW8;
/*
2)	Ввести число, занести его цифры в стек.
Вывести цифры числа в обратном порядке. Для стека использовать интерфейс
Deque и его реализацию LinkedList.
 */

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Stek2 {
    public static void main(String[] args) {
        System.out.println ( "Ввести число" );
        Scanner scan = new Scanner ( System.in );
        Integer numb = scan.nextInt ();
        scan.close ();

        Deque collection = new LinkedList ();

        for (int i = 0; numb != 0; i++) {
            int remainder = numb % 10;
            numb = numb / 10;
            collection.offerLast ( remainder );
        }
        Iterator iterator = collection.iterator ();
        while (iterator.hasNext ()) {
            System.out.print ( collection.poll () + " " );
        }
    }
}
