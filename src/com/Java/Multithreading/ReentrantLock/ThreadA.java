package com.Java.Multithreading.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

class ThreadA implements Runnable{
    ReentrantLock locker;
    ThreadA(ReentrantLock locker){
        this.locker = locker;
    }
    public void run() {
        locker.lock();// устанавливаем блокировку
        try { System.out.println(Thread.currentThread().getName() + " Зашел.");

            Thread.sleep(100);
        } catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(Thread.currentThread().getName() + "     Вышел.");
            locker.unlock();// снимаем блокировку
        }
    }
}