package com.Java.Multithreading.Multithreading_Game_Exchange.Production;

import com.Java.Multithreading.Multithreading_Game_Exchange.Exchange.Exchange;

//Класс - Производство кирпичей №1.
public class FactoryBricks1 implements Runnable {


    Exchange exchange;
    public FactoryBricks1(Exchange exchange) {
        this.exchange = exchange;
    }

    public void run() {
        for (int i = 1; i < 101; i++) {
            exchange.workManufacturers(1001);
            exchange.sectionBricks.setInfoFactory1(1);
            //System.out.println("    2test" + sectionBricks.getInfoFactory1());
        }
    }
}