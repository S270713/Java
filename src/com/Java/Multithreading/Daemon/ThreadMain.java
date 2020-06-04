package com.Java.Multithreading.Daemon;

public class ThreadMain extends Thread {
    public void run() {

        for (int i = 1; i <= 10; i++) {
            try {
                sleep(10);
            } catch (InterruptedException e) {}
            System.out.print ("a" + i + " ");
        }
    }
}