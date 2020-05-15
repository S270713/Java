package com.Java.Game2.DiscountDay_enum;
//enum-class, combinedOperations.

public class StartDiscountDay {
    public void startDiscountDay() {

        System.out.println("Выберите день скидки и менеджера: ");
        Day[] day = Day.values();
        for (Day i : day) { System.out.println(i); }
        System.out.println();

        Name[] name = Name.values();
        for (Name i : name) { System.out.println(i); }
        System.out.println();

        Day current = Day.MONDAY;
        System.out.println(current);

        System.out.println(Name.Ivan);
        System.out.println(Name.Ivan.getCode());

        System.out.println();
        CombinedOperations combinedOperations = new CombinedOperations();
        combinedOperations.calcDiscountDay();
    }
}