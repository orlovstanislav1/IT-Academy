package com.company.HW10;

import java.io.*;

/*
3)	Создать файл(в коде), заполненный случайными целыми числами(DataOutput/InputStream).
Прочитать его и найти среднее арифметическое чисел из файла.
 */
public class File3 {
    public static void main(String[] args) throws IOException {
        File file = new File ( "D:/PROGRAMMING/Progi/java - project/ORLOV-STANISLAV/src/com/company/HW10/text3.txt" );
        file.createNewFile ();
        DataOutputStream dataOutput = new DataOutputStream ( new FileOutputStream ( file ) );
        DataInputStream dataInput = new DataInputStream ( new FileInputStream ( file ) );
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int numb = (int) (Math.random () * 10);
            sum += numb;
            dataOutput.writeInt ( numb );
        }
        for (int i = 0; i < 10; i++) {
            System.out.print ( dataInput.readInt () + " " );
            count += 1;
        }
        double average = sum / count;
        System.out.println ( "\nКоличество цифр: " + count + ", cреднее арифметичсекое: " + average );
        dataInput.close ();
    }
}
