package com.Java.Threads.Threads_Game_Exchange.Production;

import com.Java.Threads.Threads_Game_Exchange.Exchange.Exchange;

//Класс - Производство кирпичей №3.
public class FactoryBricks3 implements Runnable {

    Exchange exchange;
    public FactoryBricks3(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            exchange.localBricksFromFactory3();
        }
    }
}