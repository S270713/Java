package com.Java.Multithreading.Multithreading_Game_Exchange.Builders;

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;
import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Report;

//Класс - Застройщик2.
public class BuilderBuildings2 extends Thread {

    Exchange exchange;
    public BuilderBuildings2(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        Thread.currentThread().setName("BuilderBuildings2");
        int i = 1;
        while(!isInterrupted()) {
            exchange.workConsumers(1001);
            exchange.sectionBricks.setInfoFloors2(1);
            i++;
        }
    }
}