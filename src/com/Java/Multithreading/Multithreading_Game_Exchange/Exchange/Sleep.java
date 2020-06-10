package com.Java.Multithreading.Multithreading_Game_Exchange.Exchange;
//Замедление игры для удобства восприятия.

public class Sleep {

    public static void sleep() {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            //break;
        }
    }
}