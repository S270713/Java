package com.Java.Threads.Threads_Game.Production;

import com.Java.Threads.Threads_Game.Exchange.Exchange;

//Класс - Производство кирпичей №2.
public class FactoryBricks2 implements Runnable {

    Exchange exchange;
    public FactoryBricks2(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            exchange.localBricksFromFactory2();
        }
    }
}