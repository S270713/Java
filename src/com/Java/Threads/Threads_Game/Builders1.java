package com.Java.Threads.Threads_Game;

//Класс - Застройщик1.
public class Builders1 implements Runnable {
    Warehouse warehouse;
    Builders1(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void run() {
        for (int i = 1; i < 4; i++) {
            warehouse.bricksToBuilders1();
        }
    }
}