package com.Java.Game2;

import com.Java.Game2.CashReport.StartCashReport;
import com.Java.Game2.Cashbox.Cashbox2;
import com.Java.Game2.Choose.ChooseMain;
import com.Java.Game2.Discount.StartDiscount;
import com.Java.Game2.InputData.PropertiesCars;
import com.Java.Game2.InputData.PropertiesShops;
import com.Java.Game2.ShoppingList.StartShoppingList;
import com.Java.Game2.TwoQueue.StartTwoQueue;
import com.Java.Game2.WalkShop.StartWalkShopAlpha;

import java.io.IOException;

public class StepByStep {

    void doSteps() throws IOException, ClassNotFoundException {
        PropertiesShops infoShop = new PropertiesShops();
        infoShop.allShops();

        PropertiesCars infoCar = new PropertiesCars();
        infoCar.allCars();

        ChooseMain chooseMain = new ChooseMain();//выбор магазинов, машины.
        chooseMain.choose();

        StartShoppingList startShoppingList = new StartShoppingList();//работа со списками
        startShoppingList.workShoppingList();

        StartDiscount startDiscount = new StartDiscount();//Выбор товара со скидкой.
        startDiscount.startDiscount();

        StartWalkShopAlpha startWalkShopAlpha = new StartWalkShopAlpha();//Во время движения по магазину.
        startWalkShopAlpha.walkShopAlpha();//Вложенные классы(внутренние и статическиие вложенные)

        Cashbox2 cashbox2 = new Cashbox2();
        System.out.println("Вы выбрали вторую кассу.");
        cashbox2.chooseCashbox();

        StartCashReport startCashReport = new StartCashReport();//сериализация/десериализация.
        startCashReport.cashReport();//Отчет кассы.

        StartTwoQueue startTwoQueue = new StartTwoQueue();//Многопоточность.
        startTwoQueue.startTwoQueue();//Одна касса обслуживает две очереди в пропорции 2:1.

    }
}