package com.Java.Multithreading.Multithreading_Game_Exchange.Exchange;
//Вспомогательный класс для функционирования биржи.

public class ExchangeSupport {
    ExchangeServer actualSection;

    //Идентификация продукта.
    public ExchangeServer chooseProduct(int numberSection, ExchangeServer sectionBricks, ExchangeServer sectionMetal) {
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