package com.Java.Game2.TwoQueue;

class Cashbox {
    int clientN = 1;
    public synchronized void workQueue1(String info) {
        while (clientN == 3) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        clientN++;
        System.out.println("Обслуживается: " + info);
        notify();
    }

    public synchronized void workQueue2(String info) {
        while (clientN == 1 || clientN ==2) {
            try {
                wait();
            }
            catch (InterruptedException e) {
            }
        }
        System.out.println("Обслуживается: " + info);
        if (clientN == 3) clientN = 1;
        notify();
    }
}