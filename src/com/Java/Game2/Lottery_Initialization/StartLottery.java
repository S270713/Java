package com.Java.Game2.Lottery_Initialization;
//Инициализация статических и обычных блоков.

public class StartLottery extends Parent {
    {//Обычный код инициализации.
        System.out.println("Константин - 2 место.");
    }

    static {//статический код инициализации.
        System.out.println();
        System.out.println("В магазине проводилась лотерея. Победители:");
    }

    public void startLottery() {
        System.out.println("Мария - 4 место.");
    }

    {//Обычный код инициализации. Блок второой.
        System.out.println("Петр - 3 место.");
    }
}