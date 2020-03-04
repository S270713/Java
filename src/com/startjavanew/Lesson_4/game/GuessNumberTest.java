package com.startjavanew.Lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(input.nextLine());

        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(input.nextLine());

        GuessNumber game = new GuessNumber(player1, player2);

        String replayGame = "";

        do {
            game.start(player1, player2);
            do {
                System.out.println("Выберите ответ из предлагаемых вариантов.");
                System.out.print("Хотите продолжить? [да / нет]: ");
                replayGame = input.nextLine();
                System.out.println("Ваш ответ: " + replayGame);
            } while(!replayGame.equals("да") && !replayGame.equals("нет"));
        } while(replayGame.equals("да"));
        System.out.println("Игра завершена.");
    }
}