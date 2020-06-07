package com.Java.Multithreading.Multithreading_Game_Exchange.Exchange;

public class Report {
    long lastTime = System.currentTimeMillis();
    long periodTime = 400;//Шаг игры (периодичность отчетности).

    //Отчетность:
    public void printReport(ExchangeServer sectionBricks, ExchangeServer sectionMetal) {

        if ((System.currentTimeMillis() - lastTime) > periodTime) {
            System.out.print("\r");
            System.out.print(
                    "\033[31m Завод А (" + sectionBricks.getInfoFactory1() +
                    ") Завод B (" + sectionBricks.getInfoFactory2() +
                    ") Завод C (" + sectionBricks.getInfoFactory3() +
                    ") Запасы кирпича (" + sectionBricks.getAmountProducts() +
                    ") Здание А (" + sectionBricks.getInfoFloors1() +
                    "%) Здание B (" + sectionBricks.getInfoFloors2() +
                    "%) Здание C (" + sectionBricks.getInfoFloors3() +
                    "%) Завод Металл (" + sectionMetal.getInfoFactoryMetal1() +
                    ") Запасы металла (" + sectionMetal.getAmountProducts() +
                    ") Мост (" + sectionMetal.getBridges() +
                    "%)"
            );
            lastTime = System.currentTimeMillis();
        }
    }
}