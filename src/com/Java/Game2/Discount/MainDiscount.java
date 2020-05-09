package com.Java.Game2.Discount;
// Основной расчетный класс.

import com.Java.Game2.Discount.DataProductClient.BascetClient;
import com.Java.Game2.Discount.PriceProduct.PriceBaseProduct;
import com.Java.Game2.Discount.SizeDiscount.SizeDiscountLocalShop;

import java.io.IOException;

public class MainDiscount {
    BascetClient bascetClient = new BascetClient();

    void startCalc() throws IOException {

        //Вызов метода работы с данными от клиента (корзина/заказ).
        bascetClient.basketWithProducts();
        PriceBaseProduct priceBaseProduct = new PriceBaseProduct();

        double product1BasePrice = priceBaseProduct.getListPrices(bascetClient.getChooseCodes(0) - 1);
        double product2BasePrice = priceBaseProduct.getListPrices(bascetClient.getChooseCodes(1) - 1);
        double product3BasePrice = priceBaseProduct.getListPrices(bascetClient.getChooseCodes(2) - 1);

        switch (bascetClient.bascetSize()) {
            case(1):
                costing(product1BasePrice);
                break;
            case(2):
                costing(product1BasePrice, product2BasePrice);
                break;
            case(3):
                costing(product1BasePrice, product2BasePrice, product3BasePrice);
                break;
        }
    }

    //Перегруженные методы с разным количеством параметров
    SizeDiscountLocalShop sizeDiscountLocalShop = new SizeDiscountLocalShop();

    void costing(double product1BasePrice) {
        double product1Discount = sizeDiscountLocalShop.product1_CalcActualDiscount();
        double SummaEnd = (product1BasePrice) / 100 * (100 - product1Discount);
        System.out.println("Итоговая стоимость вашей покупки товаров со скидкой составила: " + SummaEnd);
    }

    void costing(double product1BasePrice, double product2BasePrice) {
        double product2Discount = sizeDiscountLocalShop.product2_CalcActualDiscount();
        double SummaEnd = (product1BasePrice + product2BasePrice) / 100 * (100 - product2Discount);
        System.out.println("Итоговая стоимость вашей покупки товаров со скидкой составила: " + SummaEnd);
    }

    void costing(double product1BasePrice, double product2BasePrice, double product3BasePrice) {
        double product3Discount = sizeDiscountLocalShop.product3_CalcActualDiscount();
        double SummaEnd = (product1BasePrice + product2BasePrice + product3BasePrice) / 100 * (100 - product3Discount);
        System.out.println("Итоговая стоимость вашей покупки товаров со скидкой составила: " + SummaEnd);
    }
}