package com.Java.Multithreading.Multithreading_Game_Exchange.Production;

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;

//Класс - Производство кирпичей №2.
public class FactoryBricks2 implements Runnable {

    Exchange exchange;
    public FactoryBricks2(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 101; i++) {

            exchange.workManufacturers(5);
            exchange.sectionBricks.setInfoFactory2(1);
            //exchange.setBricks(1);
        }
    }
}