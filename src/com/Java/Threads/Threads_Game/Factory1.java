package com.Java.Threads.Threads_Game;

//Класс - Производство1.
public class Factory1 implements Runnable {
    Warehouse warehouse;
    Factory1(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void run() {
        for (int i = 1; i < 4; i++) {
            warehouse.bricksFromFactory1();
        }
    }
}