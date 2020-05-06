package com.Java.Game2.Choose;
//Лямбда-выражение.

public class ChooseCar {
    private int averageSpeedFord = 60;

    public int getAverageSpeedFord() {
        return averageSpeedFord;
    }

    public void setAverageSpeedFord(int averageSpeedFord) {
        this.averageSpeedFord = averageSpeedFord;
    }

    void chooseCar() {
        System.out.println("Выбранный автомобиль для поездки по магазинам - Ford.");

        System.out.println("Время в пути до первого магазина на данной машиине составит: ");

        int averageSpeedChooseCar = getAverageSpeedFord();
        ChooseShop chooseShop = new ChooseShop();
        TimingToShop timing = (distance, averageSpeed) -> distance / averageSpeed;
        System.out.println(timing.timing(chooseShop.getDistanceAlpha(), averageSpeedChooseCar) + " часа.");

        EngineOn engineOn = engineInfo -> System.out.println(engineInfo);
        engineOn.printInfoEngineOn("Двигатель выбранного автомобиля заведен.");
    }
}