package com.Java.Multithreading.Interrupt;

class ThreadA extends Thread {
    public void run() {
        System.out.println ("Поток запущен...");
        while (!isInterrupted()) {
            System.out.print (".");
        }
        System.out.println ("\nПоток завершен...");
    }
}