package com.Java.Game2.InputData;
//Описываем объекты-машины.

import com.Java.Game2.Objects.Car;
import com.Java.Game2.Tools.SortCarComparator;

import java.util.ArrayList;

public class PropertiesCars {
    public void allCars() {
        ArrayList<Car> listCars = new ArrayList<Car>();

        Car Car1 = new Car("Ford", 150, 8);
        Car Car2 = new Car("Audi", 500, 2);
        Car Car3 = new Car("Lada", 200, 4);

        listCars.add(Car1);
        listCars.add(Car2);
        listCars.add(Car3);

        SortCarComparator myPriceComparator = new SortCarComparator();
        listCars.sort(myPriceComparator);

        System.out.println("\nМашины в гараже на выбор для поездки по магазинам (отсортированы по количеству сидений):");
        for (Car ob : listCars) {
            System.out.println(ob);
        }
    }
}