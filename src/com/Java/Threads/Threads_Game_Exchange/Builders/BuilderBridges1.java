package com.Java.Threads.Threads_Game_Exchange.Builders;
// Строительная компания по строительству мостов №1.

import com.Java.Threads.Threads_Game_Exchange.Exchange.Exchange;
import com.Java.Threads.Threads_Game_Exchange.Exchange.Report;

public class BuilderBridges1 implements Runnable {

    Exchange exchange;
    public BuilderBridges1(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 4; i++) {//Количество пролетов одного моста.
            exchange.productionBridge1();
            exchange.exchangeServer.setBridges(1);

        }
        Report.reportCompleteBridge(3);

    }
}
