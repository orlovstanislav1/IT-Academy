package com.company.HW3;

/*Создать класс Reactangle,
*/

import java.util.Scanner;

public class Main555 {
    public static void main(String[] args) throws Exception {
        int j = 2;
        int a = 0;
        int b = 0;
        Scanner reader = new Scanner ( System.in );
        System.out.println ( "Please enter a number: " );
        b = reader.nextInt ();
        while (j <= b / 2) {
            if (b % j == 0) {
                a = 1;
            }
            j++;
        }
        if (a == 1) {
            System.out.println ( "Число " + b + " составное" );
        } else {
            System.out.println ( "Число " + b + " простое " );
        }
    }
}
/*

 */
