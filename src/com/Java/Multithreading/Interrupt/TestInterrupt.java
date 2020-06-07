package com.Java.Multithreading.Interrupt;

public class TestInterrupt {
    public static void main(String[] args) {
        ThreadA t = new ThreadA();
        t.start();
        try {
            Thread.sleep(50);
            t.interrupt();
        } catch (InterruptedException e) {}
    }
}