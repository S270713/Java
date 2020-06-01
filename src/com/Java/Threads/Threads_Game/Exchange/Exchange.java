package com.Java.Threads.Threads_Game.Exchange;
//Класс - Биржа.

public class Exchange {

    public static int bricks = 0;
    public static int limit = 3;//ограничения склада по кирпичам.
    long lastTime = System.currentTimeMillis();
    long periodTime = 300;

    public void setBricks(int bricks) {
        this.bricks = this.bricks + bricks;
    }

    private int infoFactory1 = 0;
    private int infoFactory2 = 0;
    private int infoFloors1 = 0;
    private int infoFloors2 = 0;

    public void setInfoFactory1(int infoFactory1) {
        this.infoFactory1 = infoFactory1;
    }
    public void setInfoFloors1(int infoFloors1) {
        this.infoFloors1 = this.infoFloors1 + infoFloors1;
    }
    public void setInfoFactory2(int infoFactory2) {
        this.infoFactory2 = infoFactory2;
    }
    public void setInfoFloors2(int infoFloors2) {
        this.infoFloors2 = this.infoFloors2 + infoFloors2;
    }

    public synchronized void localBricksFromFactory1() {
        while (bricks >= limit) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setInfoFactory1(1);
        setBricks(1);
        if ((System.currentTimeMillis() - lastTime) > periodTime) {
            printReport();
        }
        setInfoFactory1(0);
        notifyAll();
    }

    public synchronized void localBricksFromFactory2() {
        while (bricks >= limit) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setInfoFactory2(1);
        setBricks(1);
        if ((System.currentTimeMillis() - lastTime) > periodTime) {
            printReport();
        }
        setInfoFactory2(0);
        notifyAll();
    }

    public synchronized void localBricksToBuilders1() {
        while (bricks < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setBricks(-1);
        setInfoFloors1(1);
        if ((System.currentTimeMillis() - lastTime) > periodTime) {
            printReport();
        }
        notifyAll();
    }

    public synchronized void localBricksToBuilders2() {
        while (bricks < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setBricks(-1);
        setInfoFloors2(1);
        if ((System.currentTimeMillis() - lastTime) > periodTime) {
            printReport();
        }
        notifyAll();
    }

    //Отчетность:
    public void printReport() {
        System.out.println("Exchange: " + bricks + ";   1house: " + infoFloors1 + ";   2house: " + infoFloors2 + ". Прошелший период - " + (System.currentTimeMillis() - lastTime));
        lastTime = System.currentTimeMillis();
    }
    public void reportComplete(int number) {
        System.out.println("Здание " + number + " построено");
    }
}