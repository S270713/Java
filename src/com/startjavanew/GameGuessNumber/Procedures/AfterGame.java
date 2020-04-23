package com.startjavanew.GameGuessNumber.Procedures;

import com.startjavanew.GameGuessNumber.AbstractOldRecords.PrintOldRecords;
import com.startjavanew.GameGuessNumber.DataClear.ClearAttempts;
import com.startjavanew.GameGuessNumber.InputData.InputAmountPlayers;
import com.startjavanew.GameGuessNumber.ObjectClasses.Players;
import com.startjavanew.GameGuessNumber.ObjectClasses.StorageArray.PrintAllAttempts;

public class AfterGame {
    public void afterGame(Players actualPlayer) {

        PrintAllAttempts printAllAttempts = new PrintAllAttempts();//Вывод всех названных игроками вариантов.
        printAllAttempts.printAttempts(actualPlayer);

        //Вывод теоретической таблицы старых рекордов.

        ClearAttempts clearAttempts = new ClearAttempts();//Очистка заполненных вариантов
        clearAttempts.clear();

        for (int i = 0; i < InputAmountPlayers.amountPlayers; i++) {//Обнуление номера варианта(попытки).
            GameMain.player.get(i).countAttemptsPlayers.setcountAttempts(0);
        }
        GameMain.player.removeAll(GameMain.player);//Очистка имен.
    }
}