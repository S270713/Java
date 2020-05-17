package com.Java.Exercises;
//В диапазоне натуральных чисел от 2 до 99 определить,
//сколько из них кратны любому из чисел в диапазоне от 2 до 9.

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int arraySize = 40;
        int [] array = new int [arraySize];
        int min = 2;
        int max = 99;
        int diff = max - min;
        Random random = new Random();

        int [] arrayAnswerZero = new int[10];//Для сбора инфо. о кратных числах.
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(diff + 1);
            array[i] += min;
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < arraySize; i++) {//Анализ.
            for (int j = 2; j <= 9; j++) {
                if (array[i] % j == 0 ) {
                    arrayAnswerZero[j] ++;
                }
            }
        }

        System.out.println();
        for (int j = 2; j <= 9; j++) {//Вывод данных.
            System.out.print("Кратно " + j + ": ");
            System.out.print(arrayAnswerZero[j]);
            System.out.println();
        }
    }
}