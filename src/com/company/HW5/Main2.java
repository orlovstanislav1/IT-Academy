package com.company.HW5;

/* 1)	Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что слова
могут разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы,
но могут и отсутствовать. Знаки препинания в тексте отсутствуют.
*/

import java.io.IOException;

public class Main2 {
    public static void main(String[] args) throws IOException {
        String words = " ssdvsdv  sdsdvv      " +
                "  ";
        int count = 0;
        String[] data = words.split ( " " );
        for (String string : data) {
            if (!string.equals ( "" )) {
                count++;
            }
        }
        System.out.println ( count );
    }
}
