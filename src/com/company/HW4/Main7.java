package com.company.HW4;

//7)	Написать два цикла выполняющих миллион конкатенаций (сложений) строки
// “aaabbbccc”. Один с помощью String, другой с помощью StringBuilder.
// Вывести на экран время выполнения каждого цикла.
//Простейший способ засечь время - использовать System.currentTimeMillis();


public class Main7 {
    public static void main(String[] args) throws Exception {
        long start1 = System.currentTimeMillis ();
        String string1 = " aaabbbccc ";
        for (int i = 0; i < 999999; i++) {
            string1 = string1 + " aaabbbccc ";
        }
        System.out.println ( string1 );
        System.out.println ( System.currentTimeMillis () - start1 );

        long start2 = System.currentTimeMillis ();
        StringBuilder string2 = new StringBuilder ( " aaabbbccc " );
        for (int i = 0; i < 999999; ++i) {
            string2.append ( " aaabbbccc " );
        }
        System.out.println ( string2.toString () );
        System.out.println ( System.currentTimeMillis () - start2 );
    }
}




