package com.Java.Threads.Threads_Game;

//Класс Склад.
class Warehouse{
    private int bricks = 0;
    private int limit = 3;//огр-я склада.
    private int quantityFloors1 = 0;
    private int quantityFloors2 = 0;
    Report report = new Report();

    //Метод - Производство1.
    public synchronized void bricksFromFactory1() {
        while (bricks >= limit) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        bricks++;
        report.setInfoFactory1(1);
        report.setInfoBricks(1);
        report.printReport();
        report.setInfoFactory1(0);

        notifyAll();
    }

    //Метод - Производство2.
    public synchronized void bricksFromFactory2() {
        while (bricks >= limit) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        bricks++;
        report.setInfoFactory2(1);
        report.setInfoBricks(1);
        report.printReport();
        report.setInfoFactory2(0);

        notifyAll();
    }

    //Метод - работа Застройщика1.
    public synchronized void bricksToBuilders1() {
        while (bricks < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        bricks--;

        report.setInfoFloors1(1);
        report.setInfoBricks(-1);
        report.printReport();

        notifyAll();
    }

    //Метод - работа Застройщика2.
    public synchronized void bricksToBuilders2() {
        while (bricks < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        bricks--;

        report.setInfoFloors2(1);
        report.setInfoBricks(-1);
        report.printReport();

        notifyAll();
    }
}