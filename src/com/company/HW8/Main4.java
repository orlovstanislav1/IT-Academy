package com.company.HW8;

/*
4)	Ввести текст с клавиатуры. Для текста создать – (коллекция )- Map,
где ключом будет слово, а значение – количество повторений этого слова в
тексте.  Можно использовать метод String.split для разделения строки на слова.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) throws IOException {
        System.out.println ( "Введи предложение" );
        BufferedReader x = new BufferedReader ( new InputStreamReader ( System.in ) );
        String title = x.readLine ();

        Map<String, Integer> map = new HashMap<String, Integer> ();
        for (String str : title.split ( " " )) {
            Integer count = map.get ( str );
            map.put ( str, (count == null) ? 1 : count + 1 );
        }
        System.out.println ( map );
    }
}
/*
В 4 задании можно еще так сделать:
for (String str : text.split(" ")) {
            map1.put(str, map1.getOrDefault(str,0) + 1);
        }
 */