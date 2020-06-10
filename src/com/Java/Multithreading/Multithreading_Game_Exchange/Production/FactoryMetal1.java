package com.Java.Multithreading.Multithreading_Game_Exchange.Production;
// Класс - завод по производуству металлических конструкций.

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;

public class FactoryMetal1 extends Thread {

    Exchange exchange;
    public FactoryMetal1(Exchange exchange) {
        this.exchange = exchange;
    }

    int i = 1;
    public void run() {
        while(!isInterrupted()) {
            exchange.workManufacturers(1002);
            exchange.sectionMetal.setInfoFactoryMetal1(1);
            i++;
        }
    }
}