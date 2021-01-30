package com.company.HW8;

/*
3)	Элементы целочисленного массива записать в очередь. Написать функцию
извлечения элементов из очереди до тех пор, пока первый элемент очереди не
станет четным. 1, 3, 5, 6, 7, 9, 11
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class Arr3 {
    public static void main(String[] args) {
        Integer[] numb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Queue<Integer> collection = new PriorityQueue<Integer> ();
        for (int i = 0; i < numb.length; i++) {
            collection.offer ( numb[i] );
        }
        System.out.println ( collection );
        functionRetrieveItemsFromTheQueue ( collection );
    }

    static void functionRetrieveItemsFromTheQueue(Queue<Integer> collection) {
        for (int j = 0; j < collection.size (); j++) {
            int k = collection.element ();
            if (k % 2 != 0) {
                collection.poll ();
                continue;
            } else {
                break;
            }
        }
        System.out.println ( collection );
    }
}

/*
В 3 задании использовано PriorityQueue, вот это действительно неверно. Надо делать так Queue<Integer> queue = new LinkedList<>();
Queue - это очередь, а  PriorityQueue - это куча(Heap), она работает совсем не так, как очередь. Она зависит от приоритетов, инты будут извлекаться из нее в порядке возрастания.
Поэтому такой массив(где хоть одно число больше одного из последующих 7>5)
{1, 7, 5, 6, 7, 9, 11}
Приведет к такому результату:
[1, 6, 5, 7, 7, 9, 11]
[6, 7, 9, 11, 7]
 */