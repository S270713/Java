package com.Java.Game2.DataBaseClone;
// clone()

public class StartDatabaseClone {
    public void startDatabaseClone() throws Exception {
        System.out.println("\nРабота с базой данных клиентов, в т.ч. копирование.");
        ClassClone ob1 = new ClassClone();
        ob1.index = 1;
        ClassClone ob2 = ob1;
        System.out.println(ob1.index);
        System.out.println(ob2.index);
        System.out.println();

        ob1.index = 2;
        System.out.println(ob1.index);
        System.out.println(ob2.index);
        System.out.println();

        ob2.index = 3;
        System.out.println(ob1.index);
        System.out.println(ob2.index);
        System.out.println();

        ClassClone ob3;
        ob3 = ob2;
        ob3.index = 4;
        System.out.println("Проверяем объект после его изменения через третью ссылку.");
        System.out.println(ob1.index);
        System.out.println(ob2.index);
        System.out.println(ob3.index);
        System.out.println();

        System.out.println("Клонирование:");
        ClassClone ob4clone = ob1.clone();
        System.out.println("После клонирования:");
        System.out.println("ob1: " + ob1.index);
        System.out.println("ob2: " + ob2.index);
        System.out.println("ob3: " + ob3.index);
        System.out.println("ob4clone: " + ob4clone.index);
        System.out.println();

        System.out.println("Меняем ob1 на 10, ob4clone на 20 :");
        ob1.index = 10;
        ob4clone.index = 20;
        System.out.println("ob1: " + ob1.index);
        System.out.println("ob2: " + ob2.index);
        System.out.println("ob3: " + ob3.index);
        System.out.println("ob4clone: " + ob4clone.index);

    }
}