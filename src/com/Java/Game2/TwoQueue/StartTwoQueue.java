package com.Java.Game2.TwoQueue;
//Многопоточность.

public class StartTwoQueue {
    public void startTwoQueue() {
        Cashbox cashbox = new Cashbox();
        Queue1 queue1 = new Queue1(cashbox);
        Queue2 queue2 = new Queue2(cashbox);
        System.out.println("\nОдна касса обслуживает две очереди (порядок - 2 человека из первой очереди, 1 - из второй):\n");
        new Thread(queue1).start();
        new Thread(queue2).start();
    }
}