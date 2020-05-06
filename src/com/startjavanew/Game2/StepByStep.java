package com.startjavanew.Game2;

import com.startjavanew.Game2.Choose.ChooseMain;
import com.startjavanew.Game2.InputData.PropertiesCars;
import com.startjavanew.Game2.InputData.PropertiesShops;
import com.startjavanew.Game2.ShoppingList.StartShoppingList;

import java.io.IOException;

public class StepByStep {

    void doSteps() throws IOException {
        PropertiesShops infoShop = new PropertiesShops();
        infoShop.allShops();

        PropertiesCars infoCar = new PropertiesCars();
        infoCar.allCars();

        ChooseMain chooseMain = new ChooseMain();//выбор магазинов, машины.
        chooseMain.choose();

        StartShoppingList startShoppingList = new StartShoppingList();//работа со списками
        startShoppingList.workShoppingList();
    }
}