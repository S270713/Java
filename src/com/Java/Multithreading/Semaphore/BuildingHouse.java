package com.Java.Multithreading.Semaphore;
//надо отремонтировать 15 квартир в доме.
//одновременно одна компания может вести работы в доме
//каждая компания ремонтирует только по 5 квартир.

import java.util.concurrent.Semaphore;

public class BuildingHouse {
    public static void main(String[] args) {
        int countAccess = 1;//кол-во лицензий. 1 лицензия. одновременно одна компания может вести работы в доме.

        Semaphore access = new Semaphore (countAccess, true);//разрешение(лицензия); в порядке очереди.
        House house = new House();
        new Thread(new CountCompany(house, access, "Подрядчик 1")).start();
        new Thread(new CountCompany(house, access, "Подрядчик 2")).start();
        new Thread(new CountCompany(house, access, "Подрядчик 3")).start();
    }
}