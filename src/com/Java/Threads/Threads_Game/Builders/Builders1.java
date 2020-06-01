package com.Java.Threads.Threads_Game.Builders;

import com.Java.Threads.Threads_Game.Exchange.Exchange;

//Класс - Застройщик1.
public class Builders1 implements Runnable {

    Exchange exchange;
    public Builders1(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            exchange.localBricksToBuilders1();
        }
        exchange.reportComplete(1);

    }
}