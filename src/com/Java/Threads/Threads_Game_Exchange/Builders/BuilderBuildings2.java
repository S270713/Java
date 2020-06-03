package com.Java.Threads.Threads_Game_Exchange.Builders;

import com.Java.Threads.Threads_Game_Exchange.Exchange.Exchange;
import com.Java.Threads.Threads_Game_Exchange.Exchange.Report;

//Класс - Застройщик2.
public class BuilderBuildings2 implements Runnable {

    Exchange exchange;
    public BuilderBuildings2(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            exchange.localBricksToBuilders1();
            exchange.exchangeServer.setInfoFloors2(1);
            //exchange.setBricks(-1);
        }
        Report.reportComplete(2);
    }
}