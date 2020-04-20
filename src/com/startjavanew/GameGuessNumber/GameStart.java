package com.startjavanew.GameGuessNumber;
// Игра "Угадай число".
// Класс запуска игры.

import java.io.IOException;

public class GameStart {
    public static void main(String[] args) throws IOException {
        GameMain game = new GameMain();
        ContinueGame replay = new ContinueGame();

        Messages.messageGameBegin();
        do {
            game.start();
        } while (replay.questionReplay().equals("да"));//В классе Continue запрос о повторе игры.
        Messages.messageGameOver();
    }
}