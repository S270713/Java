package com.startjavanew.GameGuessNumber.Procedures;
//Основной класс игры.

import com.startjavanew.GameGuessNumber.CheckActions.CheckNumberAllAttempts;
import com.startjavanew.GameGuessNumber.CheckActions.CheckNumbers;
import com.startjavanew.GameGuessNumber.InputData.*;
import com.startjavanew.GameGuessNumber.ObjectClasses.*;

import java.io.IOException;
import java.util.ArrayList;

public class GameMain {
    public static ArrayList<Players> player = new ArrayList<>();

    public void start() throws IOException {
        BeforeGame beforeGame = new BeforeGame();//Процедуры да начала игры.
        beforeGame.beforeGame();
        Players actualPlayer = null;

        gameOver:
        do {// Цикл - кол-во попыток.
            for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {  //Цикл - кол-во игроков.
                actualPlayer = GameMain.player.get(i);//чередование игроков
                InputNumber inputNumber = new InputNumber();//Ввод числа пользователем.
                inputNumber.enterNumber(actualPlayer);
                CheckNumbers checkNumbers = new CheckNumbers();// Сверка названного варианта с загаданным числом.
                if (checkNumbers.compareNumbers(actualPlayer)) {
                    break gameOver;//Конец игры, т.к. игрок угадал число.
                }
                CheckNumberAllAttempts checkNumberAllAttempts = new CheckNumberAllAttempts();//Проверка, что остались попытки.
                if (checkNumberAllAttempts.checkAllAttemptsPlayers(actualPlayer, i)) {
                    break gameOver;//Конец игры, т.е. у всех игроков закончились попытки.
                }
            }
        } while(true);

        AfterGame afterGame = new AfterGame();//Процедуры после окончания игры.
        afterGame.afterGame(actualPlayer);
    }
}