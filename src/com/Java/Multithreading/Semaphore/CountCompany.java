package com.Java.Multithreading.Semaphore;

import java.util.concurrent.Semaphore;

class CountCompany implements Runnable{
    House house;
    Semaphore access;
    String name;
    double lastTime;

    CountCompany(House house, Semaphore access, String name){
        this.house = house;
        this.access = access;
        this.name = name;
    }
    public void run(){
        try{
            System.out.println(name + " ждет лицензию, чтобы приступить к работам.");
            Thread.sleep(100);
            access.acquire();
            System.out.println("  " + name + " приступил к работам.");
            house.flatHouse = 1;
            for (int i = 1; i <= 5; i++){
                System.out.println(this.name + ": " + house.flatHouse);
                house.flatHouse++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e) {System.out.println(e.getMessage());}
        System.out.println(name + "  освобождает лицензию.");
        access.release();
    }
}