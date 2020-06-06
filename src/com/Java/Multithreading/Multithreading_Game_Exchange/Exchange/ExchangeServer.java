package com.Java.Multithreading.Multithreading_Game_Exchange.Exchange;

public class ExchangeServer {
    private int amountProducts = 0;
    public static int limitWarehouse = 3;//ограничения склада по любой продукции.

    public void setAmountProducts(int amount) {
        amountProducts = amountProducts + amount;
    }
    public int getAmountProducts() {
        return amountProducts;
    }

    private int infoFactory1 = 0;
    private int infoFactory2 = 0;
    private int infoFactory3 = 0;
    private int infoFloors1 = 0;
    private int infoFloors2 = 0;
    private int infoFloors3 = 0;

    public int getInfoFactory1() {
        return infoFactory1;
    }

    public void setInfoFactory1(int infoFactory1) {

        this.infoFactory1 = this.infoFactory1 + infoFactory1;
    }

    public int getInfoFactory2() {
        return infoFactory2;
    }

    public void setInfoFactory2(int infoFactory2) {
        this.infoFactory2 = this.infoFactory2 + infoFactory2;
    }

    public int getInfoFactory3() {
        return infoFactory3;
    }

    public void setInfoFactory3(int infoFactory3) {
        this.infoFactory3 = this.infoFactory3 + infoFactory3;
    }

    public int getInfoFloors1() {
        return infoFloors1;
    }

    public void setInfoFloors1(int infoFloors1) {
        this.infoFloors1 = this.infoFloors1 + infoFloors1;
    }

    public int getInfoFloors2() {
        return infoFloors2;
    }

    public void setInfoFloors2(int infoFloors2) {
        this.infoFloors2 = this.infoFloors2 + infoFloors2;
    }

    public int getInfoFloors3() {
        return infoFloors3;
    }

    public void setInfoFloors3(int infoFloors3) {
        this.infoFloors3 = this.infoFloors3 + infoFloors3;
    }


    private int infoFactoryMetal1 = 0;
    private int bridges = 0;

    public int getInfoFactoryMetal1() {
        return infoFactoryMetal1;
    }

    public void setInfoFactoryMetal1(int infoFactoryMetal1) {
        this.infoFactoryMetal1 = this.infoFactoryMetal1 + infoFactoryMetal1;
    }

    public int getBridges() {
        return bridges;
    }

    public void setBridges(int bridges) {
        this.bridges = this.bridges + bridges;
    }


}