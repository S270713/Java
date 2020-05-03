package com.startjavanew.Game2.Objects;
//Объекты - магазин.
//Применяем interface Comparable<T> с методом compareTo(T o).

public class Shop implements Comparable<Shop> {
    private String name;
    private int areaShop;
    private int assortmentGoods;
    private int averagePrice;
    private boolean parking;

    public Shop(String name, int areaShop, int assortmentGoods, int averagePrice, boolean parking) {
        this.name = name;
        this.areaShop = areaShop;
        this.assortmentGoods = assortmentGoods;
        this.averagePrice = averagePrice;
        this.parking = parking;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAreaShop() {
        return areaShop;
    }
    public void setAreaShop(int areaShop) {
        this.areaShop = areaShop;
    }

    public int getAssortmentGoods() {
        return assortmentGoods;
    }
    public void setAssortmentGoods(int assortmentGoods) {
        this.assortmentGoods = assortmentGoods;
    }

    public int getAveragePrice() {
        return averagePrice;
    }
    public void setAveragePrice(int averagePrice) {
        this.averagePrice = averagePrice;
    }

    public boolean isParking() {
        return parking;
    }
    public void setparking(boolean parking) {
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