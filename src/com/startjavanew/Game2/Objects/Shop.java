package com.startjavanew.Game2.Objects;
//Объекты - магазин.
//Применяем interface Comparable<T> с методом compareTo(T o).

public class Shop implements Comparable<Shop> {
    String name;
    int areaShop;
    int assortmentGoods;
    int averagePrice;
    boolean parking;

    public Shop(String name, int areaShop, int assortmentGoods, int averagePrice, boolean parking) {
        this.name = name;
        this.areaShop = areaShop;
        this.assortmentGoods = assortmentGoods;
        this.averagePrice = averagePrice;
        this.parking = parking;
    }

    @Override
    public String toString() {
        StringBuffer ob = new StringBuffer();
        ob.append("Shop ");
        ob.append(name).append(": ");
        ob.append("areaShop = ").append(areaShop);
        ob.append(", assortmentGoods = ").append(assortmentGoods);
        ob.append(", averagePrice = ").append(averagePrice);
        ob.append(", parking: ").append(parking);
        ob.append(".");
        return ob.toString();
    }

    //Критерй сортировки - площадь магазинов.
    public int compareTo(Shop anotherShop) {
        if (this.areaShop == anotherShop.areaShop) {
            return 0;
        } else if (this.areaShop < anotherShop.areaShop) {
            return -1;
        } else {
            return 1;
        }
    }
}