package com.Java.Game2.InputData;
//Описываем объекты-магазины.

import com.Java.Game2.Objects.Shop;

import java.util.TreeSet;

public class PropertiesShops {

    public void allShops() {
        TreeSet<Shop> listShops = new TreeSet<Shop>();
        Shop Shop1 = new Shop("Alpha", 200, 4000, 3200, true);
        Shop Shop2 = new Shop("Betta", 400, 20000, 1400, false);
        Shop Shop3 = new Shop("Gamma", 50, 500, 9700, true);

        listShops.add(Shop1);
        listShops.add(Shop2);
        listShops.add(Shop3);

        System.out.println("Список магазинов для поездки сегодня (отсортированы по площади):");
        for (Shop ob : listShops) {
            System.out.println(ob);
        }
    }
}