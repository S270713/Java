package com.Java.Threads.Threads_Game;

//Класс - Производство2.
public class Factory2 implements Runnable {
    Warehouse warehouse;
    Factory2(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void run() {
        for (int i = 1; i < 4; i++) {
            warehouse.bricksFromFactory2();
        }
    }
}