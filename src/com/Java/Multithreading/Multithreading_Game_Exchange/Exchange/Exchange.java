package com.Java.Multithreading.Multithreading_Game_Exchange.Exchange;
//Класс - Биржа.

public class Exchange {

    ExchangeSupport exchangeSupport = new ExchangeSupport();
    public ExchangeServer actualSection;
    public ExchangeServer sectionBricks = new ExchangeServer();
    public ExchangeServer sectionMetal = new ExchangeServer();

    Report report = new Report();
    Exchange exchange;
    public ExchangeServer exchangeServer = new ExchangeServer();
    //Метод - Производство
    public synchronized void workManufacturers(int numberSection) {
        //actualSection = exchangeSupport.chooseProduct(numberSection);
        switch (numberSection) {
            case 1001:
                actualSection = sectionBricks;
                break;
            case 1002:
                actualSection = sectionMetal;
                break;
        }

        while (actualSection.getAmountProducts() >= actualSection.limitWarehouse) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        Sleep.sleep();
        actualSection.setAmountProducts(1);
        report.printReport(actualSection);

        notifyAll();
    }
    //Метод - Потребители забирают товар с биржи .
    public synchronized void workConsumers(int numberSection) {
        //actualSection = exchangeSupport.chooseProduct(numberSection);
        switch (numberSection) {
            case 1001:
                actualSection = sectionBricks;
                break;
            case 1002:
                actualSection = sectionMetal;
                break;
        }

        while (actualSection.getAmountProducts() < 1) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        Sleep.sleep();
        actualSection.setAmountProducts(-1);
        report.printReport(actualSection);
        notifyAll();
    }
}