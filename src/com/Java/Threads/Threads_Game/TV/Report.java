//package com.Java.Threads.Threads_Game.TV;
//
////Класс - Отчетность.
//public class Report {
//    public static int bricks = 0;
//    public static int limit = 3;//огр-я склада.
//
//    public void setBricks(int bricks) {
//        this.bricks = this.bricks + bricks;
//    }
//
//
//    private int infoFactory1 = 0;
//    private int infoFactory2 = 0;
//    private int infoBricks = 0;
//    private int infoFloors1 = 0;
//    private int infoFloors2 = 0;
//
//    public void setInfoFactory1(int infoFactory1) {
//        this.infoFactory1 = infoFactory1;
//    }
//
//    public void setInfoFactory2(int infoFactory2) {
//        this.infoFactory2 = infoFactory2;
//    }
//
//    public void setInfoBricks(int infoBricks) {
//        this.infoBricks = this.infoBricks + infoBricks;
//    }
//
//    public void setInfoFloors1(int infoFloors1) {
//        this.infoFloors1 = this.infoFloors1 + infoFloors1;
//    }
//
//    public int getInfoFloors1() {
//        return infoFloors1;
//    }
//
//    public void setInfoFloors2(int infoFloors2) {
//        this.infoFloors2 = this.infoFloors2 + infoFloors2;
//    }
//
//    public int getInfoFloors2() {
//        return infoFloors2;
//    }
//
//    private static int food;
//    private int limitFood = 7;
//
//    public int getFood() {
//        return food;
//    }
//
//    public void setFood(int food) {
//        this.food = this.food + food;
//    }
//
//    public int getLimitFood() {
//        return limitFood;
//    }
//
//    public void printReport() {
//        System.out.println("1factory-" + infoFactory1 + ";   2factory-" + infoFactory2 + ";   Warehouse-" + infoBricks + ";   1house-" + infoFloors1 + ";   2house-" + infoFloors2 + ";   food-" + food);
//
//    }
//}