package com.Java.Threads.Threads_Game;

//Класс - Пищевое Производство.
public class FoodIndustry implements Runnable {
    FoodWarehouse foodWarehouse;
    FoodIndustry(FoodWarehouse foodWarehouse) {
        this.foodWarehouse = foodWarehouse;
    }

    public void run() {
        for (int i = 1; i < 8; i++) {
            foodWarehouse.workFoodIndustry ();
        }
    }
}