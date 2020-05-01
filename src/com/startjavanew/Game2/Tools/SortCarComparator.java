package com.startjavanew.Game2.Tools;

import com.startjavanew.Game2.Objects.Car;

import java.util.Comparator;

public class SortCarComparator implements Comparator<Car> {

    //Критерй сортировки - numberSeats
    public int compare(Car nS1, Car nS2) {
        if (nS1.numberSeats == nS2.numberSeats) {
            return 0;
        }
        if (nS1.numberSeats > nS2.numberSeats) {
            return 1;
        } else {
            return -1;
        }
    }
}