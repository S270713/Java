package com.Java.Exercises;
//Найти в массиве те элементы, значение которых меньше среднего арифметического,
//взятого от всех элементов массива с нечетным индексом.

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List <Integer> array = new ArrayList();
        for (int i = 1; i <=30; i++) {
            array.add((int) (Math.random() * 100));
            System.out.print(array.get(i - 1) + " ");
        }

        int oddSum = 0;//Находим среднее арифмтеческое.
        int oddQuantity = 0;
        for (int i = 1; i <= array.size(); i = i + 2) {
            oddSum += array.get(i);
            oddQuantity++;
        }

        int oddAverage = oddSum/oddQuantity;
        System.out.println("\nСреднее арифметическое элементов с нечетным индексом: " + oddAverage);
        System.out.print("Элементы, значение которых меньше данного среднего арифметческого: ");
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) < oddAverage) System.out.print(array.get(i) + " ");
        }
    }
}