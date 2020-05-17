package com.Java.Exercises;
//Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b].
//Освободившиеся в конце массива элементы заполнить нулями.

public class Task3 {
    public static void main(String[] args) {
        int arrayLength = 10;
        int a = 0;//Создаем интервал [a-b].
        int b = 10;
        int [] array = new int [arrayLength];
        System.out.println("Первоначальный массив:");
        for (int i = 1; i <= arrayLength; i++) {//Заполнение массива.
            array[i - 1] = (int) (Math.random() * 100);
            System.out.print(array[i - 1] + " ");
        }

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] >= a && array[i] <= b) {
                //Цикл сжмающий массив (перемещающий все влево).
                for (int j = i; j < arrayLength; j++) {
                    if (j == arrayLength - 1) {
                        array[j] = 101;//взята величина за пределами цикла, т.к. в интервале [a-b] м.б. ноль.
                    } else {
                        array[j] = array[j + 1];
                    }
                }
                i--;//для проверки перемещенного элемента.
            }
        }
        System.out.println("\nИтоговый массив: ");
        for (int i = 1; i <= arrayLength; i++) {
            if (array[i - 1] == 101) array[i - 1] = 0;
            System.out.print(array[i - 1] + " ");
        }
    }
}