package com.Java.Game2.Discount;
// Основной расчетный класс.

import com.Java.Game2.Discount.DataProductClient.BascetClient;
import com.Java.Game2.Discount.PriceProduct.PriceBaseProduct;
import com.Java.Game2.Discount.SizeDiscount.SizeDiscountLocalShop;
import com.Java.Game2.Discount.Tools.Messages;

import java.io.IOException;

public class MainDiscount {
    BascetClient bascetClient = new BascetClient();
    double SummaEnd;
    double product1BasePrice;
    double product2BasePrice;
    double product3BasePrice;

    void startCalc() throws IOException {

        Messages messages = new Messages();
        messages.printMessages();

        //Вызов метода работы с данными от клиента (корзина/заказ).
        bascetClient.basketWithProducts();
        PriceBaseProduct priceBaseProduct = new PriceBaseProduct();

        switch (bascetClient.bascetSize()) {
            case(1):
                product1BasePrice = priceBaseProduct.getListPrices(bascetClient.getChooseCodes(0) - 1);
                costing(product1BasePrice);
                break;
            case(2):
                product1BasePrice = priceBaseProduct.getListPrices(bascetClient.getChooseCodes(0) - 1);
                product2BasePrice = priceBaseProduct.getListPrices(bascetClient.getChooseCodes(1) - 1);
                costing(product1BasePrice, product2BasePrice);
                break;
            case(3):
                product1BasePrice = priceBaseProduct.getListPrices(bascetClient.getChooseCodes(0) - 1);
                product2BasePrice = priceBaseProduct.getListPrices(bascetClient.getChooseCodes(1) - 1);
                product3BasePrice = priceBaseProduct.getListPrices(bascetClient.getChooseCodes(2) - 1);
                costing(product1BasePrice, product2BasePrice, product3BasePrice);
                break;
        }
        messages.summaEnd(SummaEnd);
    }

    //Перегруженные методы с разным количеством параметров
    SizeDiscountLocalShop sizeDiscountLocalShop = new SizeDiscountLocalShop();

    void costing(double product1BasePrice) {
        double product1Discount = sizeDiscountLocalShop.product1_CalcActualDiscount();
        SummaEnd = (product1BasePrice) / 100 * (100 - product1Discount);
    }

    void costing(double product1BasePrice, double product2BasePrice) {
        double product2Discount = sizeDiscountLocalShop.product2_CalcActualDiscount();
        SummaEnd = (product1BasePrice + product2BasePrice) / 100 * (100 - product2Discount);
    }

    void costing(double product1BasePrice, double product2BasePrice, double product3BasePrice) {
        double product3Discount = sizeDiscountLocalShop.product3_CalcActualDiscount();
        SummaEnd = (product1BasePrice + product2BasePrice + product3BasePrice) / 100 * (100 - product3Discount);
    }
}