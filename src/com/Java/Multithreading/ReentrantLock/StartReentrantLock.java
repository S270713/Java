package com.Java.Multithreading.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class StartReentrantLock {
    public static void main(String[] args) {
        ReentrantLock locker = new ReentrantLock();//создание заглушки.
        Thread t1 = new Thread(new ThreadA(locker));
        Thread t2 = new Thread(new ThreadA(locker));
        Thread t3 = new Thread(new ThreadA(locker));
        t1.start();
        t2.start();
        t3.start();
    }
}