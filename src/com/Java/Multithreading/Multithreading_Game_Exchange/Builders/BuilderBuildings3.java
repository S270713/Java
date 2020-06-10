package com.Java.Multithreading.Multithreading_Game_Exchange.Builders;

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;
import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Report;

//Класс - Застройщик3.
public class BuilderBuildings3 extends Thread {

    Exchange exchange;
    public BuilderBuildings3(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        Thread.currentThread().setName("BuilderBuildings3");
        int i = 1;
        while(!isInterrupted()) {

            exchange.workConsumers(1001);
            exchange.sectionBricks.setInfoFloors3(1);
            i++;
        }
    }
}