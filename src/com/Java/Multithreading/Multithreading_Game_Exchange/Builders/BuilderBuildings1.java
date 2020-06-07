package com.Java.Multithreading.Multithreading_Game_Exchange.Builders;

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;
import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Report;

//Класс - Застройщик зданий 1.
public class BuilderBuildings1 implements Runnable {

    Exchange exchange;
    public BuilderBuildings1(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 101; i++) {
            exchange.workConsumers(1001);
            exchange.sectionBricks.setInfoFloors1(1);
        }
    }
}