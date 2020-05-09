package com.Java.Lessons.Lesson_4.game;
// Вывод в конце игры всех названных игроками варииантов.

import java.util.Arrays;

public class PrintAllAttempts {

    void printAttempts(Players player1, Players player2) {
        System.out.println(Arrays.toString(player1.getAttempts()));
        System.out.println(Arrays.toString(player2.getAttempts()));
    }
}