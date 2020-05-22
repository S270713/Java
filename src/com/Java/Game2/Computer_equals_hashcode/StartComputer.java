package com.Java.Game2.Computer_equals_hashcode;
//   equals_hashcode

public class StartComputer {
    public void startComputer() {
        System.out.println();
        System.out.println("Техническая обработка компьютером всех касс:\n");

        Cashbox x = new Cashbox("one");
        Cashbox y = new Cashbox("one");
        Cashbox z = new Cashbox("one");

        System.out.println("Рефлексиия - " + x.equals(x));
        System.out.println("Симметрия - " + x.equals(y) + " - " + y.equals(x));
        System.out.println("Транзитивность - " + x.equals(y) + " - " + y.equals(z) + " - " + x.equals(z));
        System.out.println("Консистентность - " + x.equals(y));
        System.out.println("Консистентность - " + x.equals(y));
        System.out.println("Консистентность - " + x.equals(y));
        System.out.println("not null - " + x.equals(null));

    }
}