package com.Java.Game2.Discount.DataProductClient;
//Класс - ввода данных пользователем(выбор товара со скидками).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {
    private static String[] params;

    public String[] getParams() {
        return params;
    }

    public void input() throws IOException {
        //Ввод кодов товаров, набранных в корзину.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        params = reader.readLine().trim().toLowerCase().split(",");
    }
}