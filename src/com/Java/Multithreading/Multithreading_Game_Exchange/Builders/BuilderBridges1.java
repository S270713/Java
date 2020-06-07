package com.Java.Multithreading.Multithreading_Game_Exchange.Builders;
// Строительная компания по строительству мостов №1.

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;

public class BuilderBridges1 implements Runnable {

    Exchange exchange;
    public BuilderBridges1(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {//В процентах
            exchange.workManufacturers(1002);
            exchange.sectionMetal.setBridges(1);
        }
    }
}