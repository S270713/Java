package com.Java.Exercises;
//Сортировка методом "Пузырька" (bubble sort).

public class Task5_BubbleSort {
    public static void main(String[] args) {
        int buffer = 1;//буффер для обмена и индикатор наличия факта обмена.
        int sizeArray = 20;
        int[] array = new int[sizeArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i] + "  ");
        }

        while (buffer != 0) {//Работаем, пока при полном проходе массиива были обмены.
            buffer = 0;//в т.ч. используем его, как индикатор о наличии обменов.
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                }
            }
            System.out.println();
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "  ");
            }
        }
    }
}