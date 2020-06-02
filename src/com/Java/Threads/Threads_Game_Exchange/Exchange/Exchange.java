package com.Java.Threads.Threads_Game_Exchange.Exchange;
//Класс - Биржа.

public class Exchange {

    Report report = new Report();
    public static int bricks = 0;
    public static int limit = 3;//ограничения склада по кирпичам.


    public void setBricks(int bricks) {
        this.bricks = this.bricks + bricks;
    }
    public int getBricks() {
        return bricks;
    }

    private int infoFactory1 = 0;
    private int infoFactory2 = 0;
    private int infoFactory3 = 0;
    private int infoFloors1 = 0;
    private int infoFloors2 = 0;
    private int infoFloors3 = 0;

    public void setInfoFactory1(int infoFactory1) {
        this.infoFactory1 = this.infoFactory1 + infoFactory1;
    }
    public void setInfoFactory2(int infoFactory2) {
        this.infoFactory2 = this.infoFactory2 + infoFactory2;
    }
    public void setInfoFactory3(int infoFactory3) {
        this.infoFactory3 = this.infoFactory3 + infoFactory3;
    }

    public void setInfoFloors1(int infoFloors1) {
        this.infoFloors1 = this.infoFloors1 + infoFloors1;
    }
    public void setInfoFloors2(int infoFloors2) {
        this.infoFloors2 = this.infoFloors2 + infoFloors2;
    }
    public void setInfoFloors3(int infoFloors3) {
        this.infoFloors3 = this.infoFloors3 + infoFloors3;
    }

    //Метод - Производство кирпичей №1.
    public synchronized void localBricksFromFactory1() {
        while (bricks >= limit) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        Sleep.sleep();
        setInfoFactory1(1);
        setBricks(1);

        if ((System.currentTimeMillis() - report.lastTime) > report.periodTime) {
            report.printReport(bricks, infoFactory1, infoFactory2, infoFactory3, infoFloors1, infoFloors2, infoFloors3);
        }
        //setInfoFactory1(0);
        notifyAll();
    }

    //Метод - Производство кирпичей №2.
    public synchronized void localBricksFromFactory2() {
        while (bricks >= limit) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        Sleep.sleep();
        setInfoFactory2(1);
        setBricks(1);
        if ((System.currentTimeMillis() - report.lastTime) > report.periodTime) {
            report.printReport(bricks, infoFactory1, infoFactory2, infoFactory3, infoFloors1, infoFloors2, infoFloors3);
        }
        //setInfoFactory2(0);
        notifyAll();
    }

    //Метод - Производство кирпичей №3.
    public synchronized void localBricksFromFactory3() {
        while (bricks >= limit) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        Sleep.sleep();
        setInfoFactory3(1);
        setBricks(1);
        if ((System.currentTimeMillis() - report.lastTime) > report.periodTime) {
            report.printReport(bricks, infoFactory1, infoFactory2, infoFactory3, infoFloors1, infoFloors2, infoFloors3);
        }
        //setInfoFactory3(0);
        notifyAll();
    }

    //Метод - Застройщик1.
    public synchronized void localBricksToBuilders1() {
        while (bricks < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        Sleep.sleep();

        setBricks(-1);
        setInfoFloors1(1);
        if ((System.currentTimeMillis() - report.lastTime) > report.periodTime) {
            report.printReport(bricks, infoFactory1, infoFactory2, infoFactory3, infoFloors1, infoFloors2, infoFloors3);
        }
        notifyAll();
    }

    //Метод - Застройщик2.
    public synchronized void localBricksToBuilders2() {
        while (bricks < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        Sleep.sleep();

        setBricks(-1);
        setInfoFloors2(1);
        if ((System.currentTimeMillis() - report.lastTime) > report.periodTime) {
            report.printReport(bricks, infoFactory1, infoFactory2, infoFactory3, infoFloors1, infoFloors2, infoFloors3);
        }
        notifyAll();
    }

    //Метод - Застройщик3.
    public synchronized void localBricksToBuilders3() {
        while (bricks < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        Sleep.sleep();

        setBricks(-1);
        setInfoFloors3(1);
        if ((System.currentTimeMillis() - report.lastTime) > report.periodTime) {
            report.printReport(bricks, infoFactory1, infoFactory2, infoFactory3, infoFloors1, infoFloors2, infoFloors3);
        }
        notifyAll();
    }
}