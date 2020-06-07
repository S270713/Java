package com.Java.Multithreading.Multithreading_Game_Exchange.Exchange;

public class Report {
    long lastTime = System.currentTimeMillis();
    long periodTime = 400;//Шаг игры (периодичность отчетности).
    Exchange exchange;

    //Отчетность:
    public void printReport(ExchangeServer actualSection) {
        //System.out.println("test " + actualSection.getAmountProducts());

        //") Кирпич (" + getAmountProducts(sectionBricks) +
        if ((System.currentTimeMillis() - lastTime) > periodTime) {
            System.out.print("\r");
            System.out.print(
                    "\033[31m Завод А (" + actualSection.getInfoFactory1() +
                    ") Завод B (" + actualSection.getInfoFactory2() +
                    ") Завод C (" + actualSection.getInfoFactory3() +
                    ") Запасы кирпича (" + actualSection.getAmountProducts() +
                    ") Здание А (" + actualSection.getInfoFloors1() +
                    "%) Здание B (" + actualSection.getInfoFloors2() +
                    "%) Здание C (" + actualSection.getInfoFloors3() +
                    "%) Завод Металл (" + actualSection.getInfoFactoryMetal1() +
                    ") Запасы металла (" + actualSection.getAmountProducts() +
                    ") Мосты (" + actualSection.getBridges() +
                    ")"
            );
            lastTime = System.currentTimeMillis();
        }
    }
    public static void reportComplete(int number) {
        /////System.out.println("------------------- Здание " + number + " построено! -------------------");
    }
    public static void reportCompleteBridge(int number) {
        /////System.out.println("------------------- Построено " + number + " моста -------------------");
    }
}