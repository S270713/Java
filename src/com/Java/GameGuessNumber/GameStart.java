package com.Java.GameGuessNumber;
// Игра "Угадай число". Класс запуска игры.

import com.Java.GameGuessNumber.OtherTools.ContinueGame;
import com.Java.GameGuessNumber.OtherTools.Messages;
import com.Java.GameGuessNumber.Procedures.GameMain;

import java.io.IOException;

public class GameStart {
    public static void main(String[] args) throws IOException {
        GameMain game = new GameMain();
        ContinueGame replay = new ContinueGame();

        Messages.messageGameBegin();
        do {
            game.start();//Запуск игры.
        } while (replay.questionReplay().equals("да"));//В классе ContinueGame запрос о повторе игры.
        Messages.messageGameOver();
    }
}