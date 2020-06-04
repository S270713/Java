package com.Java.Multithreading.Join;

public class Main {
    public static void main(String[] args) {
        Join join = new Join();
        Join2 join2 = new Join2();

        join2.start();

        try {
            join2.join();
        } catch (InterruptedException e) {}
        join.start();
    }
}