package com.company.HW3;

/*Проверьте, является ли введенное пользователем с клавиатуры натуральное число — простым
(не имеющим натуральных делителей, кроме себя самого и 1) . Постарайтесь не выполнять лишних действий
например, после того, как вы нашли хотя бы один нетривиальный делитель уже ясно, что число составное и проверку
продолжать не нужно). Также учтите, что наименьший делитель натурального числа n, если он вообще имеется,
обязательно располагается в отрезке [emails; √n].
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "Является ли введенное пользователем с клавиатуры натуральное число — простым" );
        System.out.println ( "Введите число " );
        int a = Integer.parseInt ( reader.readLine () );
        int i;
        for (i = 2; i < a; i++) {
            if (a % i == 0) {
                if (a == 1) {
                    System.out.println ( "Число " + a + " составное" );
                } else {
                    System.out.println ( "Число " + a + " простое " );
                }
            }
        }
    }
}




        /*

         */
