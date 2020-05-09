package com.Java.Game2.Discount.DataProductClient;
// Класс - корзина покупателя с выбранным товаром по скидке.

import java.io.IOException;
import java.util.ArrayList;

public class BascetClient {
    private ArrayList<Integer> chooseCodes = new ArrayList();

    public void basketWithProducts() throws IOException {
        InputData inputData = new InputData();//Выбор товара со скидкамии (ввод данных).
        inputData.input();

        int codeInt;//Конвертация введенных номеров товара в тип Int
        for(String code : inputData.getParams()) {
            codeInt = Integer.parseInt(code);
            setChooseCodes(codeInt);
        }
    }

    public int getChooseCodes(int index) {
        return chooseCodes.get(index);
    }

    public void setChooseCodes(int product) {
        chooseCodes.add(product);
    }

    public void printBascet() {
        for(Object ob  : chooseCodes) {
            System.out.println(ob);
        }
    }

    public int bascetSize() {
        int sizeBascet = chooseCodes.size();
        return sizeBascet;
    }
}