package com.Java.Threads.Threads_Game;

//Класс - Застройщик2.
public class Builders2 implements Runnable {
    Warehouse warehouse;
    Builders2(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void run() {
        for (int i = 1; i < 4; i++) {
            warehouse.bricksToBuilders2();
        }
    }
}