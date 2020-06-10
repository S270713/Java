package com.Java.Multithreading.Multithreading_Game_Exchange.Builders;
// Строительная компания по строительству мостов №1.

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;

public class BuilderBridges1 extends Thread {

    Exchange exchange;
    public BuilderBridges1(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        Thread.currentThread().setName("BuilderBridges1");
        int i = 1;

        while (!isInterrupted()) {
            exchange.workConsumers(1002);
            exchange.sectionMetal.setBridges(1);
            i++;
        }
    }
}

