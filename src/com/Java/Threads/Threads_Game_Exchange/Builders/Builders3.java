package com.Java.Threads.Threads_Game_Exchange.Builders;

import com.Java.Threads.Threads_Game_Exchange.Exchange.Exchange;
import com.Java.Threads.Threads_Game_Exchange.Exchange.Report;

//Класс - Застройщик3.
public class Builders3 implements Runnable {

    Exchange exchange;
    public Builders3(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 11; i++) {
            exchange.localBricksToBuilders3();
        }
        Report.reportComplete(3);

    }
}