package com.Java.Game2.WalkShop;
//Внутренние классы (локальные классы, анонимные классы, внутренние классы-члены), Статические вложенные классы.
//Класс Магазин. Товар в залах, на полках, на складах.

public class StartWalkShopAlpha {

    public void walkShopAlpha() {

        ShoppingRoomFood shoppingRoomFood = new ShoppingRoomFood();
        shoppingRoomFood.salesShelf1.infoProductA1();//ссылка на объект внешнего класса через this.
        shoppingRoomFood.elevator();//внутренний класс м.б. создан внутри метода.
        shoppingRoomFood.announcement();//внутренний класс м.б. создан внутри цикла.

        DoorToWarehouse doorToWarehouse = new DoorToWarehouse();
        doorToWarehouse.enter.dootStatus();//Внутренний класс имеет доступ ко всем полям внешнего, в т.ч. private.
        doorToWarehouse.infoSchemeWarehouse();//Внешний класс имеет доступ ко всем членам внутреннего класса, в т.ч. private.

        doorToWarehouse.enter.namePlate();//Доступ к методу внутреннего класса Enter через объект enter, объявленный во внешнем класса.

        doorToWarehouse.enter.forklift();//Локальный класс.

        WorkDay workDay = new WorkDay();//Анонимный класс.
        workDay.warehouseWorkDay.enter.announcementWorkDay();

        Exit exit = new Exit();//Статическй вложенный класс.
        exit.informationExit.information();
    }
}