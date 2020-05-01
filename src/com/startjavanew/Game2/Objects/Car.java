package com.startjavanew.Game2.Objects;
//Объекты - машины.
//Используем interface Comparator<T> с методом compare(Object obj1, Object obj2).

public class Car implements Comparable<Car> {
    public int numberSeats;
    public String modelName;
    public int motorPower;

    public Car(String modelName, int motorPower, int numberSeats) {
        this.modelName = modelName;
        this.motorPower = motorPower;
        this.numberSeats = numberSeats;
    }

    @Override
    public String toString() {
        StringBuilder ob = new StringBuilder();
        ob.append("Car ");
        ob.append(modelName).append(": ");
        ob.append("motorPower = ").append(motorPower);
        ob.append(", numberSeats = ").append(numberSeats);
        ob.append(".");
        return ob.toString();
    }

    public int compareTo(Car anotherCar) {
        if (this.numberSeats == anotherCar.numberSeats) {
            return 0;
        } else if (this.numberSeats < anotherCar.numberSeats) {
            return -1;
        } else {
            return 1;
        }
    }
}