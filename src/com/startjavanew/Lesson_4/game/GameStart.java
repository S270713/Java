package com.startjavanew.Lesson_4.game;
// Игра "Угадай число".
// Класс запуска игры.

public class GameStart {
    public static void main(String[] args) {
        GameMain game = new GameMain();
        ContinueGame replay = new ContinueGame();

        do {
            game.start();
        } while (replay.questionReplay().equals("да"));//Переход в класс Continue - запрос о повторе игры, либо о прекращении.

        System.out.println("Игра завершена.");
    }
}