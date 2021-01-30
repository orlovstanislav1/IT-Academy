package com.company.HW5;

/* 1)	Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что слова
могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы,
но могут и отсутствовать. Знаки препинания в тексте отсутствуют.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "Введите с клавиатуры текст, программа посчитает сколько Вы ввели слов" );
        String s = reader.readLine ();

        int count = 0;
        int length = s.length () - 1;
        char space = ' ';

        for (int i = length; i >= 0; i--) {
            char c = s.charAt ( i );
            if (c != space && space == ' ') {
                count++;
            }
            space = c;
        }
        System.out.println ( "Вы ввели " + count + " слов");
    }
}

/*
1) В 1 задании, вываливается исключение StringIndexOutOfBoundsException,
если в конце строки пробел. Оно в этом месте a.charAt ( i + 1 ), потому что i+1
для последнего символа = a.length(). Если строка начинается с нескольких пробелов,
то в результате выводится не одно слово больше, чем на самом деле.

Можешь исправить эти проблемы или решить задачу по-другому. Можно решить задачу проще,
если использовать метод a.split(String regex), а в качестве разделителя regex
использовать регулярное выражение, обозначающее 1 или более пробелов.
Для удаления пробелов в начале и конце строки можно заранее использовать a.trim().
 */