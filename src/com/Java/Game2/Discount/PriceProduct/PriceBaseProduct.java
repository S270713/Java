package com.Java.Game2.Discount.PriceProduct;
// Класс - базовая цена на товар со скидкой.
public class PriceBaseProduct {

    //Массив с базовыми ценами на товары. Каждая цена соответствует номеру(индексу) товара.
    private int [] listPrices = {10,20,30,40,50,60,70,80,90,100};

    public int getListPrices(int index) {
        return listPrices[index];
    }

    int priceProductCalc(int productIndex){
        return listPrices[productIndex];
    }
}