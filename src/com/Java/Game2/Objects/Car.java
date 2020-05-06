package com.Java.Game2.Objects;
//Объекты - машины.
//Используем interface Comparator<T> с методом compare(Object obj1, Object obj2).

public class Car implements Comparable<Car> {
    private int numberSeats;
    private String modelName;
    private int motorPower;

    public Car(String modelName, int motorPower, int numberSeats) {
        this.modelName = modelName;
        this.motorPower = motorPower;
        this.numberSeats = numberSeats;
    }

    public int getNumberSeats() {
        return numberSeats;
    }
    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMotorPower() {
        return motorPower;
    }
    public void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
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