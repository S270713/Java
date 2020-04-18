package com.startjavanew.Lesson_4.game;
//Класс для продолжения игры, либо прекращения.

import java.util.Scanner;

public class ContinueGame {
    String replayGame = null;
    Scanner input = new Scanner(System.in);

    String questionReplay() {
        do {
            System.out.println("Выберите ответ из предлагаемых вариантов.");
            System.out.print("Хотите продолжить? [да / нет]: ");
            replayGame = input.nextLine();
            System.out.println("Ваш ответ: " + replayGame);
        } while (!replayGame.equals("да") && !replayGame.equals("нет"));
        return replayGame;
    }
}