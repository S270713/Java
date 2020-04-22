package com.startjavanew.GameGuessNumber.Procedures;
//Основной класс игры.

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
        victory:
        for (int j = 1; j <= 10; j++) { //Цикл - кол-во попыток у каждого игрока.//  ПЕРЕДЕЛАТЬ на while
            for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {  //Цикл - кол-во игроков.
                actualPlayer = GameMain.player.get(i);//чередование игроков
                InputNumber enter = new InputNumber();//Ввод числа пользователем.
                enter.enterNumber(actualPlayer);
                CheckNumbers check = new CheckNumbers();// Сверка названного варианта с загаданным числом.
                if (check.compareNumbers(actualPlayer)) {
                    break victory;//Число угадано.break-выход в случае, если любой игрок угадал число.
                }
            }
        }
        AfterGame afterGame = new AfterGame();//Процедуры после окончания игры.
        afterGame.afterGame(actualPlayer);
    }
}