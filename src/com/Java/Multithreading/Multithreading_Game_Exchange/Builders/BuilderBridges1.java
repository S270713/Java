package com.Java.Multithreading.Multithreading_Game_Exchange.Builders;
// Строительная компания по строительству мостов №1.

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;
import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Report;

public class BuilderBridges1 extends Exchange implements Runnable {

    Exchange exchange;
    public BuilderBridges1(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 4; i++) {//Количество пролетов одного моста.
            exchange.workManufacturers(1002);
            exchange.sectionMetal.setBridges(1);
            //exchange.workManufacturers(sectionMetal);
            //exchange.sectionMetal.setBridges(1);

        }
        Report.reportCompleteBridge(3);

    }
}
