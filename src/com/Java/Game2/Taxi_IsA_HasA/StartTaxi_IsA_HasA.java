package com.Java.Game2.Taxi_IsA_HasA;

//Is A; Has A.

/* Несмотря на то, что и в первой и во второй машинах по 20 радиоволн, неоходимо и там и там это указывать,
мы не можем применить наследование и перенять одинаковое количество радиоволн,
т.к. отношения между этими классами не соответствуют принципу  IS A
*/

/*Во второй машиине имеется кондиционер, описанный в отдельном классе,
но передать его в этот класс посредством наследования мы не можем,
т.к. здесь применим принцип HAS A
*/

public class StartTaxi_IsA_HasA {
    public void StartTaxi_IsA_HasA() {
        System.out.println("\nНа выходе из магазина стоянка такси для клиентов. Машины на выбор:");
        Taxi1 taxi1 = new Taxi1();
        System.out.println("Первая машина такси:");
        System.out.println("Model: " + taxi1.model);
        System.out.println("RadioPrograms: " + taxi1.radioPrograms);
        System.out.println("Движение автомобиля: ");
        taxi1.drive();

        Taxi2 taxi2 = new Taxi2();
        System.out.println("\nВторая машина такси:");
        System.out.println("Model: " + taxi2.model);
        System.out.println("RadioPrograms: " + taxi2.radioPrograms);
        System.out.println("Движение автомобиля: ");
        taxi2.drive();
        System.out.println("Дополнительные удобства:");
        taxi2.airCondition.airCond();

    }
}