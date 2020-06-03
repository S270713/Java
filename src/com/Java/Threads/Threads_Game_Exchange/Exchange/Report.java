package com.Java.Threads.Threads_Game_Exchange.Exchange;

public class Report {
    long lastTime = System.currentTimeMillis();
    long periodTime = 400;//Шаг игры (периодичность отчетности).

    //Отчетность:
    public void printReport(
            int bricks,
            int infoFactory1,
            int infoFactory2,
            int infoFactory3,
            int infoFloors1,
            int infoFloors2,
            int infoFloors3,
            int metal,
            int bridges) {

        if ((System.currentTimeMillis() - lastTime) > periodTime) {
            //Отчет по производству кирпича и постройке зданий.
            System.out.println("Отчет (Кирпичи/Здания): 1 завод  (" + infoFactory1 + ")  2 завод  (" + infoFactory2 + ")  3 завод  (" + infoFactory3 + ")  Кирпич на складе  (" + bricks + ")  Этажей в здании 1  (" + infoFloors1 + ")  Этажей в здании 2  (" + infoFloors2 + ")  Этажей в здании 3  (" + infoFloors3 + ")");
            //Отчетность по производству металла и постройке мостов:
            System.out.println("Отчет (Металл/Мосты): Металла на складе: (" + metal + "); Построено мостов (" + bridges + ").");
            lastTime = System.currentTimeMillis();
        }
    }
    public static void reportComplete(int number) {
        System.out.println("------------------- Здание " + number + " построено! -------------------");
    }
    public static void reportCompleteBridge(int number) {
        System.out.println("------------------- Построено " + number + " моста -------------------");
    }


}