package com.Java.GameGuessNumber.OtherTools;
//Класс для продолжения игры, либо прекращения.

import java.util.Scanner;

public class ContinueGame {
    String replayGame = null;
    Scanner input = new Scanner(System.in);

    public String questionReplay() {
        do {
            System.out.println("\nВыберите ответ из предлагаемых вариантов.");
            System.out.print("Хотите продолжить? [да / нет]: ");
            replayGame = input.nextLine();
            System.out.println("Ваш ответ: " + replayGame);
        } while (!replayGame.equals("да") && !replayGame.equals("нет"));
        return replayGame;
    }
}