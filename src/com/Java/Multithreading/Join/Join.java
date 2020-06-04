package com.Java.Multithreading.Join;

public class Join extends Thread {
    public void run() {
        for (int i = 1; i < 8; i++) {
            System.out.println("Первый поток " + i);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}