package com.Java.Game2.Taxi_IsA_HasA;

public class Taxi2 {
    String model = "VW";
    int radioPrograms = 20;
    void drive() {
        System.out.println("Режим движения ускоренный.");
    }

    AirCondition airCondition = new AirCondition();
}