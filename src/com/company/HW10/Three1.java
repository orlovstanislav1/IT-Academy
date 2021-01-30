package com.company.HW10;

import java.io.File;
import java.util.Date;

/*
1)	Вывести полное дерево файлов выбранной папки на диске. Если файл является папкой, то
 открывать его и выводить файлы внутри него. В списке файлов выводить относительный путь к
  файлу (относительно выбранной папки), размер файла, дату последней модификации.
Пример вывода:
.\.idea\.gitignore, 184 bytes, Wed Nov 25 20:21:16 MSK 2020
...
.\out\production\test\com\hw6\WebSite.class, 287 bytes, Tue Dec 15 10:28:53 MSK 2020
.\out\production\test\META-INF\test.kotlin_module, 16 bytes, Tue Dec 15 10:28:52 MSK 2020
...
.\src\com\hw6\Main2.java, 574 bytes, Sat Dec 19 08:51:21 MSK 2020
.\src\com\hw6\VideoBlog.java, 293 bytes, Sun Dec 13 20:42:38 MSK 2020
.\src\com\hw6\WebSite.java, 70 bytes, Sun Dec 13 20:42:38 MSK 2020
.\test.iml, 437 bytes, Wed Nov 25 20:21:02 MSK 2020

Буду выводить ---- C:\WINDOWS\Fonts
 */
public class Three1 {
    public static void main(String[] args) {
        File folder = new File ( "C:/WINDOWS/Fonts" );
        for (File file : folder.listFiles ()) {
            long timestamp = folder.lastModified ();
            System.out.println ( "Последняя модификация файла : " + new Date ( timestamp ) );
            System.out.println ( "Имя файла : " + file.getName () ); //Возвращает только имя файла, без пути.
            System.out.println ( "Путь (директория) к текущему файлу, без самого имени: " + file.getParentFile () );
            //Возвращает только путь (директорию) к текущему файлу, без самого имени.
            System.out.println ( "Путь (директория) к текущему файлу, с именем: " + file.getAbsolutePath () );
            //Возвращает только путь (директорию) к текущему файлу, без самого имени.
            System.out.println ( "Размер файла : " + file.length () + " bytes" );
        }
    }
}
