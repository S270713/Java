package com.Java.Exercises;
//Задача: Перевернуть массив.

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Массив с четным количеством элементов:");
        int i;
        String[] array = { "1", "2", "3", "4", "5", "6", "7", "8"};
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        String temp;
        double arrayLength = array.length;
        double centre;

        if ((arrayLength % 2) == 0) {
            centre = arrayLength / 2;
        } else {
            centre = arrayLength / 2 + 0.5;
        }
        System.out.println("\nЦентральный ориентир: " + centre);

        int i2;
        for (i = 0; i<=(centre-1); i++) {
            i2 = array.length - 1 - i;
            temp = array[i];
            array[i] = array[i2];
            array[i2] = temp;
        }
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("\nМассив с НЕчетным количеством элементов:");
        String[] array2 = { "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        arrayLength = array2.length;

        if ((arrayLength % 2) == 0) {
            centre = arrayLength / 2;
        } else {
            centre = arrayLength / 2 + 0.5;
        }
        System.out.println("\nЦентральный ориентир: " + centre);

        for (i = 0; i<=(centre-1); i++) {
            i2 = array2.length - 1 - i;
            temp = array2[i];
            array2[i] = array2[i2];
            array2[i2] = temp;
        }
        for (i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}