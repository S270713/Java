package com.startjavanew.Lesson_1.other;

public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
           System.out.println(i);
        }
        System.out.println();
        int k = 6;
        while (k >= -6) {
           System.out.print(k + " ");
           k = k - 2;
        }
        System.out.println();
        int g = 10;
        int check2 = 0;
        do {
            check2 = g % 2;
            if (check2 == 1) {
               System.out.println(g);
            }
            g++;
        } while (g <= 20);
    }
}

