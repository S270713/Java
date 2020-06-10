package com.Java.Multithreading.Multithreading_Game_Exchange.Builders;

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;
import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Report;

//Класс - Застройщик зданий 1.
public class BuilderBuildings1 extends Thread {

    Exchange exchange;
    public BuilderBuildings1(Exchange exchange) {
        this.exchange = exchange;
    }

    int i = 1;
    public void run() {
        Thread.currentThread().setName("BuilderBuildings1");
        while(!isInterrupted()) {
            exchange.workConsumers(1001);
            exchange.sectionBricks.setInfoFloors1(1);
            i++;
        }
    }
}