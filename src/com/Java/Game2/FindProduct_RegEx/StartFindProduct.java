package com.Java.Game2.FindProduct_RegEx;
//RegEx.  Специальные символы: []\|^$.?*+()

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartFindProduct {
    public void startFindProduct() {
        System.out.println("Клиент на автостоянке забыл, где стоит его автомобиль, и стоит около робота-автомата, который помогает клиентам найти автомобиль на стоянке:");
        System.out.println("Действия робота:");
        Pattern p = Pattern.compile("А342РК");
        Matcher m = p.matcher("Помоги найти машину с номером А342РК");
        while(m.find()) {
            System.out.print("Считываю номер из запроса:" + m.start() + " " + m.group() + " ");
        }
        System.out.println();

        Pattern p3 = Pattern.compile("\\+");
        Matcher m3 = p3.matcher("+22");
        while(m3.find()) {
            System.out.print("Нашел место машины, включаю лампочку над ней: " + m3.start() + " " + m3.group() + " ");
        }
        System.out.println();
    }
}