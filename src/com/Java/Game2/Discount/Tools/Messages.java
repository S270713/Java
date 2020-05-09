package com.Java.Game2.Discount.Tools;

public class Messages {

    public void printMessages() {
        System.out.println("Выберите товары по акции. Коды товаров по акции от 1 до 10.");
        System.out.println("Цена товара соответственно 10, 20, 30 ... 100 рублей.");
        System.out.println("Чем больше выбранного товара, тем больше скидка.");
        System.out.println("В вашем магазине свои скидки, за их отсутствием - используются скидки центрального магазина");
        System.out.println("Максимальное кол-во товаров - 3 единицы.");
        System.out.println("Введите через запятые коды товаров в формате: 1,1,2");
    }
}