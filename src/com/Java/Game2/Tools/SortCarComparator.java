package com.Java.Game2.Tools;

import com.Java.Game2.Objects.Car;

import java.util.Comparator;

public class SortCarComparator implements Comparator<Car> {

    //Критерй сортировки - numberSeats
    public int compare(Car nS1, Car nS2) {
        if (nS1.getNumberSeats() == nS2.getNumberSeats()) {
            return 0;
        }
        if (nS1.getNumberSeats() > nS2.getNumberSeats()) {
            return 1;
        } else {
            return -1;
        }
    }
}