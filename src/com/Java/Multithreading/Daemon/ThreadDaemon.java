package com.Java.Multithreading.Daemon;

public class ThreadDaemon extends Thread {
    public void run() {

        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(5);
            } catch (InterruptedException e) {}
            System.out.print ("b" + i + " ");
        }
    }
}