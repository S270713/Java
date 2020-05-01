package com.startjavanew.Game2;
//Игра - поездка по магазинам.

import com.startjavanew.Game2.InputData.PropertiesCars;
import com.startjavanew.Game2.InputData.PropertiesShops;

public class GameShopStart {
    public static void main(String[] args) {

        PropertiesShops infoShop = new PropertiesShops();
        infoShop.allShops();

        PropertiesCars infoCar = new PropertiesCars();
        infoCar.allCars();
    }
}