package com.company.HW3;

//emails.	Посчитать сумму цифр числа 7893823445 с помощью цикла do while.

public class Main22 {
    public static void main(String[] args) {
        long x = 7893823445l;
        int sum = 0;
        do {
            sum += x % 10;
            x /= 10;
        }
        while (x != 0);
        System.out.println ( "сумма цифр числа  = " + sum );
    }
}
