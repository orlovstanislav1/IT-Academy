package com.company.HW10;
/*
2)	Создать файл с текстом(не в коде), сделать для него частотный словарь, т.е. подсчитать
 количество вхождений каждого слова. Вывести результат на экран. При подсчете учитывать,
 что слова "Привет", "привет", "привет,"(с любыми знаками препинания) - это вхождения одного
  и того же слова. (Задание похоже на дз 8.4)
 */
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        File file = new File ( "D:/PROGRAMMING/Progi/java - project/ORLOV-STANISLAV/src/com/company/HW10/text2.txt" );
        Map<String, Integer> map1 = new HashMap<String, Integer> ();
        Scanner scanner = new Scanner ( file, "UTF8" );

        while (scanner.hasNextLine ()) {
            for (String str : scanner.nextLine ().split ( "\\s*(\\s|,|!|\\.|-|\\?|\"|:|;)\\s*" )) {
                String result = str.toLowerCase ();
                Integer count = map1.get ( result );
                map1.put ( result, (count == null) ? 1 : count + 1 );
            }
        }
        System.out.println ( "Частотный словарь: " + map1 );
        scanner.close ();
    }
}

