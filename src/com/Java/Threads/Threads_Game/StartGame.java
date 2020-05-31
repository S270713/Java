package com.Java.Threads.Threads_Game;

/*2 завода по производству кирпичей.
  2 застройщика.
  1 склад.
  1 пищевое производство.
  1 отдельный склад под продукты.
  */

public class StartGame {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Factory1 workFactory1 = new Factory1(warehouse);
        Factory2 workFactory2 = new Factory2(warehouse);
        Builders1 workBuilders1 = new Builders1(warehouse);
        Builders2 workBuilders2 = new Builders2(warehouse);
        new Thread(workFactory1).start();
        new Thread(workFactory2).start();
        new Thread(workBuilders1).start();
        new Thread(workBuilders2).start();

        FoodWarehouse foodWarehouse = new FoodWarehouse();
        FoodIndustry foodIndustry = new FoodIndustry(foodWarehouse);
        new Thread(foodIndustry).start();
    }
}