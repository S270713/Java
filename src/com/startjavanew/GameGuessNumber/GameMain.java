package com.startjavanew.GameGuessNumber;
//Основной класс игры.

import com.startjavanew.GameGuessNumber.DataClear.ClearAttempts;
import com.startjavanew.GameGuessNumber.DataInput.InputAmountPlayers;
import com.startjavanew.GameGuessNumber.DataInput.InputName;
import com.startjavanew.GameGuessNumber.DataInput.InputNumber;

import java.io.IOException;
import java.util.ArrayList;

public class GameMain {
    public static ArrayList<Players> player = new ArrayList<>();

    static int secretNumber;//Загадываемое число.

    public void start() throws IOException {

        InputAmountPlayers.amount();// Блок ввода количества игроков.

        InputName namePlayer = new InputName();//Блок ввода имени игроков.
        for (int i = 1; i <= InputAmountPlayers.amountPlayers; i++) {
            GameMain.player.add(new Players(namePlayer.inputName(i)));
        }

        secretNumber = ((int) (101 * Math.random()));
        Messages.messageSecretNumber(secretNumber);
        Messages.message10Attempts();

        Players actualPlayer;
        victory:
// break-выход в случае, если любой игрок угадал число.

        for (int j = 1; j <= 10; j++) { //Цикл - кол-во попыток у каждого игрока.//  ПЕРЕДЕЛАТЬ на while
            for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {  //Цикл - кол-во игроков.
                actualPlayer = GameMain.player.get(i);//чередование игроков

                InputNumber enter = new InputNumber();//Ввод числа пользователем.
                enter.enterNumber(actualPlayer);

                CheckNumbers check = new CheckNumbers();// Сверка названного варианта с загаданным числом.
                if (check.compareNumbers(actualPlayer)) {
                    break victory;//Число угадано.
                }
            }
        }
        PrintAllAttempts printAllAttempts = new PrintAllAttempts();//Вывод всех названных игроками вариантов.
        printAllAttempts.printAttempts();

        ClearAttempts clearAttempts = new ClearAttempts();//Очистка заполненных вариантов
        clearAttempts.clear();

        for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {//Обнуление номера варианта(попытки).
            GameMain.player.get(i).setNumberOfAttempt(0);
        }

        GameMain.player.removeAll(GameMain.player);//Очистка имен.
    }
}