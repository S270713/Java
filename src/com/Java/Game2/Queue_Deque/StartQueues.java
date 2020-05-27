package com.Java.Game2.Queue_Deque;
//  Queue/Deque

import java.util.*;

public class StartQueues {
    public void queueDeque() {
        System.out.println("\nСитуация с очередностью у касс магазина:");
        Queue queue = new LinkedList();
        Queue queue2 = new PriorityQueue();
        Queue queue3 = new PriorityQueue();
        System.out.println("Касса 1:");
        queue.add("2");
        queue.add("3");
        queue.offer("1");
        while (queue.size() > 0) {
            System.out.print(queue.poll() + "  ");
        }
        System.out.println("Нарушение. В очереди нет порядка (не отсортирована), учитывая льготные категории.");

        System.out.println();
        System.out.println("Касса 2:");
        queue2.add(4);
        queue2.add(2);
        queue2.offer(1);
        queue2.offer(3);
        while (queue2.size() > 0) {
            System.out.print(queue2.poll() + "  ");
        }
        System.out.println();
        System.out.println("Касса 3:");
        queue3.add("1");
        queue3.add("3");
        queue3.offer("2");
        while (queue3.size() > 0) {
            System.out.print(queue3.poll() + "  ");
        }

        System.out.println("\nКасса 4:");
        System.out.println("(сортируем очередь через Collections.sort(list))");
        Queue queue4 = new LinkedList();
        queue4.add("1");
        queue4.add("3");
        queue4.offer("2");
        List list = (List) queue4;
        Collections.sort(list);
        while (queue4.size() > 0) {
            System.out.print(queue4.poll() + "  ");
        }

        System.out.println("\nЦентральная касса:");
        System.out.println("(ArrayDeque)");

        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        arrayDeque.add("client_1");
        arrayDeque.add("client_2");
        arrayDeque.add("client_3");
        arrayDeque.addFirst("client_4_Vip");
        arrayDeque.push("client_5_Vip");
        arrayDeque.addLast("client_6");
        arrayDeque.add("client_7");

        System.out.println("Выстроена очередь из обычных клиентов и ВИП-клиентов длинной: " + arrayDeque.size() + " человек.");
        System.out.println("Работаем с первым клиентом, но он остается стоять в очереди: " + arrayDeque.getFirst());
        System.out.println("Работаем с последним клиентом, но он остается стоять в очереди: " + arrayDeque.getLast());
        System.out.println("Вся очередь:");
        while (arrayDeque.size() > 0) {
            System.out.print(arrayDeque.poll() + "  ");
        }
    }
}