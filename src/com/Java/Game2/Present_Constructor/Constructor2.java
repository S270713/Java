package com.Java.Game2.Present_Constructor;

public class Constructor2 {
    int summa;
    Constructor2(int summa) {
        this.summa = summa;
        System.out.println("Стоимость всех покупок составила: ");
    }

    int number;
    String text;
    Constructor2(int number, String text) {
        this.number = number;
        this.text = text;
    }

    Constructor2(String text, int number) {
        this.text = text;
        this.number = number;
    }
}