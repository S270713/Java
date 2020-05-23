package com.Java.Exercises;
//Задан двумерный массив чисел (используйте генератор случайных чисел).
//Отсортируйте каждый нечетный столбец по убыванию, а каждый четный – по возрастанию.

public class Task6 {
    public static void main(String[] args) {
        int n = 7;
        int m = 7;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        int buffer;
        for (int k = 0; k < m; k++) {
            if (k % 2 == 0) {

                buffer = 1;
                while (buffer != 0) {
                    buffer = 0;
                    for (int i = n - 1; i > 0; i--) {
                        if (array[i][k] > array[i - 1][k]) {
                            buffer = array[i][k];
                            array[i][k] = array[i - 1][k];
                            array[i - 1][k] = buffer;
                        }
                    }
                }

            } else {

                buffer = 1;
                while (buffer != 0) {
                    buffer = 0;
                    for (int i = 0; i < n - 1; i++) {
                        if (array[i][k] > array[i + 1][k]) {
                            buffer = array[i][k];
                            array[i][k] = array[i + 1][k];
                            array[i + 1][k] = buffer;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}