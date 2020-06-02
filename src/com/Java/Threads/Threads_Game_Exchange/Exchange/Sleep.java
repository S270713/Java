package com.Java.Threads.Threads_Game_Exchange.Exchange;
//Замедление игры для удобства восприятия.

public class Sleep {

    public static void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}