package com.Java.Multithreading.Daemon;

public class WorkDaemon {
    public static void main(String[] args) {
        ThreadMain ob1 = new ThreadMain();
        ob1.start();

        ThreadDaemon ob2 = new ThreadDaemon();
        ob2.setDaemon(true);
        ob2.start();
    }
}