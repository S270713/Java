package com.Java.Game2.WalkShop;
//Статический вложенный класс.

public class Exit {
    private static String infoExit = "Выход из магазина в конце коридора.";
    InformationExit informationExit = new InformationExit();

    public static class InformationExit {//Статический вложенный класс может использовать любой статический член окружающего класс
        void information() {//    без указания имени этого окружающего класса.
            System.out.println();
            System.out.println(infoExit);
        }
    }
}