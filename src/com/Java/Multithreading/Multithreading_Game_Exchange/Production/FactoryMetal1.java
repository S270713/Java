package com.Java.Multithreading.Multithreading_Game_Exchange.Production;
// Класс - завод по производуству металлических конструкций.

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;

public class FactoryMetal1 implements Runnable {

    Exchange exchange;
    public FactoryMetal1(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 4; i++) {
            exchange.productionMetal1();
            exchange.exchangeServer.setInfoFactoryMetal1(1);
        }
    }
}