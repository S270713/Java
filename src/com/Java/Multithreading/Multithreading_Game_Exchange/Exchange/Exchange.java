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

        if (actualSection == sectionBricks) {
            System.out.print("\033[32m \n   ПРОИЗВЕДЕН 1 кирпич       кирпичей  " + sectionBricks.getAmountProducts());
            System.out.print("  металла  " + sectionMetal.getAmountProducts());
            System.out.print("  актуального " + actualSection.getAmountProducts());
            System.out.println("   end "   + Thread.currentThread().getName());
        }


//        if (actualSection == sectionMetal) {
//            System.out.print("\n          test1 " + actualSection.getAmountProducts());
//            System.out.print("  test2 " + actualSection.getInfoFactoryMetal1());
//            System.out.print("  test3 " + actualSection.getBridges());
//            System.out.println("   end");
//        }


        actualSection.setAmountProducts(1);
        report.printReport(sectionBricks, sectionMetal);
        notifyAll();
    }


    //Метод - Потребители забирают товар с биржи .
    public synchronized void workConsumers(int numberSection) {
        actualSection = exchangeSupport.chooseProduct(numberSection, sectionBricks, sectionMetal);

        if (actualSection == sectionBricks) {
            System.out.print("\033[33m \n          кирпичей  " + sectionBricks.getAmountProducts());
            System.out.print("  металла  " + sectionMetal.getAmountProducts());
            System.out.print("  актуального " + actualSection.getAmountProducts());
            System.out.println("   end "   + Thread.currentThread().getName());
        }

        while (actualSection.getAmountProducts() < 1) {

            try {
                System.out.println("режим вайт включен  " + Thread.currentThread().getName());
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }

        System.out.println("режим вайт НЕ включен  " + Thread.currentThread().getName());

        Sleep.sleep();
        actualSection.setAmountProducts(-1);
        report.printReport(sectionBricks, sectionMetal);
        notifyAll();
    }
}