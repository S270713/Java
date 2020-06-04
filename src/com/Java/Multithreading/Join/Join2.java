package com.Java.Multithreading.Join;

public class Join2 extends Thread {
    public void run() {
        for (int i = 1; i < 8; i++) {
            System.out.println("Второй поток " + i);

            try {
                Thread.sleep(60);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
}