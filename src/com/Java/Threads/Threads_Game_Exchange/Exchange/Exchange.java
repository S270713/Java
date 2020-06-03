package com.Java.Threads.Threads_Game_Exchange.Exchange;
//Класс - Биржа.

public class Exchange {
    Report report = new Report();
    public ExchangeServer exchangeServer = new ExchangeServer();
    //Метод - Производство кирпичей.
    public synchronized void localBricksFromFactory1() {
        while (exchangeServer.bricks >= exchangeServer.bricksLimitWarehouse) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        Sleep.sleep();
        exchangeServer.setBricks(1);
        report.printReport(exchangeServer.bricks, exchangeServer.getInfoFactory1(), exchangeServer.getInfoFactory2(), exchangeServer.getInfoFactory3(), exchangeServer.getInfoFloors1(), exchangeServer.getInfoFloors2(), exchangeServer.getInfoFloors3(), exchangeServer.getMetal(), exchangeServer.getBridges());
        notifyAll();
    }

    //Метод - Постройка зданий.
    public synchronized void localBricksToBuilders1() {
        while (exchangeServer.bricks < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        Sleep.sleep();
        exchangeServer.setBricks(-1);
        report.printReport(exchangeServer.bricks, exchangeServer.getInfoFactory1(), exchangeServer.getInfoFactory2(), exchangeServer.getInfoFactory3(), exchangeServer.getInfoFloors1(), exchangeServer.getInfoFloors2(), exchangeServer.getInfoFloors3(), exchangeServer.getMetal(), exchangeServer.getBridges());
        notifyAll();
    }

    //Метод - Производство металла для мостов.
    public synchronized void productionMetal1() {
        while (exchangeServer.getMetal() >= exchangeServer.getMetalLimitWarehouse()) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        Sleep.sleep();
        exchangeServer.setMetal(1);
        report.printReport(
                exchangeServer.bricks,
                exchangeServer.getInfoFactory1(),
                exchangeServer.getInfoFactory2(),
                exchangeServer.getInfoFactory3(),
                exchangeServer.getInfoFloors1(),
                exchangeServer.getInfoFloors2(),
                exchangeServer.getInfoFloors3(),
                exchangeServer.getMetal(),
                exchangeServer.getBridges()
        );
        notifyAll();
    }

    //Метод - Постройка мостов.
    public synchronized void productionBridge1() {
        while (exchangeServer.getMetal() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        Sleep.sleep();
        exchangeServer.setMetal(-1);
        report.printReport(
                exchangeServer.bricks,
                exchangeServer.getInfoFactory1(),
                exchangeServer.getInfoFactory2(),
                exchangeServer.getInfoFactory3(),
                exchangeServer.getInfoFloors1(),
                exchangeServer.getInfoFloors2(),
                exchangeServer.getInfoFloors3(),
                exchangeServer.getMetal(),
                exchangeServer.getBridges()
        );
        notifyAll();
    }
    

}