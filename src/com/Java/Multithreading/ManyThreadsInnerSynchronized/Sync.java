package com.Java.Multithreading.ManyThreadsInnerSynchronized;

class Sync {
    public synchronized void test() {
        try {
            System.out.println("Поток " + Thread.currentThread().getName() + " сейчас внутри синхронизированного метода.");
            wait(500);
        } catch(InterruptedException e) {}
        System.out.println("Начинает выходить поток " + Thread.currentThread().getName());
    }
}