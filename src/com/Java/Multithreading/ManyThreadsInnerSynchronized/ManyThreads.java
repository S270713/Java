package com.Java.Multithreading.ManyThreadsInnerSynchronized;

// Несколько потоков (одного обьекта) внутри синхронизированного метода.

public class ManyThreads {
    public static void main(String[] args) {
        Sync sync = new Sync();
        A thread1 = new A(sync);
        B thread2 = new B(sync);
        C thread3 = new C(sync);
        D thread4 = new D(sync);

        new Thread(thread1).start();
        new Thread(thread2).start();
        new Thread(thread3).start();
        new Thread(thread4).start();
        System.out.println("Основной поток main завершился.");
    }
}