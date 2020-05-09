package com.Java.Game2.Discount;
//  Блок - Скиидки. Класс запуска блока - StartDiscount.

import com.Java.Game2.Discount.Tools.Messages;

import java.io.IOException;

//Подключть к центральному блоку и дотестировать.

public class StartDiscount {
    public static void main(String[] args) throws IOException {

        Messages messages = new Messages();
        messages.printMessages();

        MainDiscount discountCalc = new MainDiscount();
        discountCalc.startCalc();

    }
}