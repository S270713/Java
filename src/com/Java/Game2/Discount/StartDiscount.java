package com.Java.Game2.Discount;
//  Блок - Скиидки. Класс запуска блока - StartDiscount.

import com.Java.Game2.Discount.Tools.Messages;

import java.io.IOException;

public class StartDiscount {
    public void startDiscount() throws IOException {

        MainDiscount discountCalc = new MainDiscount();
        discountCalc.startCalc();

    }
}