package com.Java.Threads.Threads_Game;

//Класс Продуктовый Склад.
class FoodWarehouse{
    Warehouse warehouse = new Warehouse();
    private int limitFood = warehouse.report.getLimitFood();

    //Метод -  ПищевоеПроизводство1.
    public synchronized void workFoodIndustry() {
        while (warehouse.report.getFood() >= limitFood) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        warehouse.report.setFood(1);
        notifyAll();
    }
}