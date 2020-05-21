package com.Java.Game2.Present_Constructor;
//Работа с конструкторами.
//Покупка подарков.

public class StartPresent_Constructor {
    public void StartPresent() {

        System.out.println();
        System.out.println("Информация о купленных к празднику подарках:");
        Constructor purchase1 = new Constructor("набор кастрюль");
        Constructor purchase2 = new Constructor("набор сковородок", 5);
        Constructor purchase3 = new Constructor("набор ножей", 15, "зеленый.");

        System.out.println("Ивановы купили в подарок друзьям " + purchase1.nameObject + " (любой).");
        System.out.println("Петровы купили в подарок друзьям " + purchase2.nameObject + ", состоящий из " + purchase2.numberItems + " элементов.");
        System.out.println("Сидоровы купили в подарок друзьям " + purchase3.nameObject + ", состоящий из " + purchase3.numberItems + " элементов. Цвет - " + purchase3.color);

        System.out.println();
        Constructor infoPurchases = new Constructor();
        System.out.println("Общее количество купленных подарков: " + infoPurchases.countPresents);

        System.out.println();
        Constructor2Descendant summaPurchases = new Constructor2Descendant(9900);
        System.out.println(summaPurchases.summa);

        System.out.println();
        Constructor2 text1 = new Constructor2(31, "Поздравляем с наступающим Новым Годом! Сегодня: ");
        Constructor2 text2 = new Constructor2("Ждем вас в ", 2021);
        System.out.println(text1.text + text1.number);
        System.out.println(text2.text + text2.number + " году!");

    }
}