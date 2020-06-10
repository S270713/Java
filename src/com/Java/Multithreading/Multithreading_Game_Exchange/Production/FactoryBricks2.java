package com.Java.Multithreading.Multithreading_Game_Exchange.Production;

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;

//Класс - Производство кирпичей №2.
public class FactoryBricks2 extends Thread {

    Exchange exchange;
    public FactoryBricks2(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        int i = 1;
        while(!isInterrupted()) {
            exchange.workManufacturers(1001);
            exchange.sectionBricks.setInfoFactory2(1);
            i++;
        }
    }
}