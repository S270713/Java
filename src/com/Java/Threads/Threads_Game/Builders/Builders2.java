package com.Java.Threads.Threads_Game.Builders;

import com.Java.Threads.Threads_Game.Exchange.Exchange;

//Класс - Застройщик2.
public class Builders2 implements Runnable {

    Exchange exchange;
    public Builders2(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            exchange.localBricksToBuilders2();
        }
        exchange.reportComplete(2);
    }
}