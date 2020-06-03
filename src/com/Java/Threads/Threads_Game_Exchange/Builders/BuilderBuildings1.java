package com.Java.Threads.Threads_Game_Exchange.Builders;

import com.Java.Threads.Threads_Game_Exchange.Exchange.Exchange;
import com.Java.Threads.Threads_Game_Exchange.Exchange.Report;

//Класс - Застройщик зданий 1.
public class BuilderBuildings1 implements Runnable {

    Exchange exchange;
    public BuilderBuildings1(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            exchange.localBricksToBuilders1();
            exchange.exchangeServer.setInfoFloors1(1);
            //exchange.setBricks(-1);
        }
        Report.reportComplete(1);

    }
}