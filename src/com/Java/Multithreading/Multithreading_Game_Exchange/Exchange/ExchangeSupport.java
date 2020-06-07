package com.Java.Multithreading.Multithreading_Game_Exchange.Exchange;
//Вспомогательный класс для функционирования биржи.

public class ExchangeSupport {
    public ExchangeServer actualSection;
    public ExchangeServer sectionBricks;
    public ExchangeServer sectionMetal;

    //Идентификация продукта.
    public ExchangeServer chooseProduct(int numberSection) {
        switch (numberSection) {
            case 1001:
                actualSection = sectionBricks;
                break;
            case 1002:
                actualSection = sectionMetal;
                break;
        }
        return actualSection;
    }
}