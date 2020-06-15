package com.Java.Multithreading.Multithreading_Game_Exchange.Exchange;
//Класс - Биржа.

public class Exchange {
    public ExchangeServer actualSection;
    public ExchangeServer sectionBricks = new ExchangeServer();
    public ExchangeServer sectionMetal = new ExchangeServer();
    Report report = new Report();
    Exchange exchange;
    public ExchangeServer exchangeServer = new ExchangeServer();
    ExchangeSupport exchangeSupport = new ExchangeSupport();

    //Метод - Производство
    public synchronized void workManufacturers(int numberSection) {
        actualSection = exchangeSupport.chooseProduct(numberSection, sectionBricks, sectionMetal);

        while (actualSection.getAmountProducts() >= actualSection.limitWarehouse) {

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        Sleep.sleep();

        actualSection.setAmountProducts(1);
        report.printReport(sectionBricks, sectionMetal);
        notifyAll();
    }


    //Метод - Потребители забирают товар с биржи .
    public synchronized void workConsumers(int numberSection) {
        actualSection = exchangeSupport.chooseProduct(numberSection, sectionBricks, sectionMetal);

        while (actualSection.getAmountProducts() < 1) {

            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }

        Sleep.sleep();
        actualSection.setAmountProducts(-1);
        report.printReport(sectionBricks, sectionMetal);
        notifyAll();
    }
}